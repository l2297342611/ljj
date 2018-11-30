package com.neusoft.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: springMVC_parent
 * @Date: 2018/11/27 15:16
 * @Author: Mr.Li
 * @Description:
 */
public class HelloHandle implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("/aaa.jsp");
        return modelAndView;
    }
}
