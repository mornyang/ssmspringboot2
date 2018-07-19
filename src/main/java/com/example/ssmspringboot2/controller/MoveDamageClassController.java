package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.MoveDamageClassService;
import com.example.ssmspringboot2.domain.moveDamageClass.MoveDamageClassDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class MoveDamageClassController {
    private MoveDamageClassService moveDamageClassService;
    @Autowired
    public void setMoveDamageClassService(MoveDamageClassService moveDamageClassService){
        this.moveDamageClassService = moveDamageClassService;
    }

    @RequestMapping(value = "move-damage-class/{id}", method = RequestMethod.GET)
    public MoveDamageClassDetail getMoveDamageClassByID(@PathVariable int id){
        return moveDamageClassService.findMoveDamageClassServiceByID(id);
    }
}
