package org.swh.spray.user;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SprayRegistryCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(SprayRegistryCenterApp.class,args);
    }
}
