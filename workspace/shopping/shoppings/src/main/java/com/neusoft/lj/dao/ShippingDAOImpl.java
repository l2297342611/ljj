package com.neusoft.lj.dao;

import com.neusoft.lj.entity.Shipping_Entity;
import com.neusoft.lj.utils.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShippingDAOImpl extends ConnectionFactory<Shipping_Entity> {
    public List<Shipping_Entity> rsToList(ResultSet rs){
        List<Shipping_Entity> list = new ArrayList<>();
        try {
            while (rs.next()){
                Shipping_Entity sh = new Shipping_Entity();
                sh.setShippingAdressno(rs.getInt("shippingadressno"));
                sh.setShippingAdress(rs.getString("shippingadress"));
                list.add(sh);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
