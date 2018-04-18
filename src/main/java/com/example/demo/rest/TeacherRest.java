package com.example.demo.rest;


import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/te")
public class TeacherRest {

    @Autowired
    private TeacherService service;

    @GetMapping(value = "/findall")
    public Teacher findall(){
        return service.findall();
    }

    @PostMapping(value = "/save")
    public Teacher save(@RequestBody Teacher teacher){
        return service.save(teacher);
    }

    @GetMapping(value = "/delete")
    public void detele(@RequestParam Long id){
        service.delete(id);
    }

    @PostMapping(value = "/de")
    public void delete(@RequestBody Teacher teacher){
        service.delete(teacher);
    }
}
