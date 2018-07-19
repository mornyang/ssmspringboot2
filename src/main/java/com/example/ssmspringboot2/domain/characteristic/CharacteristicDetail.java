package com.example.ssmspringboot2.domain.characteristic;

import com.example.ssmspringboot2.domain.common.Description;
import com.example.ssmspringboot2.domain.link.Stat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CharacteristicDetail {
    private Integer id;
    private Integer gene_modulo;
    private Stat highest_stat;
    private List<Integer> possible_values;
    private List<Description> descriptions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGene_modulo() {
        return gene_modulo;
    }

    public void setGene_modulo(Integer gene_modulo) {
        this.gene_modulo = gene_modulo;
        List<Integer> s = new ArrayList<Integer>();
        for(int i = 0;i <= 30;i++){
            if(i%5 == gene_modulo){
                s.add(i);
            }
        }
        this.possible_values = s;
    }

    public Stat getHighest_stat() {
        return highest_stat;
    }

    public void setHighest_stat(Stat highest_stat) {
        this.highest_stat = highest_stat;
    }

    public List<Integer> getPossible_values() {
        return possible_values;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }
}
