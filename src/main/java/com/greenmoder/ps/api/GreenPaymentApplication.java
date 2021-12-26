package com.greenmoder.ps.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GreenPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreenPaymentApplication.class, args);
    }

}
