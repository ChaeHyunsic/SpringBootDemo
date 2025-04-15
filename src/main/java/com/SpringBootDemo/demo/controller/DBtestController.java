package com.SpringBootDemo.demo.controller;

import com.SpringBootDemo.demo.entity.DeptEntity;
import com.SpringBootDemo.demo.repository.DeptRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DBtestController {

    private final DeptRepository deptRepository;

    public DBtestController(DeptRepository deptRepository) {
        this.deptRepository = deptRepository;
    }

    @GetMapping
    public List<DeptEntity> getAllDepts() {
        return deptRepository.findAll();
    }
}