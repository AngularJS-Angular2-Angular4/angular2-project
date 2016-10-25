package com.centurylink.pctl.mod.user.config;



//import com.centurylink.pctl.mod.user.domain.security.utils.JwtTokenUtil;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

/**
 * Implementation of AuditorAware based on Spring Security.
 */
@Component
public class SpringSecurityAuditorAware implements AuditorAware<String> {

    @Override
    public String getCurrentAuditor() {
        String userName ="test";
        //String userName = JwtTokenUtil.getCurrentUserLogin();
        return (userName != null ? userName : "");
    }
}
