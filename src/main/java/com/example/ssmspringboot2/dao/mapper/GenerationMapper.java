package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.generation.GenerationDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GenerationMapper {
    GenerationDetail selectGenerationByID(int id);
}
