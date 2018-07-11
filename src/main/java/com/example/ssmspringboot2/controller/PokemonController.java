package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.PokemonService;
import com.example.ssmspringboot2.domain.pokemon.Pokemon;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class PokemonController {

    private PokemonService pokemonService;
    //依赖注入
    @Autowired
    public void setPokemonMapper(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    /*@RequestMapping(value = "api/pokemon/{name}&{id}",method = RequestMethod.GET)
    public String getPokemonByNameAndID(@PathVariable("name") String name, @PathVariable("id") int id) {
        //调用dao层
        Pokemon pokemon = pokemonService.checkInfo(name, id);
        return pokemon == null ? "查询无结果":pokemon.toString();
    }*/

    @RequestMapping(value = "pokemon/{id}",method = RequestMethod.GET)
    public Pokemon getPokemonByID(@PathVariable int id) {
        //调用dao层
        return pokemonService.findPokemonByID(id);
    }
}
