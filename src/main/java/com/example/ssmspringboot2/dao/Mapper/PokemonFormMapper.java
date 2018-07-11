package com.example.ssmspringboot2.dao.Mapper;

import com.example.ssmspringboot2.domain.PokemonForm.PokemonFormDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PokemonFormMapper {
    PokemonFormDetail selectPokemonFormByID(int id);
}
