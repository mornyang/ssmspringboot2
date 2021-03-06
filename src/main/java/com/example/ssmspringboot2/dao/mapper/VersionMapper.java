package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.version.VersionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface VersionMapper {
    VersionInfo selectVersionByID(int id);
}
