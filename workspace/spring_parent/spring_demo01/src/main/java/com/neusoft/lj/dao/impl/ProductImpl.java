package com.neusoft.lj.dao.impl;

import com.neusoft.lj.dao.ProductDAO;

import java.util.Date;

/**
 * @program: spring_parent
 * @Date: 2018/11/22 10:34
 * @Author: Mr.Li
 * @Description:
 */
public class ProductImpl implements ProductDAO {

    private String goodsName;
    private double price;
    private Date today;

    public ProductImpl() {
    }

    public ProductImpl(String goodsName, double price, Date today) {
        this.goodsName = goodsName;
        this.price = price;
        this.today = today;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public void findGoods() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ProductImpl{" +
                "goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", today=" + today +
                '}';
    }
}
