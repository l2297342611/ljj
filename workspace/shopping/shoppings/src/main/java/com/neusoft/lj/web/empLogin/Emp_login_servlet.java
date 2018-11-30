package com.neusoft.lj.web.empLogin;

import com.neusoft.lj.entity.Employee_Entity;
import com.neusoft.lj.service.Employee_Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/emp_login.do")
public class Emp_login_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Employee_Service eserver = new Employee_Service();
        Employee_Entity entity = new Employee_Entity();
        entity.setAccount(req.getParameter("account"));
        entity.setPassword(req.getParameter("password"));
        entity = eserver.logIn(entity);
        if(entity == null){
            resp.sendRedirect("/btst_76_zpets/404.jsp");
        }else{
            HttpSession session = req.getSession();
            session.setAttribute("entity",entity);
            resp.sendRedirect("/cpts_1106_bqn/index.jsp");
        }
    }
}
