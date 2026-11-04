package com.backend.iocdi.studentsApp;

import java.util.ArrayList;

public class StudentRepository {
    ArrayList<Student> arrayList = new ArrayList<>();

    public void addStudent(Student student) {
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
