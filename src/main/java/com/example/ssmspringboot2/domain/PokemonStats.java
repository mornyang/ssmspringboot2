package com.example.ssmspringboot2.domain;

public class PokemonStats {
    private Stat stat;
    private Integer effort;
    private Integer base_stat;

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public Integer getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(Integer base_stat) {
        this.base_stat = base_stat;
    }
}
