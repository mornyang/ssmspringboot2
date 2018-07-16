package com.example.ssmspringboot2.dao.impl;

import com.example.ssmspringboot2.dao.mapper.PokemonSpeciesMapper;
import com.example.ssmspringboot2.dao.service.PokemonSpeciesService;
import com.example.ssmspringboot2.domain.pokemonSpecies.PokemonSpeciesDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("PokemonSpeciesService")
public class PokemonSpeciesSerciceImpl implements PokemonSpeciesService {
    @Resource
    private PokemonSpeciesMapper pokemonSpeciesMapper;

    @Override
    public PokemonSpeciesDetail findPokemonSpeciesByID(int id) {
        return pokemonSpeciesMapper.selectPokemonSpeciesByID(id);
    }
}
