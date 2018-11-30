package com.neusoft.lj.entity;

public class Sale_Entity {

    private int saleno;
    private int goodsno;
    private int salenum;
    private Double saleprice;
    private String saletime;
    private int uid;

    public int getSaleno() {
        return saleno;
    }

    public void setSaleno(int saleno) {
        this.saleno = saleno;
    }

    public int getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(int goodsno) {
        this.goodsno = goodsno;
    }

    public int getSalenum() {
        return salenum;
    }

    public void setSalenum(int salenum) {
        this.salenum = salenum;
    }

    public Double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Double saleprice) {
        this.saleprice = saleprice;
    }

    public String getSaletime() {
        return saletime;
    }

    public void setSaletime(String saletime) {
        this.saletime = saletime;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
