package com.jacky.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class AppProducer {
    public static void main(String[] args) {
        SpringApplication.run(AppProducer.class, args);
    }
}
