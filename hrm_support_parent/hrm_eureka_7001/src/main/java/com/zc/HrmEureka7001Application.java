package com.zc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HrmEureka7001Application {
    public static void main(String[] args) {
        SpringApplication.run(HrmEureka7001Application.class,args);
    }
}
