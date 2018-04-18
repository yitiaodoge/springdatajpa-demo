package com.example.demo.rest;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/u")
public class UserRest {

    @Autowired
    private UserService service;

    @PostMapping(value = "/save")
    public User save(@RequestBody User user) {

        return service.save(user);
    }

    @GetMapping(value = "/findbyage")
    public User findByAge(Integer age){

        return service.findByAge(age);
    }
}
