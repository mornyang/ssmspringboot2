package com.example.ssmspringboot2.dao.Service;

import com.example.ssmspringboot2.domain.type.TypeDetail;

public interface TypeService {
    TypeDetail findTypeByID(int id);
}
