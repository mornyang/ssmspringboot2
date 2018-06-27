package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.type.TypeDetail;

public interface TypeService {
    TypeDetail findTypeByID(int id);
}
