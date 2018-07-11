package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.stat.StatDetail;

public interface StatService {
    StatDetail findStatByID(int id);
}
