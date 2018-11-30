package com.neusoft.lj.web.supplier;

import com.neusoft.lj.entity.Supplier_Entity;
import com.neusoft.lj.service.Supplier_Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Supplier_Modify extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String method = req.getParameter("method");
        String supplierno = req.getParameter("supplierno");
        String suppliername = req.getParameter("suppliername");
        String supplierCEO = req.getParameter("supplierCEO");
        String contact = req.getParameter("contact");
        String tel = req.getParameter("tel");
        String address = req.getParameter("address");
        Supplier_Service service = new Supplier_Service();
        int flag = -1;

        if (null!=method&&method.equals("insert")){
            Supplier_Entity s = new Supplier_Entity();
            s.setSuppliername(suppliername);
            s.setSupplierCEO(supplierCEO);
            s.setContact(contact);
            s.setTel(tel);
            s.setAddress(address);
            flag = service.insertsupplier(s);
        }else if (method.equals("delete")){
            flag = service.deletesupplier(Integer.valueOf(supplierno));
        }else if (method.equals("update")){
            Supplier_Entity s = new Supplier_Entity();
            s.setSupplierno(Integer.valueOf(supplierno));
            s.setSuppliername(suppliername);
            s.setSupplierCEO(supplierCEO);
            s.setContact(contact);
            s.setTel(tel);
            s.setAddress(address);
            flag = service.updatesupplier(s);
        }

        if (flag>0)
            req.getRequestDispatcher("").forward(req,resp);
        else
            resp.sendRedirect("");
    }
}
