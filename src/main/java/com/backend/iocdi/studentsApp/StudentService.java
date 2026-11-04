package com.backend.iocdi.studentsApp;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudents(String name, int roll, int marks) {
        Student stud = new Student(name, roll, marks);
        studentRepository.addStudent(stud);
    }

    public void printStudents() {
        studentRepository.print();
    }
}
