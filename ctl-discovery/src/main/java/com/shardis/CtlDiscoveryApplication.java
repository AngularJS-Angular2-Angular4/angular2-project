package com.shardis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Tomasz Kucharzyk
 */
@SpringBootApplication
@EnableEurekaServer
public class ShardisDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardisDiscoveryApplication.class, args);
    }

}
