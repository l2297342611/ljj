package com.lj.neusoft.entity;

public class Goods_Entity {

    private int goodsno;
    private String goodsname;
    private Double price;
    private String goodsunit;
    private String goodsexp;
    private String goodsex;
    private int supplierno;
    private String image;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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

    @Override
    public String toString() {
        return "Goods_Entity{" +
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
}