package com.example.ssmspringboot2.domain.moveDamageClass;

import com.example.ssmspringboot2.domain.common.Description;
import com.example.ssmspringboot2.domain.common.Name;
import com.example.ssmspringboot2.domain.link.MoveLink;

import java.util.List;

public class MoveDamageClassDetail {
    private Integer id;
    private String name;
    private List<MoveLink> moves;
    private List<Description> descriptions;
    private List<Name> names;

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

    public List<MoveLink> getMoves() {
        return moves;
    }

    public void setMoves(List<MoveLink> moves) {
        this.moves = moves;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}
