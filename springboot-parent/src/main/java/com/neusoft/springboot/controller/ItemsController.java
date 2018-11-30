package com.neusoft.springboot.controller;

import com.github.pagehelper.PageInfo;
import com.neusoft.springboot.domain.Items;
import com.neusoft.springboot.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {

    @Autowired
    private ItemsService service;

    @GetMapping(value = {"/items.do"})
    public Items queryItem(Integer id)
    {
        return service.queryByID(id);
    }

    @GetMapping(value = {"/queryall.do"})
    public PageInfo<Items> queryAll()
    {
        return service.queryAll();
    }
}
