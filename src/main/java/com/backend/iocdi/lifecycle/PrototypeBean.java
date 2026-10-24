package com.backend.iocdi.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Prototype: Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Prototype: @PostConstruct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Prototype: @PreDestroy");
    }
}
