package com.centurylink.pctl.mod.product;

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
//@EnableCaching
@ComponentScan({"com.centurylink.pctl.mod.product", "com.centurylink.pctl.mod.core"})
public class PctlProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(PctlProductApplication.class, args);
    }




}
