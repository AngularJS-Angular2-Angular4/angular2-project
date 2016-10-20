
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRealmT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserRealmT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARTNER"/>
 *     &lt;enumeration value="EMPLOYEE"/>
 *     &lt;enumeration value="LOCAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserRealmT")
@XmlEnum
public enum UserRealmT {

    PARTNER,
    EMPLOYEE,
    LOCAL;

    public String value() {
        return name();
    }

    public static UserRealmT fromValue(String v) {
        return valueOf(v);
    }

}
