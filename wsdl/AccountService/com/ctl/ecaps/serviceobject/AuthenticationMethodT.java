
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethodT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationMethodT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSWORD"/>
 *     &lt;enumeration value="CLEARTRUST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationMethodT")
@XmlEnum
public enum AuthenticationMethodT {

    PASSWORD,
    CLEARTRUST;

    public String value() {
        return name();
    }

    public static AuthenticationMethodT fromValue(String v) {
        return valueOf(v);
    }

}
