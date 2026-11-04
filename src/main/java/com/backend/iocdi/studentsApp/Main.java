package com.backend.iocdi.studentsApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service = context.getBean(StudentService.class);

        service.addStudents("Chanchal", 101, 98);
        service.addStudents("Harsh", 102, 87);

        service.printStudents();
    }
}
