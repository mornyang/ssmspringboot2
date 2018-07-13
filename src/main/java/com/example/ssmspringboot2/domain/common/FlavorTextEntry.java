package com.example.ssmspringboot2.domain.common;

import com.example.ssmspringboot2.domain.link.Language;
import com.example.ssmspringboot2.domain.link.VersionGroup;

public class FlavorTextEntry {
    private String flavor_text;
    private Language language;
    private VersionGroup version_group;

    public String getFlavor_text() {
        return flavor_text;
    }

    public void setFlavor_text(String flavor_text) {
        this.flavor_text = flavor_text;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }
}
