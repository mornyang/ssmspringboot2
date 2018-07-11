package com.example.ssmspringboot2.domain.Ability;

import com.example.ssmspringboot2.domain.link.Generation;
import com.example.ssmspringboot2.domain.link.Name;

import java.util.List;

public class AbilityDetail {
    private Integer id;
    private Boolean is_main_series;
    private String name;
    private Generation generation;
    private List<AbilityPokemon> pokemon;
    private List<AbilityEffectChange> effect_changes;
    private List<EffectEntry> effect_entries;
    private List<Name> names;
    private List<FlavorTextEntry> flavor_text_entries;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIs_main_series() {
        return is_main_series;
    }

    public void setIs_main_series(Boolean is_main_series) {
        this.is_main_series = is_main_series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public List<AbilityPokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<AbilityPokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public List<AbilityEffectChange> getEffect_changes() {
        return effect_changes;
    }

    public void setEffect_changes(List<AbilityEffectChange> effect_changes) {
        this.effect_changes = effect_changes;
    }

    public List<EffectEntry> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<EffectEntry> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<FlavorTextEntry> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<FlavorTextEntry> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }
}
