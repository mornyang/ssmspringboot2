package com.example.ssmspringboot2.domain.common;

import com.example.ssmspringboot2.domain.link.Language;
import com.example.ssmspringboot2.domain.link.Version;

public class FlavorTextEntryVersion {
    private String flavor_text;
    private Language language;
    private Version version;

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

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}
