package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.NatureMapper;
import com.example.ssmspringboot2.dao.service.NatureService;
import com.example.ssmspringboot2.domain.nature.NatureDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("NatureService")
public class NatureServiceImpl implements NatureService {
    @Resource
    private NatureMapper natureMapper;

    @Override
    public NatureDetail findNatureByID(int id) {
        return natureMapper.selectNatureByID(id);
    }
}
