package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.Mapper.TypeMapper;
import com.example.ssmspringboot2.dao.Service.TypeService;
import com.example.ssmspringboot2.domain.type.TypeDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("TypeService")
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public TypeDetail findTypeByID(int id) {
        return typeMapper.selectTypeByID(id);
    }
}
