package com.example.ssmspringboot2.domain.common;

import com.example.ssmspringboot2.domain.link.Language;

public class Description {
    private String description;
    private Language language;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
