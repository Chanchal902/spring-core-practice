package com.backend.iocdi.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailClient client = context.getBean(EmailClient.class);
        client.send("Hello Chanchal");

        context.close();
    }
}
