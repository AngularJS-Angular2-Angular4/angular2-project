package com.centurylink.pctl.mod.core.security.jwt.token;

import com.centurylink.pctl.mod.core.security.model.Scopes;
import com.centurylink.pctl.mod.core.security.model.UserContext;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Collectors;

//import org.apache.commons.lang3.StringUtils;

/**
 * Factory class that should be always used to create {@link com.centurylink.pctl.mod.core.security.jwt.token.JwtToken}.
 *
 * @author vladimir.stankovic
 *
 * May 31, 2016
 */
@Component
public class JwtTokenFactory {
    private final JwtSettings settings;

    @Autowired
    public JwtTokenFactory(JwtSettings settings) {
        this.settings = settings;
    }

    /**
     * Factory method for issuing new JWT Tokens.
     *
     * @param username
     * @param roles
     * @return
     */
    public AccessJwtToken createAccessJwtToken( ) {
        //if (StringUtils.isBlank(userContext.getUsername()))
    /*	  if ((userContext.getUsername().isEmpty())){
            throw new IllegalArgumentException("Cannot create JWT Token without username");
    	  }
        if (userContext.getAuthorities() == null || userContext.getAuthorities().isEmpty())
            throw new IllegalArgumentException("User doesn't have any privileges");*/

        Claims claims = Jwts.claims().setSubject(settings.getPublicKey());
        // claims.put("scopes", userContext.getAuthorities().stream().map(s -> s.toString()).collect(Collectors.toList()));

        DateTime currentTime = new DateTime();

        String token = Jwts.builder()
            .setClaims(claims)
            .setIssuer(settings.getTokenIssuer())
            .setIssuedAt(currentTime.toDate())
            .setExpiration(currentTime.plusMinutes(settings.getRefreshTokenExpTime()).toDate())
            .signWith(SignatureAlgorithm.HS512, settings.getTokenSigningKey())
            .compact();

        return new AccessJwtToken(token, claims);
    }

    public JwtToken createRefreshToken() {
        //   if (StringUtils.isBlank(userContext.getUsername())) {
    	/*   if (userContext.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Cannot create JWT Token without username");
        }*/

        DateTime currentTime = new DateTime();

        Claims claims = Jwts.claims().setSubject(settings.getPublicKey());
        //  claims.put("scopes", Arrays.asList(Scopes.ROLE_ADMIN.authority()));
        claims.put("scopes", Arrays.asList(Scopes.ROLE_ADMIN.authority()));

        String token = Jwts.builder()
            .setClaims(claims)
            .setIssuer(settings.getTokenIssuer())
            .setId(UUID.randomUUID().toString())
            .setIssuedAt(currentTime.toDate())
            .setExpiration(currentTime.plusMinutes(settings.getRefreshTokenExpTime()).toDate())
            .signWith(SignatureAlgorithm.HS512, settings.getTokenSigningKey())
            .compact();

        return new AccessJwtToken(token, claims);
    }
}
