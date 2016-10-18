package com.centurylink.pctl.mod.api.domain.security.utils;

/**
 * Created by begin.samuel on 10/6/2016.
 */
import com.centurylink.pctl.mod.api.domain.security.config.AuthoritiesConstants;
import com.centurylink.pctl.mod.api.domain.security.model.CustomUserDetails;
import com.centurylink.pctl.mod.api.domain.user.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenUtil implements Serializable {

    private static final long serialVersionUID = -3301605591108950415L;

    private static final Logger log = LoggerFactory.getLogger(JwtTokenUtil.class);

    private final String  CLAIM_KEY_CREATED = "claim_key_created";
    private final String  CLAIM_KEY_AUDIENCE = "claim_key_audience";
    private final String  CLAIM_KEY_USERNAME = "claim_key_username";


  //  @Value("${spring.jwt.secret}")
    private String secret;

  //  @Value("${spring.jwt.expiration}")
    private Long expiration;


    public String getUsernameFromToken(String token) {
        String username;
        try {
            final Claims claims = getClaimsFromToken(token);
            log.info("Claims {}", claims);
            username =(String) claims.get(CLAIM_KEY_USERNAME);
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    public Date getCreatedDateFromToken(String token) {
        Date created;
        try {
            final Claims claims = getClaimsFromToken(token);
            created = new Date((Long) claims.get(CLAIM_KEY_CREATED));
        } catch (Exception e) {
            created = null;
        }
        return created;
    }

    public Date getExpirationDateFromToken(String token) {
        Date expiration;
        try {
            final Claims claims = getClaimsFromToken(token);
            expiration = claims.getExpiration();
        } catch (Exception e) {
            expiration = null;
        }
        return expiration;
    }

    public String getAudienceFromToken(String token) {
        String audience;
        try {
            final Claims claims = getClaimsFromToken(token);
            audience = (String) claims.get(CLAIM_KEY_AUDIENCE);
        } catch (Exception e) {
            audience = null;
        }
        return audience;
    }

    private Claims getClaimsFromToken(String token) {
        Claims claims;
        try {

            Jwt jwt = Jwts.parser().setSigningKey(secret).parse(token);

            /*claims = Jwts.parser()
                .setSigningKey(secret)
                .parse(token);*/

            claims = (Claims) jwt.getBody();

                /*.parseClaimsJws(token)*/
            log.info("claims{} , content  {}", jwt.getBody(),jwt.getHeader() );
        } catch (Exception e) {
            claims = null;
            log.info("error {}",e);
        }
        return claims;
    }


    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    private Boolean isCreatedBeforeLastPasswordReset(Date created, Date lastPasswordReset) {
        return (lastPasswordReset != null && created.before(lastPasswordReset));
    }


    public String extract(String token) {
        if (StringUtils.isBlank(token)) {
            throw new AuthenticationServiceException("Authorization header cannot be blank!");
        }

        return token;
    }


    public Boolean validateToken(String token, UserDetails userDetails) {
        User user = (User) userDetails;
        final String username = getUsernameFromToken(token);
        final Date created = getCreatedDateFromToken(token);
        //final Date expiration = getExpirationDateFromToken(token);
        return (
            username.equals(user.getLogin())
                && !isTokenExpired(token));
    }


    /**
     * Get the login of the current user.
     */
    public static String getCurrentUserLogin() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        String userName = null;
        if (authentication != null) {
            if (authentication.getPrincipal() instanceof UserDetails) {
                UserDetails springSecurityUser = (UserDetails) authentication.getPrincipal();
                userName = springSecurityUser.getUsername();
            } else if (authentication.getPrincipal() instanceof String) {
                userName = (String) authentication.getPrincipal();
            }
        }
        return userName;
    }

    /**
     * Check if a user is authenticated.
     *
     * @return true if the user is authenticated, false otherwise
     */
    public static boolean isAuthenticated() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Collection<? extends GrantedAuthority> authorities = securityContext.getAuthentication().getAuthorities();
        if (authorities != null) {
            for (GrantedAuthority authority : authorities) {
                if (authority.getAuthority().equals(AuthoritiesConstants.ANONYMOUS)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Return the current user id, or throws an exception, if the user is not authenticated yet.
     *
     * @return the current user id
     */
    public static String getCurrentUserId() {
        return getCurrentUser().getId();
    }

    /**
     * Return the current user, or throws an exception, if the user is not
     * authenticated yet.
     *
     * @return the current user
     */
    public static CustomUserDetails getCurrentUser() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        if (authentication != null) {
            if (authentication.getPrincipal() instanceof CustomUserDetails) {
                return (CustomUserDetails) authentication.getPrincipal();
            }
        }
        throw new IllegalStateException("User not found!");
    }

    /**
     * If the current user has a specific authority (security role).
     *
     * <p> The name of this method comes from the isUserInRole() method in the Servlet API</p>
     */
    public static boolean isUserInRole(String authority) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        if (authentication != null) {
            if (authentication.getPrincipal() instanceof UserDetails) {
                UserDetails springSecurityUser = (UserDetails) authentication.getPrincipal();
                return springSecurityUser.getAuthorities().contains(new SimpleGrantedAuthority(authority));
            }
        }
        return false;
    }


    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, username);
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

    String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
            .setClaims(claims)
            .setExpiration(generateExpirationDate())
            .signWith(SignatureAlgorithm.HS512, secret)
            .compact();
    }

}
