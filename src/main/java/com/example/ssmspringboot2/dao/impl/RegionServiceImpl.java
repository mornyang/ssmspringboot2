package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.RegionMapper;
import com.example.ssmspringboot2.dao.service.RegionService;
import com.example.ssmspringboot2.domain.region.RegionDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("RegionService")
public class RegionServiceImpl implements RegionService {
    @Resource
    private RegionMapper regionMapper;

    @Override
    public RegionDetail findRegionByID(int id) {
        return regionMapper.selectRegionByID(id);
    }
}
