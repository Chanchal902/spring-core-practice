package com.backend.iocdi.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean
    public EmailClient emailClient(@Value("${email.host}") String host,
                                   @Value("${email.port}") int port) {
        return new EmailClient(host, port);
    }
}
