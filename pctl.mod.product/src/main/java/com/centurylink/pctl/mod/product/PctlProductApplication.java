package com.centurylink.pctl.mod.product;

import com.centurylink.pctl.mod.product.domain.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by Begin Samuel
 */
@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
//@EnableCaching
public class PctlProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(PctlProductApplication.class, args);
    }




}
