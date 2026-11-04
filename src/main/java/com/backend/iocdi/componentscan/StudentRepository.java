package com.backend.iocdi.componentscan;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StudentRepository {
    ArrayList<Student> arrayList = new ArrayList<>();

    public void save(Student student) {
        arrayList.add(student);
    }

    public void print() {
        for (Student student : arrayList) {
            System.out.println("Name: " + student.getName()
                    + ", Roll: " + student.getRoll());
        }
    }
}
