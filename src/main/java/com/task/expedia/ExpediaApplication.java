package com.task.expedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ExpediaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpediaApplication.class, args);
    }

}
