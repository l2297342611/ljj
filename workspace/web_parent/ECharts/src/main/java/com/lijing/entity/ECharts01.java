package com.lijing.entity;

import java.io.Serializable;

/**
 * @program: web_parent
 * @Date: 2018/11/16 15:50
 * @Author: Mr.Li
 * @Description:
 */
public class ECharts01 implements Serializable {
    private Object[] data;

    public ECharts01() {
    }

    public ECharts01(Object[] data) {
        this.data = data;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }
}
