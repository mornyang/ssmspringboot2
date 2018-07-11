package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.Service.StatService;
import com.example.ssmspringboot2.domain.Stat.StatDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class StatController {
    private StatService statService;
    @Autowired
    public void setStatService(StatService statService){
        this.statService = statService;
    }

    @RequestMapping(value = "stat/{id}", method = RequestMethod.GET)
    public StatDetail getStatByID(@PathVariable int id){
        return statService.findStatByID(id);
    }
}
