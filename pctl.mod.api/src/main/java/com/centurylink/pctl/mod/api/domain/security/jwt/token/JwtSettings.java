package com.centurylink.pctl.mod.api.domain.security.jwt.token;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "jwt")
public class JwtSettings {
    /**
     * {@link com.centurylink.pctl.mod.api.domain.security.jwt.token.JwtToken} will expire after this time.
     */
    private Integer tokenExpirationTime;// = 15;

    /**
     * Token issuer.
     */
    @Value("${jwt.tokenIssuer}")
    private String tokenIssuer;// = "CTL";

    /**
     * Key is used to sign {@link com.centurylink.pctl.mod.api.domain.security.jwt.token.JwtToken}.
     */
    //@Value("spring.jwt.tokenSigningKey")
    private String tokenSigningKey;// = "xm8EV6Hy5RMFK4EEACIDAwQus";

    /**
     * {@link com.centurylink.pctl.mod.api.domain.security.jwt.token.JwtToken} can be refreshed during this timeframe.
     */

    private Integer refreshTokenExpTime;// =60 ;

    public Integer getRefreshTokenExpTime() {
        return refreshTokenExpTime;
    }

    public void setRefreshTokenExpTime(Integer refreshTokenExpTime) {
        this.refreshTokenExpTime = refreshTokenExpTime;
    }

    public Integer getTokenExpirationTime() {
        return tokenExpirationTime;
    }

    public void setTokenExpirationTime(Integer tokenExpirationTime) {
        this.tokenExpirationTime = tokenExpirationTime;
    }

    public String getTokenIssuer() {
        return tokenIssuer;
    }
    public void setTokenIssuer(String tokenIssuer) {
        this.tokenIssuer = tokenIssuer;
    }

    public String getTokenSigningKey() {
        return tokenSigningKey;
    }

    public void setTokenSigningKey(String tokenSigningKey) {
        this.tokenSigningKey = tokenSigningKey;
    }
}
