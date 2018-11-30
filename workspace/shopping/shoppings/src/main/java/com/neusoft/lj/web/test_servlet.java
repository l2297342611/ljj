package com.neusoft.lj.web;

import com.neusoft.lj.entity.Employee_Entity;
import com.neusoft.lj.entity.Users;
import com.neusoft.lj.service.Employee_Service;
import com.neusoft.lj.service.Users_server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test.do")
public class test_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String account = req.getParameter("account");
        String method = req.getParameter("method");
        PrintWriter out = resp.getWriter();
        boolean flag = false;
        if(method.equals("user")){
            Users_server userver = new Users_server();
            Users users = userver.findUser(account);
            if(users != null){
                flag = true;
            }
        }else {
            Employee_Service eserver = new Employee_Service();
            Employee_Entity entity = eserver.findEmployee(account);
            if(entity != null){
                flag = true;
            }
        }
        Users_server userver = new Users_server();
        Users users = userver.findUser(account);

        if(flag){
            out.write("用户名已存在！！！");
            out.close();
            return;
        }else{
            out.write("");
            out.close();
            return;
        }

    }
}
