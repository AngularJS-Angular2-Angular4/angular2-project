package com.centurylink.pctl.mod.user.domain.security.model;

/**
 * Scopes
 *
 * @author vladimir.stankovic
 *
 * Aug 18, 2016
 */
public enum Scopes {
	 ROLE_ADMIN;

    public String authority() {
        return this.name();
    }
}
