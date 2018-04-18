package com.example.demo.service.impl;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository repository;

    @Override
    public Teacher findall() {
        return repository.findAll().get(0);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return repository.save(teacher);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public void delete(Teacher teacher) {
        repository.delete(teacher);
    }
}
