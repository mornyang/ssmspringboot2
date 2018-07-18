package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.generation.GenerationDetail;

public interface GenerationService {
    GenerationDetail findGenerationByID(int id);
}
