package com.centurylink.pctl.mod.core.security.jwt.token;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties(prefix = "jwt")
public class JwtSettings {
    /**
     * {@link com.centurylink.pctl.mod.core.security.jwt.token.JwtToken} will expire after this time.
     */
    private Integer tokenExpirationTime;// = 15;

    /**
     * Token issuer.
     */
    // @Value("${jwt.tokenIssuer}")
    private String tokenIssuer;// = "CTL";

    /**
     * Key is used to sign {@link com.centurylink.pctl.mod.core.security.jwt.token.JwtToken}.
     */
    //@Value("spring.jwt.tokenSigningKey")
    private String tokenSigningKey;// = "xm8EV6Hy5RMFK4EEACIDAwQus";



    private String publicKey;

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

    public String getPublicKey() {
        return publicKey;
    }
    public void setTokenSigningKey(String tokenSigningKey) {
        this.tokenSigningKey = tokenSigningKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

}
