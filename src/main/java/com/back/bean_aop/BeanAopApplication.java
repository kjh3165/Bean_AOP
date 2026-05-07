package com.back.bean_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BeanAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanAopApplication.class, args);
    }

}
