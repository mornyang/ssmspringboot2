package com.example.ssmspringboot2.dao.Service;

import com.example.ssmspringboot2.domain.Item.ItemDetail;

public interface ItemService {
    ItemDetail findItemByID(int id);
}
