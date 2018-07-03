package com.example.ssmspringboot2.domain.type;

import com.example.ssmspringboot2.domain.link.Generation;

import java.util.List;

public class TypeDetail {
    private String name;
    private Integer id;
    private Generation generation;
    private DamageRelation damageRelation;
    private List<TypeGameIndex> game_Indices;

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

    public DamageRelation getDamageRelation() {
        return damageRelation;
    }

    public void setDamageRelation(DamageRelation damageRelation) {
        this.damageRelation = damageRelation;
    }

    public List<TypeGameIndex> getGame_Indices() {
        return game_Indices;
    }

    public void setGame_Indices(List<TypeGameIndex> game_Indices) {
        this.game_Indices = game_Indices;
    }

    @Override
    public String toString() {
        return "TypeDetail{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", generation=" + generation +
                '}';
    }
}
