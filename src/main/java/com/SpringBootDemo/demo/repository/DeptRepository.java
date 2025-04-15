package com.SpringBootDemo.demo.repository;

import com.SpringBootDemo.demo.entity.DeptEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<DeptEntity, Integer> {
}