package com.neusoft.lj.web.empLogin;

import com.neusoft.lj.entity.Employee_Entity;
import com.neusoft.lj.service.Employee_Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/emp_register.do")
public class Emp_register_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Employee_Entity entity = new Employee_Entity();
        Employee_Service eserver = new Employee_Service();
        entity.setEname(req.getParameter("ename"));
        entity.setPhone(req.getParameter("phone"));
        entity.setAccount(req.getParameter("account"));
        entity.setPassword(req.getParameter("password"));
        entity.setIsadmin(req.getParameter("isadmin"));
        entity.setIsenable(req.getParameter("isenable"));
        entity.setJob(Integer.valueOf(req.getParameter("job")));
        int a = eserver.insertEmployee(entity);
        if(a > 0){
            resp.sendRedirect("/azmind_3_xd/index.jsp");
        }else{
            resp.sendRedirect("/btst_76_zpets/404.jsp");
        }
    }
}
