package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.AbilityMapper;
import com.example.ssmspringboot2.dao.service.AbilityService;
import com.example.ssmspringboot2.domain.ability.AbilityDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("AbilityService")
public class AbilityServiceImpl implements AbilityService {
    @Resource
    private AbilityMapper abilityMapper;

    @Override
    public AbilityDetail findAbilityByID(int id) {
        return abilityMapper.selectAbilityByID(id);
    }
}
