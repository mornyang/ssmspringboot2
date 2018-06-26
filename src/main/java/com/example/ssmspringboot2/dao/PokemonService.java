package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.pokemon.Pokemon;

public interface PokemonService {
    Pokemon findPokemonByID(int id);
}
