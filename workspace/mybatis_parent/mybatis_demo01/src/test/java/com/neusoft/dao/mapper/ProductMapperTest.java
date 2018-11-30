package com.neusoft.dao.mapper;

import com.neusoft.entity.ProductEntity;
import com.neusoft.util.SqlSessionFactoryUitl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: mybatis_parent
 * @Date: 2018/11/23 16:40
 * @Author: Mr.Li
 * @Description:
 */
public class ProductMapperTest {

    @Test
    public void queryAllPro() {
        SqlSession sqlSession = SqlSessionFactoryUitl.openSqlSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        List<ProductEntity> list = mapper.queryAllPro();
        System.out.println(list.size());
    }

    @Test
    public void insertPro() {
        SqlSession sqlSession = SqlSessionFactoryUitl.openSqlSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        ProductEntity productEntity = new ProductEntity("朱森林",98.98,
                "只", "一年","sadsa",4,"猪");
        mapper.insertPro(productEntity);
        sqlSession.commit();
    }

    @Test
    public void deletePro() {
        SqlSession sqlSession = SqlSessionFactoryUitl.openSqlSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        mapper.deletePro(3);
        sqlSession.commit();
    }

    @Test
    public void updatePro() {
        SqlSession sqlSession = SqlSessionFactoryUitl.openSqlSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        ProductEntity productEntity = new ProductEntity("朱森林",98.98,
                "个", "一年","sadsa",4,"猪");
        productEntity.setGoodsno(1);
        mapper.updatePro(productEntity);
        sqlSession.commit();
    }
}