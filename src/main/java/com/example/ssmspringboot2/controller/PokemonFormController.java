package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.Service.PokemonFormService;
import com.example.ssmspringboot2.domain.PokemonForm.PokemonFormDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class PokemonFormController {

    private PokemonFormService pokemonFormService;
    @Autowired
    public void setPokemonFormService(PokemonFormService pokemonFormService){
        this.pokemonFormService = pokemonFormService;
    }

    @RequestMapping(value = "pokemon-form/{id}", method = RequestMethod.GET)
    public PokemonFormDetail getPokemonFormByID(@PathVariable int id){
        return pokemonFormService.findPokemonFormByID(id);
    }
}
