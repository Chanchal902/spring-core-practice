package com.backend.iocdi.studentApp;

public class StudentService {
    StudentRepository obj = new StudentRepository();

    public void addStudents() {
        obj.addStudent("Chanchal", 101, 96);
        obj.addStudent("Harsh", 102, 83);
    }

    public void printStudents() {
        obj.print();
    }
}
