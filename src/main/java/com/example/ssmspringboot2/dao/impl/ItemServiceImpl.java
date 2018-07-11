package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.ItemMapper;
import com.example.ssmspringboot2.dao.service.ItemService;
import com.example.ssmspringboot2.domain.item.ItemDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ItemService")
public class ItemServiceImpl implements ItemService {
    @Resource
    private ItemMapper itemMapper;

    @Override
    public ItemDetail findItemByID(int id) {
        return itemMapper.selectItemByID(id);
    }
}
