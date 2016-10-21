package com.centurylink.pctl.mod.notification.domain.security.model;

/**
 * Scopes
 *
 * @author vladimir.stankovic
 *         <p/>
 *         Aug 18, 2016
 */
public enum Scopes {
    ROLE_ADMIN;

    public String authority() {
        return this.name();
    }
}
