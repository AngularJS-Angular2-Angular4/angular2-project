package com.centurylink.pctl.mod.api.domain.security.config;

import java.util.Arrays;
import java.util.List;

import com.centurylink.pctl.mod.api.domain.security.endpoint.JwtAuthenticationEntryPoint;
import com.centurylink.pctl.mod.api.domain.security.jwt.extractor.TokenExtractor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.centurylink.pctl.mod.api.domain.security.Filter.AjaxAuthenticationProvider;
import com.centurylink.pctl.mod.api.domain.security.Filter.AjaxLoginProcessingFilter;
import com.centurylink.pctl.mod.api.domain.security.Filter.JwtTokenAuthenticationProcessingFilter;
import com.centurylink.pctl.mod.api.domain.security.Filter.SkipPathRequestMatcher;
import com.centurylink.pctl.mod.api.domain.security.Filter.JwtAuthenticationProvider;
//import com.svlada.security.RestAuthenticationEntryPoint;
//import com.svlada.security.auth.ajax.AjaxAuthenticationProvider;
//import com.svlada.security.auth.jwt.JwtAuthenticationProvider;
//import com.svlada.security.auth.jwt.extractor.TokenExtractor;

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
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

/**
 * Created by begin.samuel on 10/7/2016.
 */
//@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter implements ResourceServerConfigurer {
    public static final String JWT_TOKEN_HEADER_PARAM = "X-Authorization";
    public static final String JWT_TOKEN_USER_ENTRY_POINT = "/auth/**";
    public static final String JWT_TOKEN_USER_GET_TOKEN = "/token/generate/";

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

    @Autowired
    private UserDetailsService userDetailsService;

/*    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
            .allowedOrigins("http://domain2.com")
            .allowedMethods("PUT", "DELETE")
            .allowedHeaders("header1", "header2", "header3")
            .exposedHeaders("header1", "header2")
            .allowCredentials(false).maxAge(3600);
    }
*/

    @Autowired
    public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
            .userDetailsService(this.userDetailsService)
            .passwordEncoder(passwordEncoder());
    }



    @Bean
    protected JwtTokenAuthenticationProcessingFilter authenticationTokenFilterBean() throws Exception {
        List<String> pathsToSkip = Arrays.asList(JWT_TOKEN_USER_GET_TOKEN);
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
            .antMatchers(JWT_TOKEN_USER_GET_TOKEN).permitAll()
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
