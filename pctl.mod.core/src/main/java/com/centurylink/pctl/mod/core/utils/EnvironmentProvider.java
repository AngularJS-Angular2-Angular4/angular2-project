package com.centurylink.pctl.mod.core.utils;

import com.centurylink.pctl.mod.core.cons.Profiles;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by Tomasz Kucharzyk
 */
@Component("environmentProvider")
public class EnvironmentProvider implements EnvironmentAware {

    private static Environment environment;

    @Cacheable("EnvironmentProvider.isProduction")
    public Boolean isProduction() {
        return environment.acceptsProfiles(Profiles.PROD.getProfileName());
    }

    @Cacheable("EnvironmentProvider.isDevelopment")
    public Boolean isDevelopment() {
        return environment.acceptsProfiles(Profiles.DEV.getProfileName());
    }

    @Override
    public void setEnvironment(Environment environment) {
        EnvironmentProvider.environment = environment;
    }
}
