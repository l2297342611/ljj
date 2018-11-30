package com.neusoft.lj.web.userLogin;


import com.neusoft.lj.entity.Users;
import com.neusoft.lj.service.Users_server;
import com.neusoft.lj.web.code.CodeUtil;
import com.neusoft.lj.web.mail.MailUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/register.do")
public class register_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String code = request.getParameter("code");
        PrintWriter out = resp.getWriter();
        if(code == null || code.trim()==""){
            out.print("<script>alert('请输入验证码');window.location.href('index.jsp')</script>");


        }else {
            if(code.equalsIgnoreCase((String) request.getSession().getAttribute("checkCode"))){
                Users users = new Users();
                Users_server userver = new Users_server();
                users.setUname(request.getParameter("uname"));
                users.setIsenable(0);
                users.setBirth(request.getParameter("birth"));
                users.setAccount(request.getParameter("account"));
                users.setPassword(request.getParameter("password"));
                users.setMail(request.getParameter("mail"));
                users.setImage("/img/default.jpg" );
                String codes = CodeUtil.getCode();
                users.setCode(codes);
                users.setRegisterTime(new Date().toString());

                int a = userver.inset_User(users);
                if(a > 0){
                    new Thread(new MailUtil(request.getParameter("mail"),codes,request.getParameter("account"))).start();
                    out.print("<script>alert('注册成功！！！');history.back(-1);</script>");
                    resp.sendRedirect("/login/Login.jsp");
                    //request.getRequestDispatcher("/azmind_3_xd/index.jsp").forward(request,resp);
                }else{
                    resp.sendRedirect("/index.jsp");
                }
            }else{
                out.print("<script>alert('验证码错误！！！请重新输入！！！');history.back(-1);</script>");
            }
        }
        out.close();
    }

}
