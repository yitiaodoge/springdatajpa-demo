package com.example.demo.rest;

import com.example.demo.entity.Things;
import com.example.demo.service.ThingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/t")
@RestController
public class ThingsRest {

    @Autowired
    private ThingsService service;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Things save(@RequestBody Things things){
        return service.save(things);
    }

    @GetMapping(value = "/find")
    public Things find(Integer id){
        return service.find(id);
    }

    @GetMapping(value = "/findall")
    public List<Things> findall(){
        return service.findall();
    }


}
