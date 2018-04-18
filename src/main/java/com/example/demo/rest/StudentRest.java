package com.example.demo.rest;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/st")
public class StudentRest {

    @Autowired
    private StudentService service;

    @GetMapping(value = "/findall")
    public List<Student> findall(){
        return service.findall();
    }

    @PostMapping(value = "/save")
    public Student save(@RequestBody Student student){
        return service.save(student);
    }

    @GetMapping(value = "/deleteid")
    public void delete(@RequestParam Long id){
        service.delete(id);
    }

    @PostMapping(value = "/deleteen")
    public void delete(Student student){
        service.delete(student);
    }
}
