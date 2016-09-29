package com.centurylink.pctl.mod.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Tomasz Kucharzyk
 */
@SpringBootApplication
@EnableEurekaServer
public class PctlDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PctlDiscoveryApplication.class, args);
    }

}
