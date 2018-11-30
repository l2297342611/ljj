package com.neusoft.lj.dao;

import com.neusoft.lj.entity.Supplier_Entity;
import com.neusoft.lj.utils.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierDAOImpl extends ConnectionFactory<Supplier_Entity> {

    public List<Supplier_Entity> rsToList(ResultSet rs){
        List<Supplier_Entity> list = new ArrayList<>();
        try {
            while (rs.next()){
                Supplier_Entity su = new Supplier_Entity();
                su.setSupplierno(rs.getInt("supplierno"));
                su.setSuppliername(rs.getString("suppliername"));
                su.setSupplierCEO(rs.getString("supplierceo"));
                su.setContact(rs.getString("contact"));
                su.setTel(rs.getString("tel"));
                su.setAddress(rs.getString("address"));
                list.add(su);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
