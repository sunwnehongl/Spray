package org.swh.spray.user;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SprayUserServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(SprayUserServiceApp.class,args);
    }
}
