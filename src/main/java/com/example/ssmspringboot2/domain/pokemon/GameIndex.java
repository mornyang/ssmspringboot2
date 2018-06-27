package com.example.ssmspringboot2.domain.pokemon;

import com.example.ssmspringboot2.domain.link.Version;

public class GameIndex {
    private Integer game_index;
    private Version version;

    public Integer getGame_index() {
        return game_index;
    }

    public void setGame_index(Integer game_index) {
        this.game_index = game_index;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "GameIndex{" +
                "game_index=" + game_index +
                ", version=" + version +
                '}';
    }
}
