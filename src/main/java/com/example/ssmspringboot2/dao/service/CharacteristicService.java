package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.characteristic.CharacteristicDetail;

public interface CharacteristicService {
    CharacteristicDetail findCharacteristicByID(int id);
}
