package com.neusoft.dao.mapper;

import com.neusoft.entity.ProductEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: mybatis_parent
 * @Date: 2018/11/23 16:28
 * @Author: Mr.Li
 * @Description:
 */
public interface ProductMapper {

    List<ProductEntity> queryAllPro();
    int insertPro(ProductEntity productEntity);
    int deletePro(@Param("goodsno") int goodsno);
    int updatePro(ProductEntity productEntity);
}
