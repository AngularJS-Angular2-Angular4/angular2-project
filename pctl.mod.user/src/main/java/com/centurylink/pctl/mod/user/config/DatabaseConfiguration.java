package com.centurylink.pctl.mod.user.config;


import com.centurylink.pctl.mod.core.config.AbstractDatabaseConfiguration;
import org.mongeez.Mongeez;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories("com.centurylink.pctl.mod.user")
@Import(value = MongoAutoConfiguration.class)
@EnableMongoAuditing(auditorAwareRef = "springSecurityAuditorAware")
public class DatabaseConfiguration extends AbstractDatabaseConfiguration {

    private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);


    @Bean
    @Profile("test")
    public Mongeez mongeez() {
        log.debug("Configuring Mongeez");
        Mongeez mongeez = new Mongeez();
        mongeez.setFile(new ClassPathResource("/config/mongeez/master.xml"));
        mongeez.setMongo(mongo);
        mongeez.setDbName(getMongoClientURI().getDatabase());
        mongeez.process();
        return mongeez;
    }

}
