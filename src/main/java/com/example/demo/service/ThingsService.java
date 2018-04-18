package com.example.demo.service;

import com.example.demo.entity.Things;

import java.util.List;

public interface ThingsService {
    Things save(Things things);
    Things find(Integer id);
    List<Things> findall();
}
