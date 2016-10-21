
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectionSchemeState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionSchemeState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTOMATIC"/>
 *     &lt;enumeration value="FORCED_OR_LOCKED_OUT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtectionSchemeState")
@XmlEnum
public enum ProtectionSchemeState {

    AUTOMATIC,
    FORCED_OR_LOCKED_OUT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ProtectionSchemeState fromValue(String v) {
        return valueOf(v);
    }

}
