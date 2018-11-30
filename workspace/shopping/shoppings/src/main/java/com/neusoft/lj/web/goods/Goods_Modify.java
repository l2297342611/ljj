package com.neusoft.lj.web.goods;

import com.neusoft.lj.entity.Goods_Entity;
import com.neusoft.lj.service.Goods_Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/modify_goods.do")
public class Goods_Modify extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String method = req.getParameter("method");
        String goodsno = req.getParameter("goodsno");
        String goodsname = req.getParameter("goodsname");
        String price = req.getParameter("price");
        String goodsunit = req.getParameter("goodsunit");
        String goodsexp = req.getParameter("goodsexp");
        String goodsex = req.getParameter("goodsex");
        String supplierno = req.getParameter("supplierno");
        String image = req.getParameter("image");
        Goods_Service service = new Goods_Service();
        int flag = -1;

        if (null!=method&&method.equals("insert")){
            Goods_Entity g = new Goods_Entity();
            g.setGoodsname(goodsname);
            g.setPrice(Double.valueOf(price));
            g.setGoodsunit(goodsunit);
            g.setGoodsexp(goodsexp);
            g.setGoodsex(goodsex);
            g.setSupplierno(Integer.valueOf(supplierno));
            g.setImage(image);
            flag = service.insertgoods(g);
        }else if(method.equals("delete")){
            flag = service.deletegoods(Integer.valueOf(goodsno));
        }else if (method.equals("update")){
            Goods_Entity g = new Goods_Entity();
            g.setGoodsno(Integer.valueOf(goodsno));
            g.setGoodsname(goodsname);
            g.setPrice(Double.valueOf(price));
            g.setGoodsunit(goodsunit);
            g.setGoodsexp(goodsexp);
            g.setGoodsex(goodsex);
            g.setSupplierno(Integer.valueOf(supplierno));
            g.setImage(image);
            flag = service.updategoods(g);
        }

        if (flag>0)
            req.getRequestDispatcher("query_goods.do").forward(req,resp);
        else
            resp.sendRedirect("index.jsp");
    }
}
