package com.example.ssmspringboot2.domain.item;

import com.example.ssmspringboot2.domain.link.Generation;

public class ItemGameIndex {
    private Generation generation;
    private Integer game_index;

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public Integer getGame_index() {
        return game_index;
    }

    public void setGame_index(Integer game_index) {
        this.game_index = game_index;
    }
}
