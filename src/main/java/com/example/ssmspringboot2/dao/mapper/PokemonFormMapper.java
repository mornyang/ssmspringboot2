package com.example.ssmspringboot2.dao.mapper;

import com.example.ssmspringboot2.domain.pokemonForm.PokemonFormDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PokemonFormMapper {
    PokemonFormDetail selectPokemonFormByID(int id);
}
