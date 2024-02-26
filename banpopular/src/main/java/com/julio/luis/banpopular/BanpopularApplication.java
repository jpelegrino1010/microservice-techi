package com.julio.luis.banpopular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.julio.luis.banpopular.proxies")
@EnableDiscoveryClient
public class BanpopularApplication {

    public static void main(String[] args) {
        SpringApplication.run(BanpopularApplication.class, args);
    }

}
