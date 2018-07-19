package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.nature.NatureDetail;

public interface NatureService {
    NatureDetail findNatureByID(int id);
}
