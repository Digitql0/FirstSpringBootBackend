package com.example.firstjavabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstJavaBackendApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(FirstJavaBackendApplication.class, args);
        System.out.println("LOL");
    }

    @GetMapping("/")
    public static void home() {
        System.out.println("This is home");
    }

}
