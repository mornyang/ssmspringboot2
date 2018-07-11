package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.Service.AbilityService;
import com.example.ssmspringboot2.domain.Ability.AbilityDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value="api/")
public class AbilityController {
    private AbilityService abilityService;
    @Autowired
    public void setAbilityService(AbilityService abilityService){
        this.abilityService = abilityService;
    }

    @RequestMapping(value="ability/{id}", method = RequestMethod.GET)
    public AbilityDetail getAbilityByID(@PathVariable int id){
        return abilityService.findAbilityByID(id);
    }
}
