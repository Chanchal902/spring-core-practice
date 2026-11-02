package com.backend.iocdi.studentApp;

import java.util.ArrayList;

public class StudentRepository {
    ArrayList<Student> arrayList = new ArrayList<>();

    public void addStudent(String name, int roll, int marks) {
        Student student = new Student(name, roll, marks);
        arrayList.add(student);
    }

    public void print() {
        for (Student student : arrayList) {
            System.out.println("Name: " + student.getName()
                    + ", Roll: " + student.getRoll()
                    + ", Marks: " + student.getMarks());
        }
    }
}
