package com.example.ssmspringboot2.domain;

public class Type {
    private Integer id;
    private Integer generation_id;
    private Integer move_damage_class_id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGeneration_id() {
        return generation_id;
    }

    public void setGeneration_id(Integer generation_id) {
        this.generation_id = generation_id;
    }

    public Integer getMove_damage_class_id() {
        return move_damage_class_id;
    }

    public void setMove_damage_class_id(Integer move_damage_class_id) {
        this.move_damage_class_id = move_damage_class_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
