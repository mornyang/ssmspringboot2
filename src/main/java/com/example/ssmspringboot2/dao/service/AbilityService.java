package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.ability.AbilityDetail;

public interface AbilityService {
    AbilityDetail findAbilityByID(int id);
}
