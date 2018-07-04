package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.PokemonFormMapper;
import com.example.ssmspringboot2.dao.PokemonFormService;
import com.example.ssmspringboot2.domain.PokemonForm.PokemonFormDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("PokemonFormService")
public class PokemonFormServiceImpl implements PokemonFormService {

    @Resource
    private PokemonFormMapper pokemonFormMapper;

    @Override
    public PokemonFormDetail findPokemonFormByID(int id) {
        return pokemonFormMapper.selectPokemonFormByID(id);
    }
}
