package com.neusoft.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.dao.mapper.ProductEntityMapper;
import com.neusoft.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SSM_parent
 * @Date: 2018/11/29 16:32
 * @Author: Mr.Li
 * @Description:
 */
@Service
public class ProductService {

    @Autowired
    private ProductEntityMapper mapper;

    public int deleteByPrimaryKey(Integer goodsno){
        return mapper.deleteByPrimaryKey(goodsno);
    }

    public int insert(ProductEntity record){
        return mapper.insert(record);
    }

    public int insertSelective(ProductEntity record){
        return mapper.insertSelective(record);
    }

    public ProductEntity selectByPrimaryKey(Integer goodsno){
        return mapper.selectByPrimaryKey(goodsno);
    }

    public PageInfo<ProductEntity> selectAll(Integer pageNO, Integer pageSize){
        PageHelper.offsetPage(pageNO,pageSize);
        List<ProductEntity> list = mapper.selectAll();
        return new PageInfo<ProductEntity>(list);
    }

    public int updateByPrimaryKeySelective(ProductEntity record){
        return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ProductEntity record){
        return mapper.updateByPrimaryKey(record);
    }
}
