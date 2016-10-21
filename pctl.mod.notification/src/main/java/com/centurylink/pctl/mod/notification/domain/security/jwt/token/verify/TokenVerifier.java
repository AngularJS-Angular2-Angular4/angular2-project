package com.centurylink.pctl.mod.notification.domain.security.jwt.token.verify;

/**
 * @author vladimir.stankovic
 *         <p/>
 *         Aug 17, 2016
 */
public interface TokenVerifier {
    public boolean verify(String jti);
}
