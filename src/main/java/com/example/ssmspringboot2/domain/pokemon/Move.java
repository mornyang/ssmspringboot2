package com.example.ssmspringboot2.domain.pokemon;

import com.example.ssmspringboot2.util.Constant;
import com.example.ssmspringboot2.util.Util;

import java.util.List;

public class Move {
    private String name;
    private String url;
    private List<MoveVersionGroup> moveVersionGroups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) throws Exception{
        this.url = Util.parseUrl(Constant.pokemonMove, url);
    }

    public List<MoveVersionGroup> getMoveVersionGroups() {
        return moveVersionGroups;
    }

    public void setMoveVersionGroups(List<MoveVersionGroup> moveVersionGroups) {
        this.moveVersionGroups = moveVersionGroups;
    }

    @Override
    public String toString() {
        return "Move{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", moveVersionGroups=" + moveVersionGroups +
                '}';
    }
}
