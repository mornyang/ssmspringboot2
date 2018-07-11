package com.example.ssmspringboot2.domain.ability;

import com.example.ssmspringboot2.domain.link.Language;

public class EffectEntry {
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
}
