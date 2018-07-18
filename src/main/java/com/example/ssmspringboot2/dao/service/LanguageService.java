package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.language.LanguageDetail;

public interface LanguageService {
    LanguageDetail findLanguageByID(int id);
}
