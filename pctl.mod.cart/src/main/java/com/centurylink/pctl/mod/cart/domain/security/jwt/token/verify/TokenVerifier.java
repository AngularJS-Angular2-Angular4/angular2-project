package com.centurylink.pctl.mod.cart.domain.security.jwt.token.verify;

/**
 *
 * @author vladimir.stankovic
 *
 * Aug 17, 2016
 */
public interface TokenVerifier {
    public boolean verify(String jti);
}
