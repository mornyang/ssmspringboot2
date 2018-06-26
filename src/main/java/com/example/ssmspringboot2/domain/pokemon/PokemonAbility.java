package com.example.ssmspringboot2.domain.pokemon;

import com.example.ssmspringboot2.domain.link.Ability;

public class PokemonAbility {
    private Integer slot;
    private boolean is_hidden;
    private Ability ability;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
