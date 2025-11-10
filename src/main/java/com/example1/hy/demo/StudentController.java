package com.example1.hy.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Students")
public class StudentController {

    @GetMapping()
    public List<Student> getStudents( StudentService studentService ){
        return studentService.getStudents();
    }
}
