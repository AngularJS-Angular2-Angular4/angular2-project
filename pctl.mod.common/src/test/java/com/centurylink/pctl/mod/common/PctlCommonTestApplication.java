package com.centurylink.pctl.mod.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by Begin Samuel
 */

@SpringBootApplication
@EnableCaching
public class PctlCommonTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PctlCommonTestApplication.class, args);
    }

}
