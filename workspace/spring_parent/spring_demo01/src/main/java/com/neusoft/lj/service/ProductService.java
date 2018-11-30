package com.neusoft.lj.service;

import com.neusoft.lj.dao.ProductDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_parent
 * @Date: 2018/11/22 10:41
 * @Author: Mr.Li
 * @Description:
 */
public class ProductService {

    public static void main(String[] arg){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ProductDAO dao = (ProductDAO) context.getBean("ProductDAO");
        dao.findGoods();
        ProductDAO daos = (ProductDAO) context.getBean("product");
        daos.findGoods();

    }
}
