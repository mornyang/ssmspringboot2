package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.MoveLearnMethodMapper;
import com.example.ssmspringboot2.dao.service.MoveLearnMethodService;
import com.example.ssmspringboot2.domain.moveLearnMethod.MoveLearnMethodDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("MoveLearnMethodService")
public class MoveLearnMethodServiceImpl implements MoveLearnMethodService {
    @Resource
    private MoveLearnMethodMapper moveLearnMethodMapper;

    @Override
    public MoveLearnMethodDetail findMoveLearnMethodByID(int id) {
        return moveLearnMethodMapper.selectMoveLearnMethodByID(id);
    }
}
