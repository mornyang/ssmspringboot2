package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.CharacteristicMapper;
import com.example.ssmspringboot2.dao.service.CharacteristicService;
import com.example.ssmspringboot2.domain.characteristic.CharacteristicDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("CharacteristicService")
public class CharacteristicServiceImpl implements CharacteristicService {
    @Resource
    private CharacteristicMapper characteristicMapper;

    @Override
    public CharacteristicDetail findCharacteristicByID(int id) {
        return characteristicMapper.selectCharacteristicByID(id);
    }
}
