package com.example.ssmspringboot2.domain.ability;

import com.example.ssmspringboot2.domain.link.Language;

public class ShortEffectEntry {
    private String short_effect;
    private String effect;
    private Language language;

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getShort_effect() {
        return short_effect;
    }

    public void setShort_effect(String short_effect) {
        this.short_effect = short_effect;
    }
}
