package com.example.ssmspringboot2.domain.pokemonSpecies;

import com.example.ssmspringboot2.domain.common.FlavorTextEntryVersion;
import com.example.ssmspringboot2.domain.common.Genera;
import com.example.ssmspringboot2.domain.common.Name;
import com.example.ssmspringboot2.domain.link.*;

import java.util.List;

public class PokemonSpeciesDetail {
    private Integer id;
    private Integer order;
    private String name;
    private Integer capture_rate;
    private Integer gender_rate;
    private Integer base_happiness;
    private Integer hatch_counter;
    private Boolean forms_switchable;
    private Boolean has_gender_differences;
    private Boolean is_baby;
    private PokemonHabitat habitat;
    private PokemonColor color;
    private PokemonShape shape;
    private Generation generation;
    private GrowthRate growth_rate;
    private Species evolves_from_species;
    private EvolutionChain evolution_chain;
    private List<Name> names;
    private List<EggGroup> egg_groups;
    private List<FlavorTextEntryVersion> flavor_text_entries;
    private List<Genera> genera;
    private List<Variety> varieties;
    private List<PalParkEncounter> pal_park_encounters;
    private List<PokedexNumber> pokedex_numbers;
    private List<Description> form_descriptions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(Integer capture_rate) {
        this.capture_rate = capture_rate;
    }

    public Integer getGender_rate() {
        return gender_rate;
    }

    public void setGender_rate(Integer gender_rate) {
        this.gender_rate = gender_rate;
    }

    public Integer getBase_happiness() {
        return base_happiness;
    }

    public void setBase_happiness(Integer base_happiness) {
        this.base_happiness = base_happiness;
    }

    public Integer getHatch_counter() {
        return hatch_counter;
    }

    public void setHatch_counter(Integer hatch_counter) {
        this.hatch_counter = hatch_counter;
    }

    public Boolean getForms_switchable() {
        return forms_switchable;
    }

    public void setForms_switchable(Boolean forms_switchable) {
        this.forms_switchable = forms_switchable;
    }

    public Boolean getHas_gender_differences() {
        return has_gender_differences;
    }

    public void setHas_gender_differences(Boolean has_gender_differences) {
        this.has_gender_differences = has_gender_differences;
    }

    public Boolean getIs_baby() {
        return is_baby;
    }

    public void setIs_baby(Boolean is_baby) {
        this.is_baby = is_baby;
    }

    public PokemonColor getColor() {
        return color;
    }

    public void setColor(PokemonColor color) {
        this.color = color;
    }

    public PokemonHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(PokemonHabitat habitat) {
        this.habitat = habitat;
    }

    public PokemonShape getShape() {
        return shape;
    }

    public void setShape(PokemonShape shape) {
        this.shape = shape;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public GrowthRate getGrowth_rate() {
        return growth_rate;
    }

    public void setGrowth_rate(GrowthRate growth_rate) {
        this.growth_rate = growth_rate;
    }

    public Species getEvolves_from_species() {
        return evolves_from_species;
    }

    public void setEvolves_from_species(Species evolves_from_species) {
        this.evolves_from_species = evolves_from_species;
    }

    public EvolutionChain getEvolution_chain() {
        return evolution_chain;
    }

    public void setEvolution_chain(EvolutionChain evolution_chain) {
        this.evolution_chain = evolution_chain;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<EggGroup> getEgg_groups() {
        return egg_groups;
    }

    public void setEgg_groups(List<EggGroup> egg_groups) {
        this.egg_groups = egg_groups;
    }

    public List<FlavorTextEntryVersion> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<FlavorTextEntryVersion> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public List<Genera> getGenera() {
        return genera;
    }

    public void setGenera(List<Genera> genera) {
        this.genera = genera;
    }

    public List<Variety> getVarieties() {
        return varieties;
    }

    public void setVarieties(List<Variety> varieties) {
        this.varieties = varieties;
    }

    public List<PalParkEncounter> getPal_park_encounters() {
        return pal_park_encounters;
    }

    public void setPal_park_encounters(List<PalParkEncounter> pal_park_encounters) {
        this.pal_park_encounters = pal_park_encounters;
    }


    public List<PokedexNumber> getPokedex_numbers() {
        return pokedex_numbers;
    }

    public void setPokedex_numbers(List<PokedexNumber> pokedex_numbers) {
        this.pokedex_numbers = pokedex_numbers;
    }

    public List<Description> getForm_descriptions() {
        return form_descriptions;
    }

    public void setForm_descriptions(List<Description> form_descriptions) {
        this.form_descriptions = form_descriptions;
    }
}
