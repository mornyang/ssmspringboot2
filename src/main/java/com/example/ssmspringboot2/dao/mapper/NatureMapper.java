package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.nature.NatureDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NatureMapper {
    NatureDetail selectNatureByID(int id);
}
