package com.neusoft.controller;

import com.neusoft.dao.mapper.ProductEntityMapper;
import com.neusoft.entity.ProductEntity;
import com.neusoft.uitl.SqlSessionFactoryUitl;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @program: springMVC_parent
 * @Date: 2018/11/27 16:51
 * @Author: Mr.Li
 * @Description:
 */
@Controller
public class ProductHandle {
@RequestMapping("queryPro.do")
    public ModelAndView queryProduct() throws Exception{
        ModelAndView modelAndView = new ModelAndView("product");
        SqlSession sqlSession = SqlSessionFactoryUitl.openSqlSession();
        ProductEntityMapper mapper = sqlSession.getMapper(ProductEntityMapper.class);
        List<ProductEntity> list = mapper.selectAll();
        modelAndView.addObject("goods",list);
        return modelAndView;
    }

    /**
     *
     * @param productEntity
     * @return
     * @throws Exception
     */
    @RequestMapping("insertPro.do")
    public ModelAndView insertPro(ProductEntity productEntity, MultipartFile images, HttpServletRequest request) throws Exception{
    String filename = images.getOriginalFilename();
    if(null != images && filename != null && filename.length()>0){
        String path = request.getServletContext().getRealPath("img");
        File newFile = new File(path,filename);
        images.transferTo(newFile);
        productEntity.setImage(filename);
    }
    ModelAndView modelAndView = new ModelAndView("product");
    SqlSession sqlSession = SqlSessionFactoryUitl.openSqlSession();
    ProductEntityMapper mapper = sqlSession.getMapper(ProductEntityMapper.class);
    mapper.insert(productEntity);
    sqlSession.commit();

    List<ProductEntity> list = mapper.selectAll();
    modelAndView.addObject("goods",list);
    sqlSession.close();
    return modelAndView;
    }

}
