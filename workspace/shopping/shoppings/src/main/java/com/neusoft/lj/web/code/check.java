package com.neusoft.lj.web.code;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/check.do")
public class check extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String code = req.getParameter("code");
        PrintWriter out = resp.getWriter();
        if(code == null || code.trim()==""){
            out.print("<script>alert('请输入验证码');window.location.href('index.jsp')</script>");
        }else {
            if(code.equalsIgnoreCase((String) req.getSession().getAttribute("checkCode"))){
                req.getRequestDispatcher("upload.jsp").forward(req,resp);
            }else{
                out.print("<script>alert('验证码错误！！！请重新输入！！！');history.back(-1);</script>");
            }
        }
        out.close();
    }
}
