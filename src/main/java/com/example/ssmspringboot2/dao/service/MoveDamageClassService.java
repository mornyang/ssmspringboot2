package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.moveDamageClass.MoveDamageClassDetail;

public interface MoveDamageClassService {
    MoveDamageClassDetail findMoveDamageClassServiceByID(int id);
}
