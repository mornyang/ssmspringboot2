package com.example.ssmspringboot2.domain.pokemon;

import com.example.ssmspringboot2.domain.link.Type;

public class PokemonType {
    private Integer slot;
    private Type type;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PokemonType{" +
                ", slot=" + slot +
                ", link=" + type +
                '}';
    }
}
