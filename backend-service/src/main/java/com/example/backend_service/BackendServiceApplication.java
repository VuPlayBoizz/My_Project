package com.example.backend_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients  // Feign Client phải được bật
public class BackendServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackendServiceApplication.class, args);
    }
}
