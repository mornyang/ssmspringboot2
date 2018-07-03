package com.example.ssmspringboot2.domain.type;

import com.example.ssmspringboot2.domain.link.Generation;

public class TypeGameIndex {
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

    @Override
    public String toString() {
        return "TypeGameIndex{" +
                "generation=" + generation +
                ", game_index=" + game_index +
                '}';
    }
}
