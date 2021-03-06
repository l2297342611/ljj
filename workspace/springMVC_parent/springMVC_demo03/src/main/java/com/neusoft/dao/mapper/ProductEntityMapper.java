package com.neusoft.dao.mapper;

import com.neusoft.entity.ProductEntity;

import java.util.List;

public interface ProductEntityMapper {
    int deleteByPrimaryKey(Integer goodsno);

    int insert(ProductEntity record);

    int insertSelective(ProductEntity record);

    ProductEntity selectByPrimaryKey(Integer goodsno);

    List<ProductEntity> selectAll();

    int updateByPrimaryKeySelective(ProductEntity record);

    int updateByPrimaryKey(ProductEntity record);
}