package com.centurylink.pctl.mod.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by Begin Samuel
 */
@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
public class PctlNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(PctlNotificationApplication.class, args);
    }
}
