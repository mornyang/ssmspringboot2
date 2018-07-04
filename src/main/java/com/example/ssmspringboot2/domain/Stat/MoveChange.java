package com.example.ssmspringboot2.domain.Stat;

import com.example.ssmspringboot2.domain.link.MoveLink;

public class MoveChange {
    private MoveLink move;
    private Integer change;

    public MoveLink getMove() {
        return move;
    }

    public void setMove(MoveLink move) {
        this.move = move;
    }

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "MoveChange{" +
                "move=" + move +
                ", change=" + change +
                '}';
    }
}
