package com.example.ssmspringboot2.domain.pokemon;

import com.example.ssmspringboot2.domain.link.MoveLearnMethod;
import com.example.ssmspringboot2.domain.link.VersionGroup;

public class MoveVersionGroup {
    private MoveLearnMethod moveLearnMethod;
    private Integer level_learned_at;
    private VersionGroup versionGroup;

    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public Integer getLevel_learned_at() {
        return level_learned_at;
    }

    public void setLevel_learned_at(Integer level_learned_at) {
        this.level_learned_at = level_learned_at;
    }

    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }
}
