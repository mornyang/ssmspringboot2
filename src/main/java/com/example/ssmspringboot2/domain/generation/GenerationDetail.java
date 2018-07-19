package com.example.ssmspringboot2.domain.generation;

import com.example.ssmspringboot2.domain.common.Name;
import com.example.ssmspringboot2.domain.link.*;

import java.util.List;

public class GenerationDetail {
    private Integer id;
    private String name;
    private Region main_region;
    private List<VersionGroup> version_groups;
    private List<Type> types;
    private List<Ability> abilities;
    private List<Name> names;
    private List<Species> pokemon_species;
    private List<MoveLink> moves;

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

    public Region getMain_region() {
        return main_region;
    }

    public void setMain_region(Region main_region) {
        this.main_region = main_region;
    }

    public List<VersionGroup> getVersion_groups() {
        return version_groups;
    }

    public void setVersion_groups(List<VersionGroup> version_groups) {
        this.version_groups = version_groups;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<Species> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(List<Species> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

    public List<MoveLink> getMoves() {
        return moves;
    }

    public void setMoves(List<MoveLink> moves) {
        this.moves = moves;
    }
}
