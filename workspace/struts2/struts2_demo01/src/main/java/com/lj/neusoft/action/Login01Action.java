package com.lj.neusoft.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @program: struts2
 * @Date: 2018/11/20 10:35
 * @Author: Mr.Li
 * @Description:
 */
public class Login01Action extends ActionSupport {
    public String login (){
        System.out.println("进入login方法了");
        return "success";
    }
}
