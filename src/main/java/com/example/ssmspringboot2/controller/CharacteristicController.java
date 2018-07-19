package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.CharacteristicService;
import com.example.ssmspringboot2.domain.characteristic.CharacteristicDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class CharacteristicController {
    private CharacteristicService characteristicService;
    @Autowired
    public void setCharacteristicService(CharacteristicService characteristicService){
        this.characteristicService = characteristicService;
    }

    @RequestMapping(value = "characteristic/{id}", method = RequestMethod.GET)
    public CharacteristicDetail getCharacteristicByID(@PathVariable int id){
        return characteristicService.findCharacteristicByID(id);
    }
}
