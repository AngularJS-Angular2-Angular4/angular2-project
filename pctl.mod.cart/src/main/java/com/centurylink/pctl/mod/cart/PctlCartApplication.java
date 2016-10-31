package com.centurylink.pctl.mod.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by Begin Samuel
 */
@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
@ComponentScan("com.centurylink.pctl.mod")
public class PctlCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(PctlCartApplication.class, args);
    }




}
