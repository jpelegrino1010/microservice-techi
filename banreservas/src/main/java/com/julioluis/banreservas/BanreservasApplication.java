package com.julioluis.banreservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class BanreservasApplication {

    public static void main(String[] args) {
        SpringApplication.run(BanreservasApplication.class, args);
    }

}
