package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.Mapper.ItemMapper;
import com.example.ssmspringboot2.dao.Service.ItemService;
import com.example.ssmspringboot2.domain.Item.ItemDetail;
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
