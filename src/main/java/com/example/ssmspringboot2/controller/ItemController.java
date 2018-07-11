package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.ItemService;
import com.example.ssmspringboot2.domain.item.ItemDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value="api/")
public class ItemController {
    private ItemService itemService;
    @Autowired
    public void setItemService(ItemService itemService){
        this.itemService = itemService;
    }

    @RequestMapping(value="item/{id}", method = RequestMethod.GET)
    public ItemDetail getItemByID(@PathVariable int id){
        return itemService.findItemByID(id);
    }
}
