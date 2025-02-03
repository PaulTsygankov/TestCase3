package com.example.testcase3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCase3Application {

    public static void main(String[] args) {
        SpringApplication.run(TestCase3Application.class, args);
        System.out.println("http://localhost:8080/");
    }

}
