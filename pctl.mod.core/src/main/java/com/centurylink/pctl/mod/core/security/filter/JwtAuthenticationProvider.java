package com.centurylink.pctl.mod.core.security.filter;

import com.centurylink.pctl.mod.core.security.jwt.token.JwtAuthenticationToken;
import com.centurylink.pctl.mod.core.security.jwt.token.JwtSettings;
import com.centurylink.pctl.mod.core.security.jwt.token.RawAccessJwtToken;
import com.centurylink.pctl.mod.core.security.model.UserContext;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * An {@link AuthenticationProvider} implementation that will use provided
 * instance of {@link com.centurylink.pctl.mod.core.security.jwt.token.JwtToken} to perform authentication.
 *
 * @author vladimir.stankovic
 *
 * Aug 5, 2016
 */
@Component
@SuppressWarnings("unchecked")
@Qualifier("jwtAuthenticationProvider")
public class JwtAuthenticationProvider implements AuthenticationProvider {
    private final JwtSettings jwtSettings;
  //  private final UserRepository userService;

    @Autowired
    public JwtAuthenticationProvider(JwtSettings jwtSettings) {
        this.jwtSettings = jwtSettings;
    //    this.userService = userService;
    }


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        //	String username = (String) authentication.getName();
        //	User user = userService.findOneByLogin(username).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));

        RawAccessJwtToken rawAccessToken = (RawAccessJwtToken) authentication.getCredentials();

        Jws<Claims> jwsClaims = rawAccessToken.parseClaims(jwtSettings.getTokenSigningKey());
        String subject = jwsClaims.getBody().getSubject();

        if(!jwtSettings.getPublicKey().trim().equals(subject.trim())){
            throw  new UsernameNotFoundException("User not found:");
        }
        // List<String> scopes = jwsClaims.getBody().get("scopes", List.class);
        // scopes.add("token");
        SimpleGrantedAuthority sg = new SimpleGrantedAuthority("TRUSTED_CLIENT");

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(sg);

    /*    List<GrantedAuthority> authorities = scopes.stream()
                .map(authority -> new SimpleGrantedAuthority(authority))
                .collect(Collectors.toList());*/

        //  User user = userService.findOneByFirstName(subject);//.orElseThrow(() -> new UsernameNotFoundException("User not found: " + subject));

      /* if(user == null){
        	 new UsernameNotFoundException("User not found: " + subject);
        }*/

        //    User user =   userService.findOneByFirstName(subject).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));

        UserContext context = UserContext.create(subject, authorities);

        return new JwtAuthenticationToken(context, context.getAuthorities());

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (JwtAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
