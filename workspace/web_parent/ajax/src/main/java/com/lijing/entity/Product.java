package com.lijing.entity;

/**
 * @program: web_parent
 * @Date: 2018/11/16 10:44
 * @Author: Mr.Li
 * @Description:
 */
public class Product {

    private int pid;
    private String pname;
    private double price;

    public Product() { }

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }
}
