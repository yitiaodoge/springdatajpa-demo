package com.example.demo.service.impl;

import com.example.demo.entity.Things;
import com.example.demo.repository.ThingsRepository;
import com.example.demo.service.ThingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThingsServiceImpl implements ThingsService {

    @Autowired
    private ThingsRepository repository;

    @Override
    public Things save(Things things) {
        return repository.save(things);
    }

    @Override
    public Things find(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public List<Things> findall() {
        return repository.findAll();
    }
}
