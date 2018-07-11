package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.type.TypeDetail;

public interface TypeService {
    TypeDetail findTypeByID(int id);
}
