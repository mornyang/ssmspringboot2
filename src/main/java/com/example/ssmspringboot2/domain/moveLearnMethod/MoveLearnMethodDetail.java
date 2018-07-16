package com.example.ssmspringboot2.domain.moveLearnMethod;

import com.example.ssmspringboot2.domain.common.Description;
import com.example.ssmspringboot2.domain.common.Name;
import com.example.ssmspringboot2.domain.link.VersionGroup;

import java.util.List;

public class MoveLearnMethodDetail {
    private Integer id;
    private String name;
    private List<VersionGroup> version_group;
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

    public List<VersionGroup> getVersion_group() {
        return version_group;
    }

    public void setVersion_group(List<VersionGroup> version_group) {
        this.version_group = version_group;
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
