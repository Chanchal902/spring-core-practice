package com.backend.iocdi.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public HelloBean() {
        System.out.println("Constructor : The object has been created!");
    }

    public void sayHello() {
        System.out.println("Hello from Spring!");
    }
}
