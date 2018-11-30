package com.neusoft.lj.entity;

public class Order_Entity {

    private int orderno;
    private int uid;
    private int supplierno;
    private String orderStatus;//状态
    private String shippingAddressno;//收货地址

    public int getOrderno() {
        return orderno;
    }

    public void setOrderno(int orderno) {
        this.orderno = orderno;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(int supplierno) {
        this.supplierno = supplierno;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getShippingAddressno() {
        return shippingAddressno;
    }

    public void setShippingAddressno(String shippingAddressno) {
        this.shippingAddressno = shippingAddressno;
    }
}
