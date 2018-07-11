package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.Mapper.AbilityMapper;
import com.example.ssmspringboot2.dao.Service.AbilityService;
import com.example.ssmspringboot2.domain.Ability.AbilityDetail;
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
