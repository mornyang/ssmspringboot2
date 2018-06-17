package com.example.ssmspringboot2.domain;

import java.util.List;

public class Pokemon {
    private Integer id;
    private Integer order;
    private Integer height;
    private Integer weight;
    private Integer base_experience;
    private Boolean is_default;
    //private Integer pokemon_species_id;
    private String name;
    private List<PokemonType> pokemonTypes;

    public List<PokemonType> getPokemonTypes() {
        return pokemonTypes;
    }

    public void setPokemonTypes(List<PokemonType> pokemonTypes) {
        this.pokemonTypes = pokemonTypes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    /*public Integer getPokemon_species_id() {
        return pokemon_species_id;
    }

    public void setPokemon_species_id(Integer pokemon_species_id) {
        this.pokemon_species_id = pokemon_species_id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", order=" + order  +
                ", height=" + height +
                ", weight=" + weight +
                ", base_experience=" + base_experience +
                ", is_default=" + is_default +
                //", pokemon_species_id=" + pokemon_species_id +
                ", name='" + name + '\'' +
                '}';
    }
}
