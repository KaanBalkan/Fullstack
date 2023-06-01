package com.kaan.studentsytem.service;

import com.kaan.studentsytem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}