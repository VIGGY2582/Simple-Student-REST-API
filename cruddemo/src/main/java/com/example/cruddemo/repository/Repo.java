package com.example.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cruddemo.entity.Student;
public interface Repo extends JpaRepository< Student , Integer>{

}


