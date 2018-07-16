package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.pokemonSpecies.PokemonSpeciesDetail;

public interface PokemonSpeciesService {
    PokemonSpeciesDetail findPokemonSpeciesByID(int id);
}
