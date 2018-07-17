package com.example.ssmspringboot2.domain.move;

import com.example.ssmspringboot2.domain.common.EffectEntry;
import com.example.ssmspringboot2.domain.link.VersionGroup;

import java.util.List;

public class EffectChange {
    private List<EffectEntry> effect_entries;
    private VersionGroup version_group;

    public List<EffectEntry> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<EffectEntry> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }
}
