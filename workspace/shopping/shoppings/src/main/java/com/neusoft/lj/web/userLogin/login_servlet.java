package com.neusoft.lj.web.userLogin;

import com.neusoft.lj.entity.Users;
import com.neusoft.lj.service.Users_server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login.do")
public class login_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users_server userver = new Users_server();
        Users users = new Users();
        users.setAccount(req.getParameter("account"));
        users.setPassword(req.getParameter("password"));
        users = userver.logIn(users);
        if(users == null){
            resp.sendRedirect("/btst_76_zpets/404.jsp");
        }else{
            //req.setAttribute("users",users);
            //req.getRequestDispatcher("/btst_76_zpets/index.jsp").forward(req,resp);
            HttpSession session = req.getSession();
            session.setAttribute("users",users);
            resp.sendRedirect("/cpts_1106_bqn/index.jsp");
        }
    }
}
