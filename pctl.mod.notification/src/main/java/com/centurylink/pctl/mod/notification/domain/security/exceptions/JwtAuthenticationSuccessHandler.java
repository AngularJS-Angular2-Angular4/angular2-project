package com.centurylink.pctl.mod.notification.domain.security.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by begin.samuel on 10/7/2016.
 */

@Component
public class JwtAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    private final ObjectMapper mapper;

    @Autowired
    public JwtAuthenticationSuccessHandler(final ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        //User user = (User) authentication.getPrincipal();

        response.setStatus(HttpStatus.OK.value());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        mapper.writeValue(response.getWriter(), authentication.getName());

    }

}
