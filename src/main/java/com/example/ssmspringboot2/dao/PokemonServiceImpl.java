package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.Pokemon;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("PokemonService")
public class PokemonServiceImpl implements PokemonService {

    @Resource
    private PokemonMapper pokemonMapper;

    /*@Override
    public Pokemon checkInfo(String name, int id) {
        Pokemon Pokemon = pokemonMapper.selectPokemonByName(name);
        if(Pokemon != null && Pokemon.getId() == id){
            return Pokemon;
        }
        return null;
    }*/

    /*@Override
    public Pokemon findPokemonByName(String name) {
        return pokemonMapper.selectPokemonByName(name);
    }*/

    @Override
    public Pokemon findPokemonByID(int id) {
        return pokemonMapper.selectPokemonByID(id);
    }
}
