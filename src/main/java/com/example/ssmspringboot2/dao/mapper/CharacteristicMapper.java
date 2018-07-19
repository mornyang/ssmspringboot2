package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.characteristic.CharacteristicDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CharacteristicMapper {
    CharacteristicDetail selectCharacteristicByID(int id);
}
