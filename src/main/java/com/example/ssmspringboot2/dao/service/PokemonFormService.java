package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.pokemonForm.PokemonFormDetail;

public interface PokemonFormService {
    PokemonFormDetail findPokemonFormByID(int id);
}
