package com.centurylink.pctl.mod.auth.rest;

import com.centurylink.pctl.mod.auth.domain.security.config.WebSecurityConfig;
import com.centurylink.pctl.mod.auth.domain.security.jwt.extractor.TokenExtractor;
import com.centurylink.pctl.mod.auth.domain.security.jwt.token.JwtSettings;
import com.centurylink.pctl.mod.auth.domain.security.jwt.token.RawAccessJwtToken;
import com.centurylink.pctl.mod.auth.domain.user.User;
import com.centurylink.pctl.mod.auth.domain.user.UserRepository;
import com.google.common.collect.Lists;
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
import java.util.List;

//import com.centurylink.pctl.mod.auth.domain.security.utils.JwtTokenUtil;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/auth")
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



    // @PreAuthorize("hasRole('USER')")
    @RequestMapping(value = "/user/me", method = RequestMethod.GET)
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
