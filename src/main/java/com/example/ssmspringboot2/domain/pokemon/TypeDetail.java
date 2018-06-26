package com.example.ssmspringboot2.domain.pokemon;

import com.example.ssmspringboot2.domain.link.Generation;

public class TypeDetail {
    private String name;
    private Integer id;
    private Generation generation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "TypeDetail{" +
                "name=" + name +
                ", id=" + id +
                "}";
    }
}
