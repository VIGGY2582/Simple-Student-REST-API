package com.example.cruddemo.controller;

import com.example.cruddemo.entity.Student;
import com.example.cruddemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {

        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {

        return service.getStudents();
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {

        service.deleteStudent(id);

        return "Student Deleted";
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {

        return service.updateStudent(student);
    }
}