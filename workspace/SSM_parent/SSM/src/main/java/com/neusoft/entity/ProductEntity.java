package com.neusoft.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductEntity implements Serializable {
    private Integer goodsno;

    private String goodsname;

    private BigDecimal price;

    private String goodsunit;

    private String goodsexp;

    private String goodsex;

    private Integer supplierno;

    private String image;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(Integer goodsno) {
        this.goodsno = goodsno;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGoodsunit() {
        return goodsunit;
    }

    public void setGoodsunit(String goodsunit) {
        this.goodsunit = goodsunit == null ? null : goodsunit.trim();
    }

    public String getGoodsexp() {
        return goodsexp;
    }

    public void setGoodsexp(String goodsexp) {
        this.goodsexp = goodsexp == null ? null : goodsexp.trim();
    }

    public String getGoodsex() {
        return goodsex;
    }

    public void setGoodsex(String goodsex) {
        this.goodsex = goodsex == null ? null : goodsex.trim();
    }

    public Integer getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(Integer supplierno) {
        this.supplierno = supplierno;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}