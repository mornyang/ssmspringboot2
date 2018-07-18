package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.VersionGroupMapper;
import com.example.ssmspringboot2.dao.service.VersionGroupService;
import com.example.ssmspringboot2.domain.VersionGroupDetail.VersionGroupDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("VersionGroupService")
public class VersionGroupServiceImpl implements VersionGroupService {
    @Resource
    private VersionGroupMapper versionGroupMapper;

    @Override
    public VersionGroupDetail findVersionGroupByID(int id) {
        return versionGroupMapper.selectVersionGroupByID(id);
    }
}
