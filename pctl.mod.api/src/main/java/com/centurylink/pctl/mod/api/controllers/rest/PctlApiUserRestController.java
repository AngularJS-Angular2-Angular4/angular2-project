package com.centurylink.pctl.mod.api.controllers.rest;

import com.centurylink.pctl.mod.api.domain.user.User;
import com.centurylink.pctl.mod.api.domain.user.UserRepository;
import com.centurylink.pctl.mod.api.domain.product.PctlApiProductService;
import com.centurylink.pctl.mod.api.domain.product.Product;
import com.centurylink.pctl.mod.api.domain.security.config.WebSecurityConfig;
import com.centurylink.pctl.mod.api.domain.security.jwt.extractor.TokenExtractor;
import com.centurylink.pctl.mod.api.domain.security.jwt.token.JwtAuthenticationToken;
import com.centurylink.pctl.mod.api.domain.security.jwt.token.JwtSettings;
import com.centurylink.pctl.mod.api.domain.security.jwt.token.RawAccessJwtToken;
//import com.centurylink.pctl.mod.api.domain.security.utils.JwtTokenUtil;
import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.Optional;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/user")
public class PctlApiUserRestController {

    private static final Logger log = LoggerFactory
        .getLogger(PctlApiUserRestController.class);

    @Autowired
    private UserRepository userRepository;

/*    @Autowired
    private JwtTokenUtil jwtTokenUtil;*/

    @Autowired
    private TokenExtractor tokenExtractor;

    @Autowired
    private JwtSettings jwtSettings;
    // @Autowired
    // private javax.servlet.http.HttpServletRequest httpServletRequest;

    @Autowired
    private PctlApiProductService pctlApiProductService;

	/* Mocking Token Generation */

/*	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
            .allowedOrigins("http://domain2.com")
            .allowedMethods("PUT", "DELETE")
            .allowedHeaders("header1", "header2", "header3")
            .exposedHeaders("header1", "header2")
            .allowCredentials(false).maxAge(3600);
    }*/


   /* @RequestMapping(value = "/token/generate", method = RequestMethod.GET)
    public List<User> getToken(HttpServletResponse servletResponse) {
        String token = jwtTokenUtil.generateToken("jbeginsamuel@gmail.com");
        log.info("Token {}", token);
        servletResponse.setHeader("JwtToken", token);
        return userRepository.findAll();
    }*/

    // @PreAuthorize("hasRole('USER')")
    @RequestMapping(value = "/me", method = RequestMethod.GET)
    public User getUserInfo(HttpServletRequest request,
                            HttpServletResponse response) {

        String tokenPayload = request
            .getHeader(WebSecurityConfig.JWT_TOKEN_HEADER_PARAM);
        RawAccessJwtToken token = new RawAccessJwtToken(
            tokenExtractor.extract(tokenPayload));
        Jws<Claims> jwsClaims = token.parseClaims(jwtSettings
            .getTokenSigningKey());
        String subject = jwsClaims.getBody().getSubject();
        return userRepository.findOneByFirstName(subject);

        // return subject;
        // return jwtTokenUtil.getCurrentUser();
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    // @PreAuthorize("hasRole('ADMIN')")
    public List<Product> getProducts() {
        log.info("Getting Products");
        log.info(" Products count {} ", pctlApiProductService
            .findProductByProductId("sdwan1000").size());
        return Lists.newArrayList(pctlApiProductService.findAll());
    }

}
