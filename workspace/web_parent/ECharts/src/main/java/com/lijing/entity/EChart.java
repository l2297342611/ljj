package com.lijing.entity;

import java.io.Serializable;

/**
 * @program: web_parent
 * @Date: 2018/11/16 15:10
 * @Author: Mr.Li
 * @Description:
 */
public class EChart implements Serializable {

    private Object categories;
    private Object data;

    public EChart() {
    }

    public EChart(Object categories, Object data) {
        this.categories = categories;
        this.data = data;
    }

    public Object getCategories() {
        return categories;
    }

    public void setCategories(Object categories) {
        this.categories = categories;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
