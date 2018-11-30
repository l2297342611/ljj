package com.neusoft.dao.mapper;

import com.neusoft.entity.ProductEntity;
import com.neusoft.uitl.SqlSessionFactoryUitl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: mybatis_parent
 * @Date: 2018/11/26 11:07
 * @Author: Mr.Li
 * @Description:
 */
public class ProductEntityMapperTest {

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }



    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectAll() {
        SqlSession sqlSession = SqlSessionFactoryUitl.openSqlSession();
        ProductEntityMapper mapper = sqlSession.getMapper(ProductEntityMapper.class);
        List<ProductEntity> list = mapper.selectAll();
        System.out.println(list.size());
    }

    @Test
    public void selectByGoodsexp() {
        SqlSession sqlSession = SqlSessionFactoryUitl.openSqlSession();
        ProductEntityMapper mapper = sqlSession.getMapper(ProductEntityMapper.class);
        ProductEntity productEntity = new ProductEntity();
        productEntity.setGoodsname("朱森林");
        mapper.selectByGoodsexp(productEntity);

    }
}