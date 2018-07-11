package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.service.TypeService;
import com.example.ssmspringboot2.domain.type.TypeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")
public class TypeController {
    private TypeService typeService;
    //依赖注入
    @Autowired
    public void setTypeService(TypeService typeService) { this.typeService = typeService; }

    @RequestMapping(value = "type/{id}",method = RequestMethod.GET)
    public TypeDetail getTypeByID(@PathVariable int id){
        return typeService.findTypeByID(id);
    }
}
