package com.lj.neusoft.dao;

import com.lj.neusoft.entity.Goods_Entity;
import com.lj.neusoft.util.ConnectionFactory;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GoodsDAOImpl extends ConnectionFactory<Goods_Entity> {
    public List<Goods_Entity> rsToList(ResultSet rs) {
        List<Goods_Entity> list = new ArrayList<>();
        try {
            while (rs.next()){
                Goods_Entity g = new Goods_Entity();
                g.setGoodsno(rs.getInt("goodsno"));
                g.setGoodsname(rs.getString("goodsname"));
                g.setPrice(rs.getDouble("price"));
                g.setGoodsunit(rs.getString("goodsunit"));
                g.setGoodsexp(rs.getString("goodsexp"));
                g.setGoodsex(rs.getString("goodsex"));
                g.setSupplierno(rs.getInt("supplierno"));
                g.setImage(rs.getString("image"));
                list.add(g);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }
}
