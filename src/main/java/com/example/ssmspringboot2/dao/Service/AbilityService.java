package com.example.ssmspringboot2.dao.Service;

import com.example.ssmspringboot2.domain.Ability.AbilityDetail;

public interface AbilityService {
    AbilityDetail findAbilityByID(int id);
}
