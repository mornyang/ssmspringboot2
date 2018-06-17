package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.PokemonService;
import com.example.ssmspringboot2.dao.TypeService;
import com.example.ssmspringboot2.domain.Pokemon;
import com.example.ssmspringboot2.domain.TypeDetail;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin
public class PokemonController {

    private PokemonService pokemonService;
    private TypeService typeService;
    //依赖注入
    @Autowired
    public void setPokemonMapper(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }
    @Autowired
    public void setTypeService(TypeService typeService) { this.typeService = typeService; }

    /*@RequestMapping(value = "api/pokemon/{name}&{id}",method = RequestMethod.GET)
    public String getPokemonByNameAndID(@PathVariable("name") String name, @PathVariable("id") int id) {
        //调用dao层
        Pokemon pokemon = pokemonService.checkInfo(name, id);
        return pokemon == null ? "查询无结果":pokemon.toString();
    }*/

    /*@RequestMapping(value = "api/{name}",method = RequestMethod.GET)
    public Pokemon getPokemonByName(@PathVariable String name) {
        //调用dao层
        return pokemonService.findPokemonByName(name);
    }*/

    @RequestMapping(value = "api/pokemon/{id}",method = RequestMethod.GET)
    public Pokemon getPokemonByID(@PathVariable int id) {
        //调用dao层
        return pokemonService.findPokemonByID(id);
    }

    @RequestMapping(value = "api/type/{id}",method = RequestMethod.GET)
    public TypeDetail getTypeByID(@PathVariable int id){
        return typeService.findTypeByID(id);
    }
}
