package com.example.ssmspringboot2.domain.item;

import com.example.ssmspringboot2.domain.common.VersionDetail;
import com.example.ssmspringboot2.domain.link.PokemonLink;

import java.util.List;

public class HeldByPokemon {
    private List<VersionDetail> version_details;
    private PokemonLink pokemon;

    public List<VersionDetail> getVersion_details() {
        return version_details;
    }

    public void setVersion_details(List<VersionDetail> version_details) {
        this.version_details = version_details;
    }

    public PokemonLink getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonLink pokemon) {
        this.pokemon = pokemon;
    }
}
