package com.example.ssmspringboot2.domain;

public class TypeDetail {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "TypeDetail{" +
                "name=" + name +
                ", id=" + id +
                "}";
    }
}
