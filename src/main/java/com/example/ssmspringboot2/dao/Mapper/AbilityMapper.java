package com.example.ssmspringboot2.dao.Mapper;

import com.example.ssmspringboot2.domain.Ability.AbilityDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AbilityMapper {
    AbilityDetail selectAbilityByID(int id);
}
