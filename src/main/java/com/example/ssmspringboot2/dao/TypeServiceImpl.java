package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.TypeDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("TypeService")
public class TypeServiceImpl implements TypeService{

    @Resource
    private TypeMapper typeMapper;

    @Override
    public TypeDetail findTypeByID(int id) {
        return typeMapper.selectTypeByID(id);
    }
}
