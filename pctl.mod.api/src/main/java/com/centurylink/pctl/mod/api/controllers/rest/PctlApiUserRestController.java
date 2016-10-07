package com.centurylink.pctl.mod.api.controllers.rest;


import com.centurylink.pctl.mod.api.domain.user.User;
import com.centurylink.pctl.mod.api.domain.user.UserRepository;
import com.centurylink.pctl.mod.api.domain.security.utils.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/auth")
public class PctlApiUserRestController {

    private static final Logger log = LoggerFactory.getLogger(PctlApiUserRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    //@Autowired
    //private javax.servlet.http.HttpServletRequest httpServletRequest;



    /* Mocking  Token Generation */

    @RequestMapping(value = "/token/generate", method = RequestMethod.GET)
    public List<User> getToken(HttpServletResponse servletResponse) {
        String token = jwtTokenUtil.generateToken("jbeginsamuel@gmail.com");
        log.info("Token {}",token);
        servletResponse.setHeader("JwtToken",token);
        return userRepository.findAll();
    }


   // @PreAuthorize("hasRole('USER')")
    @RequestMapping(value = "/user/me", method = RequestMethod.GET)
    public UserDetails getUserInfo() {
        return jwtTokenUtil.getCurrentUser();
    }


}
