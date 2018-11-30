package com.neusoft.lj.dao;

import com.neusoft.lj.entity.Sale_Entity;
import com.neusoft.lj.utils.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SaleDAOImpl extends ConnectionFactory<Sale_Entity> {
    public List<Sale_Entity> rsToList(ResultSet rs) {
        List<Sale_Entity> list = new ArrayList<>();
        try {
            while (rs.next()) {
                Sale_Entity sa = new Sale_Entity();
                sa.setSaleno(rs.getInt("saleno"));
                sa.setGoodsno(rs.getInt("goodsno"));
                sa.setSalenum(rs.getInt("salenum"));
                sa.setSaleprice(rs.getDouble("saleprice"));
                sa.setSaletime(rs.getString("saletime"));
                sa.setUid(rs.getInt("uid"));
                list.add(sa);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
