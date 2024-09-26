package com.va.week4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.va.week4.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
