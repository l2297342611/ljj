package com.neusoft.lj.web.supplier;

import com.neusoft.lj.entity.Supplier_Entity;
import com.neusoft.lj.service.Supplier_Service;
import com.neusoft.lj.utils.Page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Supplier_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        String method = req.getParameter("method");
        Supplier_Service service = new Supplier_Service();
        if (null!=method&&method.equals("queryById")){
            String supplierno = req.getParameter("supplierno");
            Supplier_Entity s = service.queryById(Integer.valueOf(supplierno));
            req.setAttribute("supplier",s);
            req.getRequestDispatcher("").forward(req,resp);
        }else{
            String pageNo = req.getParameter("pageNo");
            Page<Supplier_Entity> page = new Page<Supplier_Entity>();
            if (null!=pageNo){
                page.setCurenPage(Integer.valueOf(pageNo));
            }
            Page<Supplier_Entity> pages = service.QueryByPage(page);
            req.setAttribute("page",pages);
            req.getRequestDispatcher("").forward(req,resp);
        }
    }
}
