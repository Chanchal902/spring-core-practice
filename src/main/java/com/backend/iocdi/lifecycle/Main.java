package com.backend.iocdi.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("---- Container ready ----");
        SingletonBean b1 = context.getBean(SingletonBean.class);
        SingletonBean b2 = context.getBean(SingletonBean.class);
        System.out.println("Singleton b1 == b2: " + (b1 == b2));

        PrototypeBean c1 = context.getBean(PrototypeBean.class);
        PrototypeBean c2 = context.getBean(PrototypeBean.class);
        System.out.println("Prototype c1 == c2: " + (c1 == c2));

        System.out.println("---- Closing ----");
        context.close();
    }
}
