package com.example1.hy.demo;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "students")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private LocalDate dob;

    public Student(String name, String email, LocalDate dob){
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public void setId(long id){
        this.id = id ;
    }

    public long getId(){
        return this.id;
    }

      public void setName(String name){
        this.name = name ;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.name = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setDob(LocalDate dob){
        this.dob = dob ;
    }

    public LocalDate getDob(){
        return this.dob;
    }

    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }

}
