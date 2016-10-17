package com.centurylink.pctl.mod.api.domain.security.jwt.extractor;

//import org.apache.commons.lang3.StringUtils;
import com.centurylink.pctl.mod.api.domain.security.jwt.extractor.TokenExtractor;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.stereotype.Component;

/**
 * An implementation of {@link com.centurylink.pctl.mod.api.domain.security.jwt.extractor.TokenExtractor} extracts token from
 * Authorization: Bearer scheme.
 *
 * @author vladimir.stankovic
 *
 * Aug 5, 2016
 */
@Component
public class JwtHeaderTokenExtractor implements TokenExtractor {
    public static String HEADER_PREFIX = "Bearer ";

    @Override
    public String extract(String header) {
     //   if (StringUtils.isBlank(header)) {
    	  if (header.isEmpty()) {
            throw new AuthenticationServiceException("Authorization header cannot be blank!");
        }

        if (header.length() < HEADER_PREFIX.length()) {
            throw new AuthenticationServiceException("Invalid authorization header size.");
        }

        return header.substring(HEADER_PREFIX.length(), header.length());
    }
}
