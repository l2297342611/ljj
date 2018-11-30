package com.neusoft.lj.service;

import com.neusoft.lj.dao.SaleDAOImpl;
import com.neusoft.lj.entity.Sale_Entity;

import java.util.List;

public class Sale_Service {
    private SaleDAOImpl dao = new SaleDAOImpl();

    public List<Sale_Entity> queryAllsale() {
        String sql = "select * from saleinfo";
        return dao.executeQurey(sql, null);
    }

    public Sale_Entity queryById(int saleno){
        String sql ="select * from saleinfo where saleno = ?";
        Object[] objects = new Object[]{saleno};
        List<Sale_Entity> list = dao.executeQurey(sql,objects);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    public int updatesale(Sale_Entity sa){
        String sql ="update stockinfo set goodsno = ?, salenum = ?, saleprice = ?, saletime = ?, uid = ? where saleno = ?";
        Object[] objects = new Object[]{
                sa.getGoodsno(),
                sa.getSalenum(),
                sa.getSaleprice(),
                sa.getSaletime(),
                sa.getUid(),
                sa.getSaleno()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int insertsale(Sale_Entity sa){
        String sql ="insert into stockinfo value(null,?,?,?,?,?)";
        Object[] objects = new Object[]{
                sa.getGoodsno(),
                sa.getSalenum(),
                sa.getSaleprice(),
                sa.getSaletime(),
                sa.getUid()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int deletesale(int saleno){
        String sql ="delete from stockinfo where saleno = ?";
        Object[] objects = new Object[]{saleno};
        return dao.executeUpdate(sql,objects);
    }
}
