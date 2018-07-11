package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.ability.AbilityDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AbilityMapper {
    AbilityDetail selectAbilityByID(int id);
}
