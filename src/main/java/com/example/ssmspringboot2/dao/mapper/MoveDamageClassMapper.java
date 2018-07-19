package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.moveDamageClass.MoveDamageClassDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MoveDamageClassMapper {
    MoveDamageClassDetail selectMoveDamageClassByID(int id);
}
