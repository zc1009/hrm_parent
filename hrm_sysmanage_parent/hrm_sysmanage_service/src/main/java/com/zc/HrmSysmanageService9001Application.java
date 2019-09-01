package com.zc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HrmSysmanageService9001Application {
    public static void main(String[] args) {
        SpringApplication.run(HrmSysmanageService9001Application.class,args);
    }
}
