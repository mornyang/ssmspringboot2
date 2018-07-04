package com.example.ssmspringboot2.domain.type;

import com.example.ssmspringboot2.domain.link.Generation;
import com.example.ssmspringboot2.domain.link.MoveDamageClass;
import com.example.ssmspringboot2.domain.link.MoveLink;
import com.example.ssmspringboot2.domain.link.Name;

import java.util.List;

public class TypeDetail {
    private String name;
    private Integer id;
    private Generation generation;
    private DamageRelation damageRelation;
    private List<TypeGameIndex> game_Indices;
    private MoveDamageClass moveDamageClass;
    private List<MoveLink> moves;
    private List<TypeSlotPokemon> pokemon;
    private List<Name> names;

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

    public MoveDamageClass getMoveDamageClass() {
        return moveDamageClass;
    }

    public void setMoveDamageClass(MoveDamageClass moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    public List<MoveLink> getMoves() {
        return moves;
    }

    public void setMoves(List<MoveLink> moves) {
        this.moves = moves;
    }

    public List<TypeSlotPokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<TypeSlotPokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "TypeDetail{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", generation=" + generation +
                ", damageRelation=" + damageRelation +
                ", game_Indices=" + game_Indices +
                ", moveDamageClass=" + moveDamageClass +
                ", moves=" + moves +
                ", pokemon=" + pokemon +
                ", names=" + names +
                '}';
    }
}
