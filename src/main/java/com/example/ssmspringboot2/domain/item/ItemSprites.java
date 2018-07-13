package com.example.ssmspringboot2.domain.item;

public class ItemSprites {
    private String Default;

    public String getDefault() {
        return Default;
    }

    public void setDefault(String aDefault) {
        Default = aDefault;
    }

    @Override
    public String toString() {
        return "ItemSprites{" +
                "Default='" + Default + '\'' +
                '}';
    }
}
