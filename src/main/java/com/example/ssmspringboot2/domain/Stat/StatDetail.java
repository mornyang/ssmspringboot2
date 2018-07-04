package com.example.ssmspringboot2.domain.Stat;

import com.example.ssmspringboot2.domain.link.Characteristic;
import com.example.ssmspringboot2.domain.link.MoveDamageClass;
import com.example.ssmspringboot2.domain.link.Name;

import java.util.List;

public class StatDetail {
    private Integer id;
    private String name;
    private Boolean is_battle_only;
    private Integer game_index;
    private MoveDamageClass move_damage_class;
    private List<Name> names;
    private AffectingNature affectingNature;
    private AffectingMove affectingMove;
    private List<Characteristic> characteristics;

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

    public Boolean getIs_battle_only() {
        return is_battle_only;
    }

    public void setIs_battle_only(Boolean is_battle_only) {
        this.is_battle_only = is_battle_only;
    }

    public Integer getGame_index() {
        return game_index;
    }

    public void setGame_index(Integer game_index) {
        this.game_index = game_index;
    }

    public MoveDamageClass getMove_damage_class() {
        return move_damage_class;
    }

    public void setMove_damage_class(MoveDamageClass move_damage_class) {
        this.move_damage_class = move_damage_class;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public AffectingNature getAffectingNature() {
        return affectingNature;
    }

    public void setAffectingNature(AffectingNature affectingNature) {
        this.affectingNature = affectingNature;
    }

    public AffectingMove getAffectingMove() {
        return affectingMove;
    }

    public void setAffectingMove(AffectingMove affectingMove) {
        this.affectingMove = affectingMove;
    }

    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }
}
