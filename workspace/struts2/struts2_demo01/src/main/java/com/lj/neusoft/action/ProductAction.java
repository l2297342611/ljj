package com.lj.neusoft.action;

import com.lj.neusoft.entity.Goods_Entity;
import com.lj.neusoft.service.Goods_Service;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * @program: struts2
 * @Date: 2018/11/20 11:49
 * @Author: Mr.Li
 * @Description:
 */
public class ProductAction extends ActionSupport {

    private Goods_Entity goodsEntity;

    public Goods_Entity getGoodsEntity() {
        return goodsEntity;
    }

    public void setGoodsEntity(Goods_Entity goodsEntity) {
        this.goodsEntity = goodsEntity;
    }

    Goods_Service gservice = new Goods_Service();

    public String login(){
        System.out.println("login方法");
        gservice.queryAllGoods();
        return SUCCESS;
    }

    public String update_Product(){
        System.out.println("update方法");
        return "update";
    }

    public String insert_Product(){
        System.out.println("insert方法");
        gservice.insertgoods(goodsEntity);
        return "insert";
    }

    public String delete_Product(){
        System.out.println("delete方法");
        return "delete";
    }

    private List<Goods_Entity> resultList;

    public String select_Product(){
        System.out.println("select方法");
        resultList = gservice.queryAllGoods();
        System.out.println(resultList);
        return "select";
    }


}
