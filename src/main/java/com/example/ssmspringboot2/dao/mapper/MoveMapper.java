package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.move.MoveDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MoveMapper {
    MoveDetail selectMoveByID(int id);
}
