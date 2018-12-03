package com.jacky.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// 使用服务发现时的配置
//@EnableEurekaClient
public class AppClient {

    public static void main(String[] args) {
        SpringApplication.run(AppClient.class, args);
    }

}
