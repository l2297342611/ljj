package com.lj.neusoft.action;

import com.lj.neusoft.entity.Goods_Entity;
import com.lj.neusoft.service.Goods_Service;

/**
 * @program: struts2
 * @Date: 2018/11/20 11:49
 * @Author: Mr.Li
 * @Description:
 */
public class ProductAction extends BaseAction {

    private Goods_Entity goodsEntity;

    public Goods_Entity getGoodsEntity() {
        return goodsEntity;
    }

    public void setGoodsEntity(Goods_Entity goodsEntity) {
        this.goodsEntity = goodsEntity;
    }

    Goods_Service gservice = new Goods_Service();

    public String queryById_Product(){
        System.out.println("login方法");
        request.setAttribute("goodsEntity",gservice.queryById(goodsEntity.getGoodsno()));
        return "update";
    }

    public String update_Product(){
        System.out.println("update方法");
        gservice.updategoods(goodsEntity);
        return SUCCESS;
    }

    public String insert_Product(){
        System.out.println("insert方法");
        gservice.insertgoods(goodsEntity);
        return SUCCESS;
    }

    public String delete_Product(){
        System.out.println("delete方法");
        gservice.deletegoods(goodsEntity.getGoodsno());
        return SUCCESS;
    }


    public String select_Product(){
        System.out.println("select方法");
        request.setAttribute("goods",gservice.queryAllGoods());
        return "select";
    }


}
