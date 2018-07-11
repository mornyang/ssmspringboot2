package com.example.ssmspringboot2.dao.Mapper;

import com.example.ssmspringboot2.domain.Stat.StatDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StatMapper  {
    StatDetail selectStatByID(int id);
}
