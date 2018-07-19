package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.MoveDamageClassMapper;
import com.example.ssmspringboot2.dao.service.MoveDamageClassService;
import com.example.ssmspringboot2.domain.moveDamageClass.MoveDamageClassDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("MoveDamageClassService")
public class MoveDamageClassServiceImpl implements MoveDamageClassService {
    @Resource
    private MoveDamageClassMapper moveDamageClassMapper;

    @Override
    public MoveDamageClassDetail findMoveDamageClassServiceByID(int id) {
        return moveDamageClassMapper.selectMoveDamageClassByID(id);
    }
}
