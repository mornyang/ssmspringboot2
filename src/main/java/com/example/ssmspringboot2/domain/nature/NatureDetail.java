package com.example.ssmspringboot2.domain.nature;

import com.example.ssmspringboot2.domain.common.Name;
import com.example.ssmspringboot2.domain.link.BerryFlavor;
import com.example.ssmspringboot2.domain.link.Stat;

import java.util.List;

public class NatureDetail {
    private Integer id;
    private String name;
    private Stat decreased_stat;
    private Stat increased_stat;
    private BerryFlavor hates_flavor;
    private BerryFlavor likes_flavor;
    private List<Name> names;
    private List<MoveBattleStylePreferences> move_battle_style_preferences;
    private List<PokeathlonStatChange> pokeathlon_stat_changes;

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

    public Stat getDecreased_stat() {
        return decreased_stat;
    }

    public void setDecreased_stat(Stat decreased_stat) {
        this.decreased_stat = decreased_stat;
    }

    public Stat getIncreased_stat() {
        return increased_stat;
    }

    public void setIncreased_stat(Stat increased_stat) {
        this.increased_stat = increased_stat;
    }

    public BerryFlavor getHates_flavor() {
        return hates_flavor;
    }

    public void setHates_flavor(BerryFlavor hates_flavor) {
        this.hates_flavor = hates_flavor;
    }

    public BerryFlavor getLikes_flavor() {
        return likes_flavor;
    }

    public void setLikes_flavor(BerryFlavor likes_flavor) {
        this.likes_flavor = likes_flavor;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<MoveBattleStylePreferences> getMove_battle_style_preferences() {
        return move_battle_style_preferences;
    }

    public void setMove_battle_style_preferences(List<MoveBattleStylePreferences> move_battle_style_preferences) {
        this.move_battle_style_preferences = move_battle_style_preferences;
    }

    public List<PokeathlonStatChange> getPokeathlon_stat_changes() {
        return pokeathlon_stat_changes;
    }

    public void setPokeathlon_stat_changes(List<PokeathlonStatChange> pokeathlon_stat_changes) {
        this.pokeathlon_stat_changes = pokeathlon_stat_changes;
    }
}
