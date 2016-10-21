package com.centurylink.pctl.mod.notification.domain.security.Filter;

import com.centurylink.pctl.mod.notification.domain.security.model.UserContext;
import com.centurylink.pctl.mod.notification.domain.user.Authority;
import com.centurylink.pctl.mod.notification.domain.user.User;
import com.centurylink.pctl.mod.notification.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

;

/**
 * @author vladimir.stankovic
 *         <p/>
 *         Aug 3, 2016
 */
@Component
@Qualifier("ajaxAuthenticationProvider")
public class AjaxAuthenticationProvider implements AuthenticationProvider {
    private final BCryptPasswordEncoder encoder;
    private final UserRepository userService;

    @Autowired
    public AjaxAuthenticationProvider(final UserRepository userService, final BCryptPasswordEncoder encoder) {
        this.userService = userService;
        this.encoder = encoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Assert.notNull(authentication, "No authentication data provided");

        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();

        Authority role1 = new Authority("ROLE_ADMIN");
        Authority role2 = new Authority("ROLE_USER");
        Set<Authority> roles = new HashSet<Authority>();
        roles.add(role1);
        roles.add(role2);


        User user = new User();
        user.setLogin(username);
        user.setFirstName(username);
        user.setLastName("User");
        user.setAuthorities(roles);
        user.setEmail(username);
        user.setActivated("1");
        user.setPassword("qwertyqwertyuiopasdfghjklzxcvbnml");

        try {

            if (!userService.findOneByLogin(username).isPresent()) {
                user = userService.save(user);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //    User user = userService.findOneByLogin(username).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));


       /* if (!encoder.matches(password, user.getPassword())) {
            throw new BadCredentialsException("Authentication Failed. Username or Password not valid.");
        }*/

        //  if (user.getAuthorities() == null) throw new InsufficientAuthenticationException("User has no roles assigned");

/*        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getRole().authority()))
                .collect(Collectors.toList());
        */

        List<GrantedAuthority> authorities = user.getAuthorities().stream()
            .map(authority -> new SimpleGrantedAuthority("ROLE_USER"))
            .collect(Collectors.toList());

        UserContext userContext = UserContext.create(user.getFirstName(), authorities);

        //UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), null);
        // return new UsernamePasswordAuthenticationToken(user.getFirstName(), null);
        return new UsernamePasswordAuthenticationToken(userContext, null, userContext.getAuthorities());
        // return new UsernamePasswordAuthenticationToken(userContext, null, userContext.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
