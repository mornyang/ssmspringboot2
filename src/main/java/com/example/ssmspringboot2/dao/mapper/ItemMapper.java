package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.item.ItemDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemMapper {
    ItemDetail selectItemByID(int id);
}
