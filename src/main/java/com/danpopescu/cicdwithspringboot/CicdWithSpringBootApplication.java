package com.danpopescu.cicdwithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdWithSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdWithSpringBootApplication.class, args);
    }

    @GetMapping
    public String home() {
        return "<h1>Hello from the CI/CD demo project!</h1>";
    }
}
