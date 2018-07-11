package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.Ability.AbilityDetail;

public interface AbilityService {
    AbilityDetail findAbilityByID(int id);
}
