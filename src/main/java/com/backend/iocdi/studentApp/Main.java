package com.backend.iocdi.studentApp;

public class Main {
    public static void main(String[] args) {
        StudentService ss = new StudentService();
        ss.addStudents();
        ss.printStudents();
    }
}

//Problems in Plain Java:
//        1. Developer has to create objects manually using new.
//        2. StudentService is tightly coupled with StudentRepository.
//        3. Object creation and dependency management are handled manually.
//        4. If dependencies change, code modifications may be required.