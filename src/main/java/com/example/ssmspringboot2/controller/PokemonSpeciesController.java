package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.PokemonSpeciesService;
import com.example.ssmspringboot2.domain.pokemonSpecies.PokemonSpeciesDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class PokemonSpeciesController {
    private PokemonSpeciesService pokemonSpeciesService;
    @Autowired
    public void setPokemonSpeciesService(PokemonSpeciesService pokemonSpeciesService){
        this.pokemonSpeciesService = pokemonSpeciesService;
    }

    @RequestMapping(value = "pokemon-species/{id}", method = RequestMethod.GET)
    public PokemonSpeciesDetail getPokemonSpeciesByID(@PathVariable int id){
        return pokemonSpeciesService.findPokemonSpeciesByID(id);
    }
}
