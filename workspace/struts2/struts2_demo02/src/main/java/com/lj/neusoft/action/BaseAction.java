package com.lj.neusoft.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.interceptor.ServletRequestAware;
import javax.servlet.http.HttpServletRequest;

/**
 * @program: struts2
 * @Date: 2018/11/21 15:50
 * @Author: Mr.Li
 * @Description:
 */
@ParentPackage("struts-default")
@Namespace("/")
public class BaseAction extends ActionSupport implements ServletRequestAware {

    protected HttpServletRequest request;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
}
