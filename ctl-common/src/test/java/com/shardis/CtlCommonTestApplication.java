package com.shardis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by Tomasz Kucharzyk
 */

@SpringBootApplication
@EnableCaching
public class ShardisCommonTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardisCommonTestApplication.class, args);
    }

}
