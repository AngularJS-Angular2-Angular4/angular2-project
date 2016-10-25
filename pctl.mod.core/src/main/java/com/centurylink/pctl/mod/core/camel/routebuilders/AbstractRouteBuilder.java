package com.centurylink.pctl.mod.core.camel.routebuilders;

import com.centurylink.pctl.mod.core.camel.CamelException;
import com.centurylink.pctl.mod.core.camel.config.CamelConfig;
import com.centurylink.pctl.mod.core.camel.config.CamelDigesterBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by s-arunkumar on 25-10-2016.
 */
@Configuration
@PropertySource("classpath:application.properties")
public abstract class AbstractRouteBuilder extends RouteBuilder {


    private static final Logger logger = Logger
        .getLogger(AbstractRouteBuilder.class);

    @Value("${camel.config.filepath}")
    private String configFilepath;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public CamelConfig bindingConfig() throws CamelException {
        logger.info("Camel-biding9-config path: " + configFilepath);
        CamelDigesterBuilder builder = new CamelDigesterBuilder(configFilepath);
        CamelConfig mqConfig = builder.build();
        return mqConfig;
    }

}
