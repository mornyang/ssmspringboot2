package com.example.ssmspringboot2.domain;

public class PokemonType {
    private Integer slot;
    private Link link;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "PokemonType{" +
                ", slot=" + slot  +
                ", link=" + link +
                '}';
    }
}
