package com.neusoft.lj.web.sale;

import com.neusoft.lj.entity.Sale_Entity;
import com.neusoft.lj.service.Sale_Service;
import com.neusoft.lj.utils.Page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Sale_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        String method = req.getParameter("method");
        Sale_Service service = new Sale_Service();
        if (null!=method&&method.equals("queryById")){
            String saleno = req.getParameter("saleno");
            Sale_Entity s = service.queryById(Integer.valueOf(saleno));
            req.setAttribute("sale",s);
            req.getRequestDispatcher("").forward(req,resp);
        }else{
            String pageNo = req.getParameter("pageNo");
            Page<Sale_Entity> page = new Page<Sale_Entity>();
            if (null!=pageNo){
                page.setCurenPage(Integer.valueOf(pageNo));
            }
            Page<Sale_Entity> pages = service.QueryByPage(page);
            req.setAttribute("page",pages);
            req.getRequestDispatcher("").forward(req,resp);
        }
    }
}
