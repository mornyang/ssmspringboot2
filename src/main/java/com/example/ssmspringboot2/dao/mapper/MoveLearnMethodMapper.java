package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.moveLearnMethod.MoveLearnMethodDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MoveLearnMethodMapper {
    MoveLearnMethodDetail selectMoveLearnMethodByID(int id);
}
