package com.example.ssmspringboot2.dao.Mapper;

import com.example.ssmspringboot2.domain.type.TypeDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TypeMapper {
    TypeDetail selectTypeByID(int id);
}
