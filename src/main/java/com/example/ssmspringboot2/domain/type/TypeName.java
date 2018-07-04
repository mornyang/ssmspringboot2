package com.example.ssmspringboot2.domain.type;

import com.example.ssmspringboot2.domain.link.Language;

public class TypeName {
    private String name;
    private Language language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "TypeName{" +
                "name='" + name + '\'' +
                ", language=" + language +
                '}';
    }
}
