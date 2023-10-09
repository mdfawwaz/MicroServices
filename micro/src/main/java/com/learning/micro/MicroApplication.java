package com.learning.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class MicroApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroApplication.class, args);
    }
}
