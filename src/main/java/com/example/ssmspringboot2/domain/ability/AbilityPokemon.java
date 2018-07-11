package com.example.ssmspringboot2.domain.ability;

import com.example.ssmspringboot2.domain.link.PokemonLink;

public class AbilityPokemon {
    private Integer slot;
    private boolean is_hidden;
    private PokemonLink pokemon;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public PokemonLink getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonLink pokemon) {
        this.pokemon = pokemon;
    }
}
