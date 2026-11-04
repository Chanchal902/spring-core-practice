package com.backend.iocdi.componentscan;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(String name, int roll) {
        Student stud = new Student(name, roll);
        studentRepository.save(stud);
    }

    public void printStudent() {
        studentRepository.print();
    }
}
