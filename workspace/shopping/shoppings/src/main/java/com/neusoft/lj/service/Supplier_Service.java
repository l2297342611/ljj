package com.neusoft.lj.service;

import com.neusoft.lj.dao.SupplierDAOImpl;
import com.neusoft.lj.entity.Supplier_Entity;

import java.util.List;

public class Supplier_Service {

    private SupplierDAOImpl dao = new SupplierDAOImpl();

    public List<Supplier_Entity> queryAllsupplier(){
        String sql ="select * from supplierinfo";
        return dao.executeQurey(sql,null);
    }

    public Supplier_Entity queryById(int supplierno){
        String sql ="select *from supplierno where supplierno = ?";
        Object[] objects = new Object[]{
                supplierno
        };
        List<Supplier_Entity> list =dao.executeQurey(sql,objects);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    public int updatesupplier(Supplier_Entity su){
        String sql ="update supplierinfo set suppliername = ?, supplierceo = ?, contact = ?, tel = ?, addresss = ? where supplierno = ?";
        Object[] objects = new Object[]{
                su.getSuppliername(),
                su.getSupplierCEO(),
                su.getContact(),
                su.getTel(),
                su.getAddress(),
                su.getSupplierno()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int insertsupplier(Supplier_Entity su){
        String sql ="insert into supplierinfo value(null,?,?,?,?,?)";
        Object[] objects = new Object[]{
                su.getSuppliername(),
                su.getSupplierCEO(),
                su.getContact(),
                su.getTel(),
                su.getAddress()
        };
        return dao.executeUpdate(sql,objects);
    }

    public int deletesupplier(int supplierno){
        String sql ="delete from supplierinfo where suppilerno=?";
        Object[] objects = new Object[]{supplierno};
        return dao.executeUpdate(sql,objects);
    }
}
