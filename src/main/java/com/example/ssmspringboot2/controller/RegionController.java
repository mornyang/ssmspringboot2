package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.RegionService;
import com.example.ssmspringboot2.domain.region.RegionDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class RegionController {
    private RegionService regionService;
    @Autowired
    public void setRegionService(RegionService regionService){
        this.regionService = regionService;
    }

    @RequestMapping(value = "region/{id}",method = RequestMethod.GET)
    public RegionDetail getRegionByID(@PathVariable int id){
        return regionService.findRegionByID(id);
    }
}
