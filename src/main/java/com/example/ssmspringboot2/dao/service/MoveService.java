package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.move.MoveDetail;

public interface MoveService {
    MoveDetail findMoveByID(int id);
}
