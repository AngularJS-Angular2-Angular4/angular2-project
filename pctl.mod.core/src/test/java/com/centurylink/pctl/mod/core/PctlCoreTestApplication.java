package com.centurylink.pctl.mod.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by Begin Samuel
 */

@SpringBootApplication
@EnableCaching
public class PctlCoreTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PctlCoreTestApplication.class, args);
    }

}
