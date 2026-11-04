package com.backend.iocdi.studentsApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public StudentRepository studentrepo() {
        StudentRepository studentRepository = new StudentRepository();
        return studentRepository;
    }

    @Bean
    public StudentService studentser(StudentRepository studentRepository) {
        StudentService studentService = new StudentService(studentRepository);
        return studentService;
    }
}
