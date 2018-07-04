package com.example.ssmspringboot2.domain.type;

import com.example.ssmspringboot2.domain.link.PokemonLink;

public class TypeSlotPokemon {
    private Integer slot;
    private PokemonLink pokemon;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public PokemonLink getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonLink pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return "TypeSlotPokemon{" +
                "slot=" + slot +
                ", pokemon=" + pokemon +
                '}';
    }
}
