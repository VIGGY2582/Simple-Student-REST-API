package com.example.cruddemo.service;

import com.example.cruddemo.entity.Student;
import com.example.cruddemo.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private Repo repository;


    public Student saveStudent(Student student) {

        return repository.save(student);
    }


    public List<Student> getStudents() {

        return repository.findAll();
    }

    public void deleteStudent(int id) {

        repository.deleteById(id);
    }


    public Student updateStudent(Student student) {

        return repository.save(student);
    }
}