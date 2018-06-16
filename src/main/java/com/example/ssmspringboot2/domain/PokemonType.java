package com.example.ssmspringboot2.domain;

public class PokemonType {
    private Integer id;
    private Integer slot;
    private Integer pokemon_id;
    private Integer type_id;
    private Type type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(Integer pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", slot=" + slot  +
                ", pokemon_id=" + pokemon_id +
                ", type_id=" + type_id +
                '}';
    }
}
