package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.Stat.StatDetail;

public interface StatService {
    StatDetail findStatByID(int id);
}
