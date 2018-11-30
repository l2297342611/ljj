package com.neusoft.lj.service;

import com.neusoft.lj.dao.OrderDAOImpl;
import com.neusoft.lj.entity.Order_Entity;

import java.util.List;

public class Order_Service {
    private OrderDAOImpl dao = new OrderDAOImpl();

    public List<Order_Entity> queryAllorder() {
        String sql = "select * from order";
        return dao.executeQurey(sql, null);
    }

    public Order_Entity queryById(int orderno){
        String sql ="select * from order where orderno = ?";
        Object[] objects = new Object[]{orderno};
        List<Order_Entity> list = dao.executeQurey(sql,objects);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    public int updateorder(Order_Entity o){
        String sql ="update stockinfo set uid = ?, supplierno = ?, orderStatus = ?, shippingAddressno = ? where orderno = ?";
        Object[] objects = new Object[]{
                o.getUid(),
                o.getSupplierno(),
                o.getOrderStatus(),
                o.getShippingAddressno(),
                o.getOrderno()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int insertorder(Order_Entity o){
        String sql ="insert into order value(null,?,?,?,?)";
        Object[] objects = new Object[]{
                o.getUid(),
                o.getSupplierno(),
                o.getOrderStatus(),
                o.getShippingAddressno()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int deleteorder(int orderno){
        String sql ="delete from order where orderno = ?";
        Object[] objects = new Object[]{orderno};
        return dao.executeUpdate(sql,objects);
    }
}
