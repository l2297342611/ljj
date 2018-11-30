package com.lijing;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: web_parent
 * @Date: 2018/11/15 16:32
 * @Author: Mr.Li
 * @Description:
 */
@WebServlet("/ajax.do")
public class Test_Ajax extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String uname = req.getParameter("uname");
        System.out.println(uname);
        PrintWriter out = resp.getWriter();
        if(uname!=null&&uname.equals("a")){
            out.write("load成功！！！");
        }else if(uname.equals("b")){
            out.write("get成功！！！");
        }else if(uname.equals("c")){
            out.write("post成功！！！");
        }else if(uname.equals("d")){
            out.write("ajax成功！！！");
        }
        out.close();
    }
}
