package com.example.ssmspringboot2.domain.nature;

import com.example.ssmspringboot2.domain.link.MoveBattleStyle;

public class MoveBattleStylePreferences {
    private Integer high_hp_preference;
    private Integer low_hp_preference;
    private MoveBattleStyle move_battle_style;

    public Integer getHigh_hp_preference() {
        return high_hp_preference;
    }

    public void setHigh_hp_preference(Integer high_hp_preference) {
        this.high_hp_preference = high_hp_preference;
    }

    public Integer getLow_hp_preference() {
        return low_hp_preference;
    }

    public void setLow_hp_preference(Integer low_hp_preference) {
        this.low_hp_preference = low_hp_preference;
    }

    public MoveBattleStyle getMove_battle_style() {
        return move_battle_style;
    }

    public void setMove_battle_style(MoveBattleStyle move_battle_style) {
        this.move_battle_style = move_battle_style;
    }
}
