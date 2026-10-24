package com.backend.iocdi.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Singleton: Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Singleton: @PostConstruct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Singleton: @PreDestroy");
    }
}
