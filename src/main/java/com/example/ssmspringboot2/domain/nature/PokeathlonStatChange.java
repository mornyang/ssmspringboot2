package com.example.ssmspringboot2.domain.nature;

import com.example.ssmspringboot2.domain.link.PokeathlonStat;

public class PokeathlonStatChange {
    private Integer max_change;
    private PokeathlonStat pokeathlon_stat;

    public Integer getMax_change() {
        return max_change;
    }

    public void setMax_change(Integer max_change) {
        this.max_change = max_change;
    }

    public PokeathlonStat getPokeathlon_stat() {
        return pokeathlon_stat;
    }

    public void setPokeathlon_stat(PokeathlonStat pokeathlon_stat) {
        this.pokeathlon_stat = pokeathlon_stat;
    }
}
