package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.VersionMapper;
import com.example.ssmspringboot2.dao.service.VersionService;
import com.example.ssmspringboot2.domain.version.VersionInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("VersionService")
public class VersionServiceImpl implements VersionService {
    @Resource
    private VersionMapper versionMapper;

    @Override
    public VersionInfo findVersionByID(int id) {
        return versionMapper.selectVersionByID(id);
    }
}
