package com.example.ssmspringboot2.domain.stat;

import java.util.List;

public class AffectingMove {
    private List<MoveChange> increase;
    private List<MoveChange> decrease;

    public List<MoveChange> getIncrease() {
        return increase;
    }

    public void setIncrease(List<MoveChange> increase) {
        this.increase = increase;
    }

    public List<MoveChange> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<MoveChange> decrease) {
        this.decrease = decrease;
    }

    @Override
    public String toString() {
        return "AffectingMove{" +
                "increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }
}
