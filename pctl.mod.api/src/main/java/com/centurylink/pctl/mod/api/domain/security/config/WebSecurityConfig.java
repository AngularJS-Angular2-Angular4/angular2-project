package com.centurylink.pctl.mod.api.domain.security.config;

import com.centurylink.pctl.mod.api.domain.security.Filter.JwtAuthenticationTokenFilter;
import com.centurylink.pctl.mod.api.domain.security.endpoint.JwtAuthenticationEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Created by begin.samuel on 10/7/2016.
 */
//@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter implements ResourceServerConfigurer {
    public static final String JWT_TOKEN_ENTRY_POINT = "/auth/token/**";
    public static final String JWT_TOKEN_ALLOW_ENTRY_POINT = "/product/**";
    public static final String JWT_TOKEN_USER_ENTRY_POINT = "/auth/user/**";

    @Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
            .userDetailsService(this.userDetailsService)
            .passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtAuthenticationTokenFilter authenticationTokenFilterBean() throws Exception {
        return new JwtAuthenticationTokenFilter();
    }


    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("pctl.mod.api");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        //.authorizeRequests()

        http
            .csrf().disable() // We don't need CSRF for JWT based authentication
            .exceptionHandling()
            .authenticationEntryPoint(unauthorizedHandler)
            .and()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .anonymous()
            .and()
            .authorizeRequests()
            .antMatchers(JWT_TOKEN_ALLOW_ENTRY_POINT).permitAll()
            .antMatchers(JWT_TOKEN_ENTRY_POINT).permitAll()
            .and()
            .authorizeRequests()
            .antMatchers(JWT_TOKEN_USER_ENTRY_POINT).authenticated()
            .and()
            .addFilterBefore(
                authenticationTokenFilterBean(),
                UsernamePasswordAuthenticationFilter.class);
    }
}
