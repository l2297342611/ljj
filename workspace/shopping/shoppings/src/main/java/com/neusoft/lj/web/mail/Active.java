package com.neusoft.lj.web.mail;


import com.neusoft.lj.entity.Users;
import com.neusoft.lj.service.Users_server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/active.do")
public class Active extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        String code = req.getParameter("codes");
        String account = req.getParameter("account");
        Users_server userver = new Users_server();
        Users users = userver.findUser(account);
        String checkCodes = users.getCode();
        String registerTime = users.getRegisterTime();
        if(code.equals(checkCodes)){
            out.print("<script>alert(0);</script>");
            users.setIsenable(1);
            userver.updateUser(users);
        }else{
            out.print("<script>alert('1');</script>");
        }
        out.close();
    }
}
