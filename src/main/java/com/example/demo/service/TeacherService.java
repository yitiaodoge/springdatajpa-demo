package com.example.demo.service;

import com.example.demo.entity.Teacher;

public interface TeacherService {
    Teacher findall();
    Teacher save(Teacher teacher);
    void delete(Long id);
    void delete(Teacher teacher);
}
