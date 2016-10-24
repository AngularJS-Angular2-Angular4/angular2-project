package com.centurylink.pctl.mod.cart.config;

import com.centurylink.pctl.mod.cart.domain.utils.CustomDateTimeSerializer;
import com.centurylink.pctl.mod.cart.domain.utils.JSR310DateTimeSerializer;
import com.centurylink.pctl.mod.cart.domain.utils.JSR310LocalDateDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.joda.time.DateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.*;

@Configuration
public class JacksonConfiguration {

    @Bean
    Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
        SimpleModule jodaModule = new SimpleModule();
        jodaModule.addSerializer(DateTime.class, CustomDateTimeSerializer.INSTANCE);


        JavaTimeModule module = new JavaTimeModule();
        module.addSerializer(OffsetDateTime.class, JSR310DateTimeSerializer.INSTANCE);
        module.addSerializer(ZonedDateTime.class, JSR310DateTimeSerializer.INSTANCE);
        module.addSerializer(LocalDateTime.class, JSR310DateTimeSerializer.INSTANCE);
        module.addSerializer(Instant.class, JSR310DateTimeSerializer.INSTANCE);
        module.addDeserializer(LocalDate.class, JSR310LocalDateDeserializer.INSTANCE);
        return new Jackson2ObjectMapperBuilder()
                .indentOutput(Boolean.TRUE)
                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .findModulesViaServiceLoader(true)
                .serializationInclusion(JsonInclude.Include.NON_EMPTY)
                .modulesToInstall(jodaModule,module);
    }
}
