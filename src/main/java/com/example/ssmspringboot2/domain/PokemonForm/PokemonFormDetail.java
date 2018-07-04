package com.example.ssmspringboot2.domain.PokemonForm;

public class PokemonFormDetail {
    private Integer id;
    private Integer order;
    private String name;
    private String form_name;
    private Integer form_order;
    private Boolean is_default;
    private Boolean is_battle_only;
    private Boolean is_mega;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public Integer getForm_order() {
        return form_order;
    }

    public void setForm_order(Integer form_order) {
        this.form_order = form_order;
    }

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    public Boolean getIs_battle_only() {
        return is_battle_only;
    }

    public void setIs_battle_only(Boolean is_battle_only) {
        this.is_battle_only = is_battle_only;
    }

    public Boolean getIs_mega() {
        return is_mega;
    }

    public void setIs_mega(Boolean is_mega) {
        this.is_mega = is_mega;
    }
}
