package com.centurylink.pctl.mod.user.controllers.rest;

import com.centurylink.pctl.mod.user.domain.security.config.WebSecurityConfig;
import com.centurylink.pctl.mod.user.domain.security.jwt.extractor.TokenExtractor;
import com.centurylink.pctl.mod.user.domain.security.jwt.token.JwtSettings;
import com.centurylink.pctl.mod.user.domain.security.jwt.token.RawAccessJwtToken;
import com.centurylink.pctl.mod.user.domain.user.User;
import com.centurylink.pctl.mod.user.domain.user.UserRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/user")
public class PctlApiUserRestController {

    private static final Logger log = LoggerFactory
        .getLogger(com.centurylink.pctl.mod.user.controllers.rest.PctlApiUserRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenExtractor tokenExtractor;

    @Autowired
    private JwtSettings jwtSettings;

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


    }

}
