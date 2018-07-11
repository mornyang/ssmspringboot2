package com.example.ssmspringboot2.domain.stat;

import com.example.ssmspringboot2.domain.link.Nature;

import java.util.List;

public class AffectingNature {
    private List<Nature> increase;
    private List<Nature> decrease;

    public List<Nature> getIncrease() {
        return increase;
    }

    public void setIncrease(List<Nature> increase) {
        this.increase = increase;
    }

    public List<Nature> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<Nature> decrease) {
        this.decrease = decrease;
    }

    @Override
    public String toString() {
        return "AffectingNature{" +
                "increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }
}
