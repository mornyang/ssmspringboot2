package com.example.ssmspringboot2.dao.Mapper;

import com.example.ssmspringboot2.domain.Item.ItemDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemMapper {
    ItemDetail selectItemByID(int id);
}
