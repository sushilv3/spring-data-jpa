package com.kodecamp.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodecamp.springdatajpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
