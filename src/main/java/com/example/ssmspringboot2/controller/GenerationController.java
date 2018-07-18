package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.GenerationService;
import com.example.ssmspringboot2.domain.generation.GenerationDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class GenerationController {
    private GenerationService generationService;
    @Autowired
    public void setGenerationService(GenerationService generationService){
        this.generationService = generationService;
    }

    @RequestMapping(value = "generation/{id}", method = RequestMethod.GET)
    public GenerationDetail getGenerationByID(@PathVariable int id){
        return generationService.findGenerationByID(id);
    }
}
