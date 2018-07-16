package com.example.ssmspringboot2.domain.pokemonSpecies;

import com.example.ssmspringboot2.domain.link.PalParkArea;

public class PalParkEncounter {
    private Integer rate;
    private Integer base_score;
    private PalParkArea area;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getBase_score() {
        return base_score;
    }

    public void setBase_score(Integer base_score) {
        this.base_score = base_score;
    }

    public PalParkArea getArea() {
        return area;
    }

    public void setArea(PalParkArea area) {
        this.area = area;
    }
}
