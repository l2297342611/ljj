package com.lijing.web;

import com.google.gson.Gson;
import com.lijing.entity.ECharts01;
import com.lijing.entity.a1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: web_parent
 * @Date: 2018/11/16 15:51
 * @Author: Mr.Li
 * @Description:
 */
    @WebServlet("/ECharts02.do")
    public class ECharts02 extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
            resp.setContentType("application/json;charset=utf-8");
            a1 a1 = new a1(335,"直接访问121");
            a1 a2 = new a1(310,"邮件营销323");
            a1 a3 = new a1(274,"联盟广告445");
            a1 a4 = new a1(235,"视频广告2323");
            a1 a5 = new a1(400,"搜索引擎434");
            ECharts01 e = new ECharts01(new Object[]{a1,a2,a3,a4,a5});
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

