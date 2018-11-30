package com.neusoft.springboot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.springboot.dao.mapper.ItemsMapper;
import com.neusoft.springboot.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemsService {

    @Resource
    private ItemsMapper itemsMapper;

    public Items queryByID(Integer id)
    {
        return itemsMapper.selectByPrimaryKey(id);
    }

    public PageInfo<Items> queryAll()
    {
        PageHelper.offsetPage(0,2);
        List<Items> list = itemsMapper.queryAll();
        return new PageInfo<>(list);
    }
}
