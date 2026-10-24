package com.backend.iocdi.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloBean bean = context.getBean(HelloBean.class);
        bean.sayHello();

        context.close();
    }
}
