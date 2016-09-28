package com.shardis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Tomasz Kucharzyk
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
public class ShardisAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardisAuthApplication.class, args);
    }

}
