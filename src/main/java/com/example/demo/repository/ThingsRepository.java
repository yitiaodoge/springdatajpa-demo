package com.example.demo.repository;

import com.example.demo.entity.Things;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThingsRepository extends JpaRepository<Things,Integer> {

    List<Things> findAllByIdIsBetween(int a,int b);
}
