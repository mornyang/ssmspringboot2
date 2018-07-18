package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.LanguageMapper;
import com.example.ssmspringboot2.dao.service.LanguageService;
import com.example.ssmspringboot2.domain.language.LanguageDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("LanguageService")
public class LanguageServiceImpl implements LanguageService {
    @Resource
    private LanguageMapper languageMapper;

    @Override
    public LanguageDetail findLanguageByID(int id) {
        return languageMapper.selectLanguageByID(id);
    }
}
