package com.centurylink.pctl.mod.auth.domain.security.exceptions;

import com.centurylink.pctl.mod.auth.domain.security.jwt.token.JwtToken;
import org.springframework.security.core.AuthenticationException;

/**
 *
 * @author vladimir.stankovic
 *
 * Aug 3, 2016
 */
public class JwtExpiredTokenException extends AuthenticationException {
    private static final long serialVersionUID = -5959543783324224864L;

    private JwtToken token;

    public JwtExpiredTokenException(String msg) {
        super(msg);
    }

    public JwtExpiredTokenException(JwtToken token, String msg, Throwable t) {
        super(msg, t);
        this.token = token;
    }

    public String token() {
        return this.token.getToken();
    }
}
