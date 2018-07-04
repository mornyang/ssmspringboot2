package com.example.ssmspringboot2.domain.link;


public class Name {
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
        return "Name{" +
                "name='" + name + '\'' +
                ", language=" + language +
                '}';
    }
}
