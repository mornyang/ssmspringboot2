package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.StatMapper;
import com.example.ssmspringboot2.dao.StatService;
import com.example.ssmspringboot2.domain.Stat.StatDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("StatService")
public class StatServiceImpl implements StatService {

    @Resource
    private StatMapper statMapper;

    @Override
    public StatDetail findStatByID(int id) {
        return statMapper.selectStatByID(id);
    }
}
