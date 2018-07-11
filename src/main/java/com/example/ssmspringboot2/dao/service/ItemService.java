package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.item.ItemDetail;

public interface ItemService {
    ItemDetail findItemByID(int id);
}
