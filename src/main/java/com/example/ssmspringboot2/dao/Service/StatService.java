package com.example.ssmspringboot2.dao.Service;

import com.example.ssmspringboot2.domain.Stat.StatDetail;

public interface StatService {
    StatDetail findStatByID(int id);
}
