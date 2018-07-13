package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.VersionService;
import com.example.ssmspringboot2.domain.version.VersionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class VersionController {
    private VersionService versionService;
    @Autowired
    public void setVersionService(VersionService versionService){
        this.versionService = versionService;
    }

    @RequestMapping(value = "version/{id}", method = RequestMethod.GET)
    public VersionInfo getVersionByID(@PathVariable int id){
        return versionService.findVersionByID(id);
    }
}
