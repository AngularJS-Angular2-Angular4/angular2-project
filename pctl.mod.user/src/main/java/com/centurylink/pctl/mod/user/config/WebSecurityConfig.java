package com.centurylink.pctl.mod.user.config;

import com.centurylink.pctl.mod.core.security.endpoint.JwtAuthenticationEntryPoint;
import com.centurylink.pctl.mod.core.security.filter.*;
import com.centurylink.pctl.mod.core.security.jwt.extractor.TokenExtractor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by begin.samuel on 10/7/2016.
 */
//@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter implements ResourceServerConfigurer {
    public static final String JWT_TOKEN_HEADER_PARAM = "X-Authorization";
    public static final String JWT_TOKEN_USER_ENTRY_POINT = "/**" ;    // "/auth/**";
    public static final String JWT_TOKEN_USER_GET_TOKEN = "/auth/token/generate";
    public static final String LOGIN_USER_ENTRY_POINT = "/auth/user/login";
    public static final String LOGGED_OUT_ENTRY_POINT ="/auth/user/logoutSuccess";
    public static final String GET_USER_ENTRY_POINT ="/auth/user/me";


    @Autowired
    @Qualifier("jwtAuthenticationEntryPoint")
    private JwtAuthenticationEntryPoint authenticationEntryPoint;

    @Autowired
    @Qualifier("ajaxAwareAuthenticationSuccessHandler")
    private AuthenticationSuccessHandler successHandler;

    @Autowired
    @Qualifier("ajaxAwareAuthenticationFailureHandler")
    private AuthenticationFailureHandler failureHandler;

    @Autowired
    @Qualifier("jwtAuthenticationProvider")
    private JwtAuthenticationProvider jwtAuthenticationProvider;

    @Autowired
    @Qualifier("ajaxAuthenticationProvider")
    private AjaxAuthenticationProvider ajaxAuthenticationProvider;

    @Autowired private TokenExtractor tokenExtractor;

    @Autowired private AuthenticationManager authenticationManager;

    @Autowired private ObjectMapper objectMapper;

    @Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;

 /*   @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
            .userDetailsService(this.userDetailsService)
            .passwordEncoder(passwordEncoder());
    }
*/


    @Bean
    protected JwtTokenAuthenticationProcessingFilter authenticationTokenFilterBean() throws Exception {
        List<String> pathsToSkip = Arrays.asList(JWT_TOKEN_USER_GET_TOKEN, LOGIN_USER_ENTRY_POINT,LOGGED_OUT_ENTRY_POINT, GET_USER_ENTRY_POINT);
        SkipPathRequestMatcher matcher = new SkipPathRequestMatcher(pathsToSkip,JWT_TOKEN_USER_ENTRY_POINT );
        JwtTokenAuthenticationProcessingFilter filter
            = new JwtTokenAuthenticationProcessingFilter(failureHandler, tokenExtractor, matcher);
        filter.setAuthenticationManager(this.authenticationManager);
        return filter;
    }


    @Bean
    protected AjaxLoginProcessingFilter buildAjaxLoginProcessingFilter() throws Exception {
        AjaxLoginProcessingFilter filter = new AjaxLoginProcessingFilter(JWT_TOKEN_USER_GET_TOKEN, successHandler, failureHandler, objectMapper);
        filter.setAuthenticationManager(this.authenticationManager);
        return filter;
    }


    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(jwtAuthenticationProvider);
        auth.authenticationProvider(ajaxAuthenticationProvider);
    }

    @Bean
    protected BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("pctl.mod.user");
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
            .antMatchers(JWT_TOKEN_USER_GET_TOKEN).permitAll()
            .antMatchers(LOGIN_USER_ENTRY_POINT).permitAll()
            .antMatchers(LOGGED_OUT_ENTRY_POINT).permitAll()
            .antMatchers(GET_USER_ENTRY_POINT).permitAll()
            .and()
            .authorizeRequests()
            .antMatchers(JWT_TOKEN_USER_ENTRY_POINT ).authenticated()
            .and()
            .addFilterBefore(buildAjaxLoginProcessingFilter(),
                UsernamePasswordAuthenticationFilter.class)
            .addFilterBefore(authenticationTokenFilterBean(),
                UsernamePasswordAuthenticationFilter.class);
    }
}
