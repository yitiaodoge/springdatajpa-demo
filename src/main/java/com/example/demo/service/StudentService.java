package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findall();
    Student save(Student student);
    void delete(Long id);
    void delete(Student student);
}
