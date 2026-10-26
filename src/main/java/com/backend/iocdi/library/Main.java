package com.backend.iocdi.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService service = context.getBean(BookService.class);

        service.addBook("Clean Code", "Robert Martin");
        service.addBook("Effective Java", "Joshua Bloch");

        for (Book b : service.getAllBooks()) {
            System.out.println(b);
        }

        context.close();
    }
}
