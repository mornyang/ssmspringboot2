package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.GenerationMapper;
import com.example.ssmspringboot2.dao.service.GenerationService;
import com.example.ssmspringboot2.domain.generation.GenerationDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("GenerationService")
public class GenerationServiceImpl implements GenerationService {
    @Resource
    private GenerationMapper generationMapper;

    @Override
    public GenerationDetail findGenerationByID(int id) {
        return generationMapper.selectGenerationByID(id);
    }
}
