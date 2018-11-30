package com.neusoft.lj.web.order;

import com.neusoft.lj.entity.Order_Entity;
import com.neusoft.lj.service.Order_Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Order_Modify extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String method = req.getParameter("method");
        String orderno = req.getParameter("orderno");
        String uid = req.getParameter("uid");
        String supplierno = req.getParameter("supplierno");
        String orderStatus = req.getParameter("orderStatus");
        String shippingAddressno = req.getParameter("shippingAddressno");
        Order_Service service = new Order_Service();
        int flag =-1;

        if (null!=method&&method.equals("insert")){
            Order_Entity o = new Order_Entity();
            o.setUid(Integer.valueOf(uid));
            o.setSupplierno(Integer.valueOf(supplierno));
            o.setOrderStatus(orderStatus);
            o.setShippingAddressno(Integer.valueOf(shippingAddressno));
            flag = service.insertorder(o);
        }else if(method.equals("delete")){
            flag = service.deleteorder(Integer.valueOf(orderno));
        }else if (method.equals("update")){
            Order_Entity o = new Order_Entity();
            o.setOrderno(Integer.valueOf(orderno));
            o.setUid(Integer.valueOf(uid));
            o.setSupplierno(Integer.valueOf(supplierno));
            o.setOrderStatus(orderStatus);
            o.setShippingAddressno(Integer.valueOf(shippingAddressno));
            flag = service.updateorder(o);
        }

        if (flag>0)
            req.getRequestDispatcher("").forward(req,resp);
        else
            resp.sendRedirect("");
    }
}
