package com.example.todos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class ToDoSApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoSApplication.class, args);
    }

}
