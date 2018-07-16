package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.MoveLearnMethodService;
import com.example.ssmspringboot2.domain.moveLearnMethod.MoveLearnMethodDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class MoveLearnMethodController {
    private MoveLearnMethodService moveLearnMethodService;
    @Autowired
    public void setMoveLearnMethodService(MoveLearnMethodService moveLearnMethodService){
        this.moveLearnMethodService = moveLearnMethodService;
    }

    @RequestMapping(value = "move-learn-method/{id}", method = RequestMethod.GET)
    public MoveLearnMethodDetail getMoveLearnMethodByID(@PathVariable int id){
        return moveLearnMethodService.findMoveLearnMethodByID(id);
    }
}
