package com.neusoft.lj.web.order;

import com.neusoft.lj.entity.Order_Entity;
import com.neusoft.lj.service.Order_Service;
import com.neusoft.lj.utils.Page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Order_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        String method = req.getParameter("method");
        Order_Service service = new Order_Service();
        if (null!=method&&method.equals("queryById")){
            String orderno = req.getParameter("orderno");
            Order_Entity o = service.queryById(Integer.valueOf(orderno));
            req.setAttribute("order",o);
            req.getRequestDispatcher("").forward(req,resp);
        }else{
            String pageNo = req.getParameter("pageNo");
            Page<Order_Entity> page = new Page<Order_Entity>();
            if (null!=pageNo){
                page.setCurenPage(Integer.valueOf(pageNo));
            }
            Page<Order_Entity> pages = service.QueryByPage(page);
            req.setAttribute("page",pages);
            req.getRequestDispatcher("").forward(req,resp);
        }
    }
}
