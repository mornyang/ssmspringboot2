package com.example.ssmspringboot2.domain.VersionGroupDetail;

import com.example.ssmspringboot2.domain.link.*;

import java.util.List;

public class VersionGroupDetail {
    private Integer id;
    private String name;
    private Integer order;
    private Generation generation;
    private List<MoveLearnMethod> move_learn_methods;
    private List<Version> versions;
    private List<Region> regions;
    private List<Pokedex> pokedexes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public List<MoveLearnMethod> getMove_learn_methods() {
        return move_learn_methods;
    }

    public void setMove_learn_methods(List<MoveLearnMethod> move_learn_methods) {
        this.move_learn_methods = move_learn_methods;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public List<Pokedex> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<Pokedex> pokedexes) {
        this.pokedexes = pokedexes;
    }
}
