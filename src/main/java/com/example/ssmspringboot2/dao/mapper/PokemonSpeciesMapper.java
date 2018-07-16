package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.pokemonSpecies.PokemonSpeciesDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PokemonSpeciesMapper {
    PokemonSpeciesDetail selectPokemonSpeciesByID(int id);
}
