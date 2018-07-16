package com.example.ssmspringboot2.domain.pokemonSpecies;

import com.example.ssmspringboot2.domain.link.PokemonLink;

public class Variety {
    private Boolean is_default;
    private PokemonLink pokemonLink;

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    public PokemonLink getPokemonLink() {
        return pokemonLink;
    }

    public void setPokemonLink(PokemonLink pokemonLink) {
        this.pokemonLink = pokemonLink;
    }
}
