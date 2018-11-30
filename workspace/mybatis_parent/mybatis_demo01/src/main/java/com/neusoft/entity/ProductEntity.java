package com.neusoft.entity;

/**
 * @program: mybatis_parent
 * @Date: 2018/11/23 16:20
 * @Author: Mr.Li
 * @Description:
 */
public class ProductEntity {

    private int goodsno;
    private String goodsname;
    private double price;
    private String goodsunit;
    private String goodsexp;
    private String goodsex;
    private int supplierno;
    private String image;

    public ProductEntity(String goodsname, double price, String goodsunit, String goodsexp, String goodsex, int supplierno, String image) {
        this.goodsname = goodsname;
        this.price = price;
        this.goodsunit = goodsunit;
        this.goodsexp = goodsexp;
        this.goodsex = goodsex;
        this.supplierno = supplierno;
        this.image = image;
    }

    public ProductEntity() {
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "goodsno=" + goodsno +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", goodsunit='" + goodsunit + '\'' +
                ", goodsexp='" + goodsexp + '\'' +
                ", goodsex='" + goodsex + '\'' +
                ", supplierno=" + supplierno +
                ", image='" + image + '\'' +
                '}';
    }

    public int getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(int goodsno) {
        this.goodsno = goodsno;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodsunit() {
        return goodsunit;
    }

    public void setGoodsunit(String goodsunit) {
        this.goodsunit = goodsunit;
    }

    public String getGoodsexp() {
        return goodsexp;
    }

    public void setGoodsexp(String goodsexp) {
        this.goodsexp = goodsexp;
    }

    public String getGoodsex() {
        return goodsex;
    }

    public void setGoodsex(String goodsex) {
        this.goodsex = goodsex;
    }

    public int getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(int supplierno) {
        this.supplierno = supplierno;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
