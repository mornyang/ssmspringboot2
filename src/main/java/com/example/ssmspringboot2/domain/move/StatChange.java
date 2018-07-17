package com.example.ssmspringboot2.domain.move;

import com.example.ssmspringboot2.domain.link.Stat;

public class StatChange {
    private Integer change;
    private Stat stat;

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }
}
