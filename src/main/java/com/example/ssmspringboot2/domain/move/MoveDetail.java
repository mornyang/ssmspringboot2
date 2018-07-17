package com.example.ssmspringboot2.domain.move;

import com.example.ssmspringboot2.domain.common.FlavorTextEntry;
import com.example.ssmspringboot2.domain.common.Name;
import com.example.ssmspringboot2.domain.common.ShortEffectEntry;
import com.example.ssmspringboot2.domain.link.*;

import java.util.List;

public class MoveDetail {
    private Integer id;
    private String name;
    private Integer pp;
    private Integer priority;
    private Integer accuracy;
    private Integer power;
    private Integer effect_chance;
    private Generation generation;
    private ContestType contest_type;
    private ContestEffect contest_effect;
    private Type type;
    private Target target;
    private SuperContestEffect super_contest_effect;
    private MoveDamageClass damage_class;
    private MoveMeta meta;
    private ContestCombos contest_combos;
    private List<Name> names;
    private List<MoveMachine> machines;
    private List<ShortEffectEntry> effect_entries;
    private List<MoveValue> past_values;
    private List<FlavorTextEntry> flavor_text_entries;
    private List<StatChange> stat_changes;
    private List<EffectChange> effect_changes;

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

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getEffect_chance() {
        return effect_chance;
    }

    public void setEffect_chance(Integer effect_chance) {
        this.effect_chance = effect_chance;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public ContestType getContest_type() {
        return contest_type;
    }

    public void setContest_type(ContestType contest_type) {
        this.contest_type = contest_type;
    }

    public ContestEffect getContest_effect() {
        return contest_effect;
    }

    public void setContest_effect(ContestEffect contest_effect) {
        this.contest_effect = contest_effect;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public SuperContestEffect getSuper_contest_effect() {
        return super_contest_effect;
    }

    public void setSuper_contest_effect(SuperContestEffect super_contest_effect) {
        this.super_contest_effect = super_contest_effect;
    }

    public MoveDamageClass getDamage_class() {
        return damage_class;
    }

    public void setDamage_class(MoveDamageClass damage_class) {
        this.damage_class = damage_class;
    }

    public MoveMeta getMeta() {
        return meta;
    }

    public void setMeta(MoveMeta meta) {
        this.meta = meta;
    }

    public ContestCombos getContest_combos() {
        return contest_combos;
    }

    public void setContest_combos(ContestCombos contest_combos) {
        this.contest_combos = contest_combos;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<MoveMachine> getMachines() {
        return machines;
    }

    public void setMachines(List<MoveMachine> machines) {
        this.machines = machines;
    }

    public List<ShortEffectEntry> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<ShortEffectEntry> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public List<MoveValue> getPast_values() {
        return past_values;
    }

    public void setPast_values(List<MoveValue> past_values) {
        this.past_values = past_values;
    }

    public List<FlavorTextEntry> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<FlavorTextEntry> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public List<StatChange> getStat_changes() {
        return stat_changes;
    }

    public void setStat_changes(List<StatChange> stat_changes) {
        this.stat_changes = stat_changes;
    }

    public List<EffectChange> getEffect_changes() {
        return effect_changes;
    }

    public void setEffect_changes(List<EffectChange> effect_changes) {
        this.effect_changes = effect_changes;
    }
}
