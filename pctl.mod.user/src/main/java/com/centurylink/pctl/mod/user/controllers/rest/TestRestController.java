package com.centurylink.pctl.mod.user.controllers.rest;



import com.centurylink.pctl.mod.core.dto.commons.ValueObject;
import com.centurylink.pctl.mod.core.security.jwt.extractor.TokenExtractor;
import com.centurylink.pctl.mod.core.security.jwt.token.JwtSettings;
import com.centurylink.pctl.mod.user.domain.user.UserRepository;
import com.centurylink.pctl.mod.user.domain.utils.Response;
import com.centurylink.pctl.mod.user.domain.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomasz Kucharzyk
 */

@RestController
@RequestMapping("/product")
public class TestRestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenExtractor tokenExtractor;

    @Autowired
    private JwtSettings jwtSettings;

    SecurityContext context = SecurityContextHolder.createEmptyContext();
    // SecurityContextHolder sh = new SecurityContextHolder();

    @RequestMapping("/title")
    public ValueObject getTitle(Principal user) {
        return new ValueObject("API SERVER IS ALIVE" + (user == null ? "" : " " + user.getName()));
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }


    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public Response getloggedUser(HttpServletRequest request,
                                  HttpServletResponse response) {
        Response msg = new Response();
        if(userRepository.findOneByFirstName(request.getHeader("username")) != null) {
            SecurityContext context = SecurityContextHolder.createEmptyContext();
            HttpSession session = request.getSession();
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            SimpleGrantedAuthority sg = new SimpleGrantedAuthority("ROLE_ADMIN");
            SimpleGrantedAuthority sg1 = new SimpleGrantedAuthority("USERS");
            authorities.add(sg);
            authorities.add(sg1);
            Authentication authentication = new UsernamePasswordAuthenticationToken(request.getHeader("username"),
                null, authorities);
            context.setAuthentication(authentication);
            session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, context);
            SecurityContextHolder.setContext(context);
            msg.setStatus(StatusCode.E200);
            msg.setContent("User Logged Successfully ");
            return msg;
        }
        else{
            msg.setStatus(StatusCode.E401);
            msg.setContent("User not found in database");
            return msg;
        }

    }
}
