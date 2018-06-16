package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.Pokemon;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface PokemonMapper {
    Pokemon selectPokemonByID(int id);
}
