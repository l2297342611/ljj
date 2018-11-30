package com.neusoft.lj.service;

import com.neusoft.lj.dao.GoodsDAOImpl;
import com.neusoft.lj.entity.Goods_Entity;
import com.neusoft.lj.utils.Page;

import java.util.List;

public class Goods_Service {
    private GoodsDAOImpl dao = new GoodsDAOImpl();

    public List<Goods_Entity> queryAllGoods(){
        String sql ="select * from goodsinfo";
        return  dao.executeQurey(sql,null);
}

    public Page<Goods_Entity> QueryByPage(Page page){
        List<Goods_Entity> list = this.queryAllGoods();
        int total = list.size();
        page.setTotalCount(total);

        String sql = "select * from goodsinfo LIMIT ?,?";
        Object[] objects = new Object[]{
                (page.getCurenPage()-1)*page.getPageSize(),
                page.getPageSize()
        };
        List<Goods_Entity> list1 = dao.executeQurey(sql,objects);
        page.setArrys(list1);
        return page;
    }

    public  Goods_Entity queryById(int goodsno){
        String sql ="select * from goodsinfo where goodsno=?";
        Object[] objects = new Object[]{
                goodsno
        };
        List<Goods_Entity> list = dao.executeQurey(sql,objects);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    public int updategoods(Goods_Entity g){
        String sql = "update goodsinfo set goodsname = ?, price = ?, goodsunit = ?,goodsexp = ?, goodsex = ?, supplierno = ? ,image=? where goodsno = ?";
        Object[] objects = new Object[]{
                g.getGoodsname(),
                g.getPrice(),
                g.getGoodsunit(),
                g.getGoodsexp(),
                g.getGoodsex(),
                g.getSupplierno(),
                g.getImage(),
                g.getGoodsno()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int insertgoods(Goods_Entity g){
        String sql = "insert into goodsinfo value(null,?,?,?,?,?,?,?,?)";
        Object[] objects = new Object[]{
                g.getGoodsname(),
                g.getPrice(),
                g.getGoodsunit(),
                g.getGoodsexp(),
                g.getGoodsex(),
                g.getSupplierno(),
                g.getImage()
        };
        return dao.executeUpdate(sql,objects);
    }

    public  int deletegoods(int goodsno){
        String sql ="delete from goodsinfo where goodsno = ?";
        Object[] objects = new Object[]{
                goodsno
        };
        return dao.executeUpdate(sql,objects);
    }
}
