package com.example.ssmspringboot2.domain.move;

import com.example.ssmspringboot2.domain.link.Machine;
import com.example.ssmspringboot2.domain.link.VersionGroup;

public class MoveMachine {
    private Machine machine;
    private VersionGroup version_group;

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }
}
