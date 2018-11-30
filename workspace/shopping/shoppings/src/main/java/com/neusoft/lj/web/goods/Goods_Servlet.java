package com.neusoft.lj.web.goods;

import com.alibaba.druid.sql.ast.statement.SQLIfStatement;
import com.neusoft.lj.entity.Goods_Entity;
import com.neusoft.lj.service.Goods_Service;
import com.neusoft.lj.utils.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/query_goods.do")
public class Goods_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        String method =req.getParameter("method");
        Goods_Service service = new Goods_Service();
        if (null!=method&&method.equals("queryById")){
            String goodsno = req.getParameter("goodsno");
            Goods_Entity g = service.queryById(Integer.valueOf(goodsno));
            req.setAttribute("goods",g);
            req.getRequestDispatcher("text2.jsp").forward(req,resp);
        }else{
            String pageNo = req.getParameter("pageNo");
            Page<Goods_Entity> page = new Page<Goods_Entity>();
            if(null!=pageNo){
                page.setCurenPage(Integer.valueOf(pageNo));
            }
            Page<Goods_Entity> pages = service.QueryByPage(page);
            req.setAttribute("page",pages);
            req.getRequestDispatcher("test1.jsp").forward(req,resp);
        }
    }
}
