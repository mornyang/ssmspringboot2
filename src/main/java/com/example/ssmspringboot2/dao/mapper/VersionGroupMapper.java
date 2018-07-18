package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.VersionGroupDetail.VersionGroupDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface VersionGroupMapper {
    VersionGroupDetail selectVersionGroupByID(int id);
}
