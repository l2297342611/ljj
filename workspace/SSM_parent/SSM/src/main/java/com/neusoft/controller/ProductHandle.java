package com.neusoft.controller;

import com.neusoft.entity.ProductEntity;
import com.neusoft.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: springMVC_parent
 * @Date: 2018/11/27 16:51
 * @Author: Mr.Li
 * @Description:
 */
@Controller
@RequestMapping("/pro")
public class ProductHandle {

    @Autowired
    private ProductService service;

    @RequestMapping("/queryPro.do")
    public ModelAndView queryProduct() throws Exception{
        ModelAndView modelAndView = new ModelAndView("showPro");
        modelAndView.addObject("goods",service.selectAll(1,3));
        return modelAndView;
    }

    @RequestMapping("/queryByGoodsno.do")
    public ModelAndView queryByGoodsno(int goodsno) throws Exception{
        ProductEntity productEntity = service.selectByPrimaryKey(goodsno);
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("goods",productEntity);
        return modelAndView;
    }

    @RequestMapping("/insertPro.do")
    public String insertPro(ProductEntity productEntity) throws Exception{
         service.insert(productEntity);
         return "redirect:/pro/queryPro.do";
    }


    @RequestMapping("/deletePro.do")
    public String deletePro(int goodsno) throws Exception{
        service.deleteByPrimaryKey(goodsno);
        return "redirect:/pro/queryPro.do";
    }

    @RequestMapping("/updatePro.do")
    public String updatePro(ProductEntity productEntity) throws Exception{
        service.updateByPrimaryKey(productEntity);
        return "redirect:/pro/queryPro.do";
    }

}
