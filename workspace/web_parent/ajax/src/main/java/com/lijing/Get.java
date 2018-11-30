package com.lijing;

import com.google.gson.Gson;
import com.lijing.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: web_parent
 * @Date: 2018/11/16 10:41
 * @Author: Mr.Li
 * @Description:
 */
@WebServlet("/get.do")
public class Get  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String uname = req.getParameter("uanme");
        String pwd = req.getParameter("pwd");
        Product product = new Product(4224,"娃哈哈",25.2);
        Gson gson = new Gson();
        PrintWriter out = resp.getWriter();
        out.write(gson.toJson(product));
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
