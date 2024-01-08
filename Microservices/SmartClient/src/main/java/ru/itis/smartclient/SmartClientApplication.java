package ru.itis.smartclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SmartClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartClientApplication.class, args);
    }

}
