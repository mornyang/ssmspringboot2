package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.NatureService;
import com.example.ssmspringboot2.domain.nature.NatureDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class NatureController {
    private NatureService natureService;
    @Autowired
    public void setNatureService(NatureService natureService){
        this.natureService = natureService;
    }

    @RequestMapping(value = "nature/{id}", method = RequestMethod.GET)
    public NatureDetail getNatureByID(@PathVariable int id){
        return natureService.findNatureByID(id);
    }
}
