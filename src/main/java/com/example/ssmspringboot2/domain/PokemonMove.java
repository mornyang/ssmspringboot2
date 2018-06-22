package com.example.ssmspringboot2.domain;

import java.util.List;

public class PokemonMove {
    private List<MoveVersionGroup> moveVersionGroups;
    private Move move;

    public List<MoveVersionGroup> getMoveVersionGroups() {
        return moveVersionGroups;
    }

    public void setMoveVersionGroups(List<MoveVersionGroup> moveVersionGroups) {
        this.moveVersionGroups = moveVersionGroups;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }
}
