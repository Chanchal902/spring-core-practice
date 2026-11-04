package com.backend.iocdi.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service = context.getBean(StudentService.class);

        service.addStudent("Harsh", 12);
        service.addStudent("Chanchal", 13);

        service.printStudent();
    }
}

// Annotation based configuration
