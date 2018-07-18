package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.language.LanguageDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LanguageMapper {
    LanguageDetail selectLanguageByID(int id);
}
