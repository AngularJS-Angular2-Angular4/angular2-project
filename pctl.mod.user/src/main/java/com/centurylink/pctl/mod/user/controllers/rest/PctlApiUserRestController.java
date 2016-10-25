package com.centurylink.pctl.mod.user.controllers.rest;

import com.centurylink.pctl.mod.core.security.jwt.extractor.TokenExtractor;
import com.centurylink.pctl.mod.core.security.jwt.token.JwtSettings;
import com.centurylink.pctl.mod.core.utils.Response;
import com.centurylink.pctl.mod.core.utils.StatusCode;
import com.centurylink.pctl.mod.user.domain.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/*import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;*/

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/auth")
public class PctlApiUserRestController {

    private static final Logger log = LoggerFactory
        .getLogger(com.centurylink.pctl.mod.user.controllers.rest.PctlApiUserRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenExtractor tokenExtractor;

    @Autowired
    private JwtSettings jwtSettings;

    SecurityContext context = SecurityContextHolder.createEmptyContext();
    // SecurityContextHolder sh = new SecurityContextHolder();

    @RequestMapping(value = "/user/me", method = RequestMethod.GET)
    public Response getUserInfo(HttpServletRequest request,
                                HttpServletResponse response) {
        Response msg = new Response();
        HttpSession session =request.getSession();
        context = (SecurityContext) session.getAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY);
        if(context== null) {

            msg.setStatus(StatusCode.C401);
        }
        else{
            String name;
            msg.setStatus(StatusCode.E200);
            Authentication auth = context.getAuthentication();
            name = auth.getPrincipal().toString();
            msg.setContent(userRepository.findOneByFirstName(name));
            return msg;
        }
        return msg;
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

    @RequestMapping(value = "/user/logout", method = RequestMethod.GET)
    public Response logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Response msg = new Response();
        String name = "no user found";
        HttpSession session = request.getSession();
        context = (SecurityContext) session.getAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY);
        if(context!= null) {

            Authentication auth = context.getAuthentication();
            name = auth.getPrincipal().toString();
            if (auth != null) {
                new SecurityContextLogoutHandler().logout(request, response, auth);
                msg.setStatus(StatusCode.C401);
                return msg;
            }
        }
        msg.setStatus(StatusCode.E200);
        msg.setContent("User Logged Out Successfully ");
        return msg;
    }

}
