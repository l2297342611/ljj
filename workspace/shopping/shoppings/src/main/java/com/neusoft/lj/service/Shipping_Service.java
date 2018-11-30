package com.neusoft.lj.service;

import com.neusoft.lj.dao.ShippingDAOImpl;
import com.neusoft.lj.entity.Shipping_Entity;

import java.util.List;

public class Shipping_Service {
    private ShippingDAOImpl dao = new ShippingDAOImpl();

    public List<Shipping_Entity> queryAllshipping() {
        String sql = "select * from shippingadress";
        return dao.executeQurey(sql, null);
    }

    public Shipping_Entity queryById(int shippingAdressno){
        String sql ="select * from shippingadress where shippingAdressno = ?";
        Object[] objects = new Object[]{shippingAdressno};
        List<Shipping_Entity> list = dao.executeQurey(sql,objects);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    public int updateshipping(Shipping_Entity sh){
        String sql ="update shippingadress set shippingAdress = ?, uid = ? where shippingAdressno = ?";
        Object[] objects = new Object[]{
                sh.getShippingAdress(),
                sh.getUid(),
                sh.getShippingAdressno()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int insertshipping(Shipping_Entity sh){
        String sql ="insert into shippingadress value(null,?,?)";
        Object[] objects = new Object[]{
                sh.getShippingAdress(),
                sh.getUid()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int deletesale(int shippingAdressno){
        String sql ="delete from shippingadress where shippingAdressno = ?";
        Object[] objects = new Object[]{shippingAdressno};
        return dao.executeUpdate(sql,objects);
    }
}
