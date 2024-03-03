package com.SpringBootJDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
