package com.neusoft.lj.web.sale;

import com.neusoft.lj.entity.Sale_Entity;
import com.neusoft.lj.service.Sale_Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Sale_Modify extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String method = req.getParameter("method");
        String saleno = req.getParameter("saleno");
        String goodsno = req.getParameter("goodsno");
        String salenum =req.getParameter("salenum");
        String saleprice = req.getParameter("saleprice");
        String saletime = req.getParameter("saletime");
        String uid = req.getParameter("uid");
        Sale_Service service = new Sale_Service();
        int flag = -1;

        if (null!=method&&method.equals("insert")){
            Sale_Entity s = new Sale_Entity();
            s.setGoodsno(Integer.valueOf(goodsno));
            s.setSalenum(Integer.valueOf(salenum));
            s.setSaleprice(Double.valueOf(saleprice));
            s.setSaletime(saletime);
            s.setUid(Integer.valueOf(uid));
            flag = service.insertsale(s);
        }else if(method.equals("delete")){
            flag = service.deletesale(Integer.valueOf(saleno));
        }else if (method.equals("update")){
            Sale_Entity s = new Sale_Entity();
            s.setSaleno(Integer.valueOf(saleno));
            s.setSaleno(Integer.valueOf(saleno));
            s.setGoodsno(Integer.valueOf(goodsno));
            s.setSalenum(Integer.valueOf(salenum));
            s.setSaleprice(Double.valueOf(saleprice));
            s.setSaletime(saletime);
            s.setUid(Integer.valueOf(uid));
            flag = service.updatesale(s);
        }

        if (flag>0)
            req.getRequestDispatcher("").forward(req,resp);
        else
            resp.sendRedirect("");
    }
}
