package com.example.ssmspringboot2.domain.move;

import com.example.ssmspringboot2.domain.common.ShortEffectEntry;
import com.example.ssmspringboot2.domain.link.Type;
import com.example.ssmspringboot2.domain.link.VersionGroup;

import java.util.List;

public class MoveValue {
    private Integer pp;
    private Integer power;
    private Integer effect_chance;
    private Integer accuracy;
    private Type type;
    private VersionGroup version_group;
    private List<ShortEffectEntry> effect_entries;

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
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

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

    public List<ShortEffectEntry> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<ShortEffectEntry> effect_entries) {
        this.effect_entries = effect_entries;
    }
}
