package com.example1.hy.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

   // public default List<Student> getAllStudents() {
   // return findAll();
   //List<Student> findAllStudents();
   
}
    
