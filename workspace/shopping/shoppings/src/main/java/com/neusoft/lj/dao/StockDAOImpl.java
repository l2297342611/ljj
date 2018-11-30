package com.neusoft.lj.dao;

import com.neusoft.lj.entity.Stock_Entity;
import com.neusoft.lj.utils.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockDAOImpl extends ConnectionFactory<Stock_Entity> {
    public List<Stock_Entity> rsToList(ResultSet rs){
        List<Stock_Entity> list = new ArrayList<>();
        try {
            while (rs.next()){
                Stock_Entity st = new Stock_Entity();
                st.setStockno(rs.getInt("stockno"));
                st.setGoodsno(rs.getInt("goodsno"));
                st.setRetailprice(rs.getDouble("retailprice"));
                st.setStocknum(rs.getInt("stocknum"));
                st.setStocktime(rs.getString("stocktime"));
                list.add(st);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
