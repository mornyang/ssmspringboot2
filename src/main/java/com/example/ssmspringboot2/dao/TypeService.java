package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.TypeDetail;

public interface TypeService {
    TypeDetail findTypeByID(int id);
}
