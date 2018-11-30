package com.lijing.web;

import com.google.gson.Gson;
import com.lijing.entity.EChart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: web_parent
 * @Date: 2018/11/16 15:10
 * @Author: Mr.Li
 * @Description:
 */
@WebServlet("/ECharts.do")
public class ECharts extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        EChart e = new EChart(new String[]{"衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"},new Integer[]{5, 20, 36, 10, 10, 20});
        Gson gson = new Gson();
        PrintWriter out = resp.getWriter();
        out.write(gson.toJson(e));
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
