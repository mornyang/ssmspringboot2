package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.MoveMapper;
import com.example.ssmspringboot2.dao.service.MoveService;
import com.example.ssmspringboot2.domain.move.MoveDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("MoveService")
public class MoveServiceImpl implements MoveService {
    @Resource
    private MoveMapper moveMapper;

    @Override
    public MoveDetail findMoveByID(int id) {
        return moveMapper.selectMoveByID(id);
    }
}
