package com.neusoft.lj.dao;

import com.neusoft.lj.entity.Order_Entity;
import com.neusoft.lj.utils.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl extends ConnectionFactory<Order_Entity> {
    public List<Order_Entity> rsToList(ResultSet rs) {
        List<Order_Entity> list = new ArrayList<>();
        try {
            while (rs.next()){
                Order_Entity o = new Order_Entity();
                o.setOrderno(rs.getInt("orderno"));
                o.setUid(rs.getInt("uid"));
                o.setSupplierno(rs.getInt("supplierno"));
                o.setOrderStatus(rs.getString("orderStatus"));
                o.setShippingAddressno(rs.getString("shippingaddressno"));
                list.add(o);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
