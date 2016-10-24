package com.centurylink.pctl.mod.address;

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
//@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
//@EnableCaching
public class PctlAddressApplication {

    public static void main(String[] args) {
        SpringApplication.run(PctlAddressApplication.class, args);
    }




}
