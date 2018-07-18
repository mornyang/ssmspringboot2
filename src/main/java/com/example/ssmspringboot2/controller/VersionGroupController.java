package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.VersionGroupService;
import com.example.ssmspringboot2.domain.VersionGroupDetail.VersionGroupDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class VersionGroupController {
    private VersionGroupService versionGroupService;
    @Autowired
    public void setVersionGroupService(VersionGroupService versionGroupService){
        this.versionGroupService = versionGroupService;
    }

    @RequestMapping(value = "version-group/{id}", method = RequestMethod.GET)
    public VersionGroupDetail getVersionGroupByID(@PathVariable int id){
        return versionGroupService.findVersionGroupByID(id);
    }
}
