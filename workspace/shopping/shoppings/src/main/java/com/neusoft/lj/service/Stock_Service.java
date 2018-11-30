package com.neusoft.lj.service;

import com.neusoft.lj.dao.StockDAOImpl;
import com.neusoft.lj.entity.Stock_Entity;

import java.util.List;

public class Stock_Service {
    private StockDAOImpl dao = new StockDAOImpl();

    public List<Stock_Entity> queryAllstock(){
        String sql = "select * from stockinfo";
        return dao.executeQurey(sql,null);
    }

    public Stock_Entity queryById(int stockno){
        String sql ="select * from stockinfo where stockno = ?";
        Object[] objects = new Object[]{stockno};
        List<Stock_Entity> list = dao.executeQurey(sql,objects);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    public int updatestock(Stock_Entity st){
        String sql ="update stockinfo set goodsno = ?, retailprice = ?, stocknum = ?, stocktime = ? where stockno = ?";
        Object[] objects = new Object[]{
                st.getGoodsno(),
                st.getRetailprice(),
                st.getStocknum(),
                st.getStocktime(),
                st.getStockno()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int insertstock(Stock_Entity st){
        String sql ="insert into stockinfo value(null,?,?,?,?)";
        Object[] objects = new Object[]{
                st.getGoodsno(),
                st.getRetailprice(),
                st.getStocknum(),
                st.getStocktime()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int deletestock(int stockno){
        String sql ="delete from stockinfo where stockno = ?";
        Object[] objects = new Object[]{stockno};
        return dao.executeUpdate(sql,objects);
    }
}
