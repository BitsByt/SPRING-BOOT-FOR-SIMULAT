package com.example.demo.services;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void registerStudent(Student student) {
        studentRepository.save(student);
    }
}