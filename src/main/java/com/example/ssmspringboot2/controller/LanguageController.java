package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.LanguageService;
import com.example.ssmspringboot2.domain.language.LanguageDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class LanguageController {
    private LanguageService languageService;
    @Autowired
    public void setLanguageService(LanguageService languageService){
        this.languageService = languageService;
    }

    @RequestMapping(value = "language/{id}", method = RequestMethod.GET)
    public LanguageDetail getLanguageByID(@PathVariable int id){
        return languageService.findLanguageByID(id);
    }
}
