package com.example.ssmspringboot2.domain.version;

import com.example.ssmspringboot2.domain.common.Name;
import com.example.ssmspringboot2.domain.link.VersionGroup;

import java.util.List;

public class VersionInfo {
    private Integer id;
    private String name;
    private VersionGroup version_group;
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

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}
