package com.centurylink.pctl.mod.core.security.config;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";

    public static final String JWT_TOKEN_HEADER_PARAM = "X-Authorization";


    private AuthoritiesConstants() {
    }
}
