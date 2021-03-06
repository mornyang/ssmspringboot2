package com.example.ssmspringboot2.domain.common;

import com.example.ssmspringboot2.domain.link.Version;

public class VersionDetail {
    private Integer rarity;
    private Version version;

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "VersionInfo{" +
                "rarity=" + rarity +
                ", version=" + version +
                '}';
    }
}
