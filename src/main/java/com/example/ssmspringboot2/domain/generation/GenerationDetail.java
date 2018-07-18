package com.example.ssmspringboot2.domain.generation;

import com.example.ssmspringboot2.domain.link.Region;

public class GenerationDetail {
    private Integer id;
    private String name;
    private Region main_region;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getMain_region() {
        return main_region;
    }

    public void setMain_region(Region main_region) {
        this.main_region = main_region;
    }
}
