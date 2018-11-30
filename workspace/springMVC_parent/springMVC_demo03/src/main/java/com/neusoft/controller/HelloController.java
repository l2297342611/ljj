package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springMVC_parent
 * @Date: 2018/11/28 9:36
 * @Author: Mr.Li
 * @Description:
 */
@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping(value = "hello.do",method = {RequestMethod.POST,RequestMethod.GET},params = {"name","price=1"})
    public String hello(HttpServletRequest request, String name, double price) throws Exception{
        request.setCharacterEncoding("utf-8");
        request.setAttribute("name",name);
        request.setAttribute("price",price);
        return "forward:/queryPro.do";
    }
}
