package com.example.ssmspringboot2.domain.region;

import com.example.ssmspringboot2.domain.link.Generation;

public class RegionDetail {
    private Integer id;
    private String name;
    private Generation main_generation;

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

    public Generation getMain_generation() {
        return main_generation;
    }

    public void setMain_generation(Generation main_generation) {
        this.main_generation = main_generation;
    }
}
