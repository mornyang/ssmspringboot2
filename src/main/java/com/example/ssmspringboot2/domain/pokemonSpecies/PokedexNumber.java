package com.example.ssmspringboot2.domain.pokemonSpecies;

import com.example.ssmspringboot2.domain.link.Pokedex;

public class PokedexNumber {
    private Integer entry_number;
    private Pokedex pokedex;

    public Integer getEntry_number() {
        return entry_number;
    }

    public void setEntry_number(Integer entry_number) {
        this.entry_number = entry_number;
    }

    public Pokedex getPokedex() {
        return pokedex;
    }

    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }
}
