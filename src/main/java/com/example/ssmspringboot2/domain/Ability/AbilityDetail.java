package com.example.ssmspringboot2.domain.Ability;

public class AbilityDetail {
    private Integer id;
    private Boolean is_main_series;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIs_main_series() {
        return is_main_series;
    }

    public void setIs_main_series(Boolean is_main_series) {
        this.is_main_series = is_main_series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
