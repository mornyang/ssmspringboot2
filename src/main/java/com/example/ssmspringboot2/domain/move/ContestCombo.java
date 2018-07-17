package com.example.ssmspringboot2.domain.move;

import com.example.ssmspringboot2.domain.link.MoveLink;

import java.util.List;

public class ContestCombo {
    private List<MoveLink> use_after;
    private List<MoveLink> use_before;

    public List<MoveLink> getUse_after() {
        return use_after;
    }

    public void setUse_after(List<MoveLink> use_after) {
        this.use_after = use_after;
    }

    public List<MoveLink> getUse_before() {
        return use_before;
    }

    public void setUse_before(List<MoveLink> use_before) {
        this.use_before = use_before;
    }
}
