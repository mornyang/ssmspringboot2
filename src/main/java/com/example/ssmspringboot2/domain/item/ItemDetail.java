package com.example.ssmspringboot2.domain.item;

import com.example.ssmspringboot2.domain.common.FlavorTextEntry;
import com.example.ssmspringboot2.domain.common.Name;
import com.example.ssmspringboot2.domain.common.ShortEffectEntry;
import com.example.ssmspringboot2.domain.link.EvolutionChain;
import com.example.ssmspringboot2.domain.link.ItemAttributes;
import com.example.ssmspringboot2.domain.link.ItemCategory;
import com.example.ssmspringboot2.domain.link.ItemFlingEffect;

import java.util.List;

public class ItemDetail {
    private Integer id;
    private String name;
    private Integer fling_power;
    private Integer cost;
    private ItemCategory itemCategory;
    private ItemFlingEffect itemFlingEffect;
    private ItemSprites itemSprites;
    private EvolutionChain baby_trigger_for;
    private List<ShortEffectEntry> effect_entries;
    private List<HeldByPokemon> held_by_pokemon;
    private List<ItemGameIndex> game_indices;
    private List<Name> names;
    private List<ItemAttributes> attributes;
    private List<FlavorTextEntry> flavor_text_entries;
    private List<ItemMechine> machines;

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

    public Integer getFling_power() {
        return fling_power;
    }

    public void setFling_power(Integer fling_power) {
        this.fling_power = fling_power;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    public ItemFlingEffect getItemFlingEffect() {
        return itemFlingEffect;
    }

    public void setItemFlingEffect(ItemFlingEffect itemFlingEffect) {
        this.itemFlingEffect = itemFlingEffect;
    }

    public ItemSprites getItemSprites() {
        return itemSprites;
    }

    public void setItemSprites(ItemSprites itemSprites) {
        this.itemSprites = itemSprites;
    }

    public EvolutionChain getBaby_trigger_for() {
        return baby_trigger_for;
    }

    public void setBaby_trigger_for(EvolutionChain baby_trigger_for) {
        this.baby_trigger_for = baby_trigger_for;
    }

    public List<ShortEffectEntry> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<ShortEffectEntry> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public List<HeldByPokemon> getHeld_by_pokemon() {
        return held_by_pokemon;
    }

    public void setHeld_by_pokemon(List<HeldByPokemon> held_by_pokemon) {
        this.held_by_pokemon = held_by_pokemon;
    }

    public List<ItemGameIndex> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(List<ItemGameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<ItemAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ItemAttributes> attributes) {
        this.attributes = attributes;
    }

    public List<FlavorTextEntry> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<FlavorTextEntry> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public List<ItemMechine> getMachines() {
        return machines;
    }

    public void setMachines(List<ItemMechine> machines) {
        this.machines = machines;
    }
}
