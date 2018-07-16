package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.MoveService;
import com.example.ssmspringboot2.domain.move.MoveDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class MoveController {
    private MoveService moveService;
    @Autowired
    public void setMoveService(MoveService moveService){
        this.moveService = moveService;
    }

    @RequestMapping(value = "move/{id}", method = RequestMethod.GET)
    public MoveDetail getMoveByID(@PathVariable int id){
        return moveService.findMoveByID(id);
    }
}
