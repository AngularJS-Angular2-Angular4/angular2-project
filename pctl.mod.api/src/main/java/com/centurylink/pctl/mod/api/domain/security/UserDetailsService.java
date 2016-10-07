package com.centurylink.pctl.mod.api.domain.security;

import com.centurylink.pctl.mod.api.domain.security.model.Authority;
import com.centurylink.pctl.mod.api.domain.security.model.CustomUserDetails;
import com.centurylink.pctl.mod.api.domain.user.User;
import com.centurylink.pctl.mod.api.domain.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Authenticate a user from the database.
 */
@Component("userDetailsService")
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(UserDetailsService.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String login) {
        log.debug("Authenticating {}", login);
        String lowercaseLogin = login.toLowerCase();
        Optional<User> userFromDatabase = userRepository.findOneByLogin(lowercaseLogin);
        log.info("Users {}",userFromDatabase);

        return userFromDatabase.map(user -> {

            Set<GrantedAuthority> grantedAuthorities =  new HashSet<GrantedAuthority>();
            for(Authority authority :  user.getAuthorities()){
                 grantedAuthorities.add(new SimpleGrantedAuthority(authority.getName()));
            }
            return new CustomUserDetails(user.getId(), lowercaseLogin,
                user.getPassword(),
                grantedAuthorities, true, true, true, true);
        }).orElseThrow(() -> new UsernameNotFoundException("User " + lowercaseLogin + " was not found in the " +
        "database"));
    }
}
