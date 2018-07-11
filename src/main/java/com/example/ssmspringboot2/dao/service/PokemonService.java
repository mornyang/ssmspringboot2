package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.pokemon.Pokemon;

public interface PokemonService {
    Pokemon findPokemonByID(int id);
}
