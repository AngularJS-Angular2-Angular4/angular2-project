
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaticProtectionLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StaticProtectionLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULLY_PROTECTED"/>
 *     &lt;enumeration value="HIGHLY_PROTECTED"/>
 *     &lt;enumeration value="PARTIALLY_PROTECTED"/>
 *     &lt;enumeration value="PREEMTIBLE"/>
 *     &lt;enumeration value="UNPROTECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StaticProtectionLevel")
@XmlEnum
public enum StaticProtectionLevel {

    FULLY_PROTECTED,
    HIGHLY_PROTECTED,
    PARTIALLY_PROTECTED,
    PREEMTIBLE,
    UNPROTECTED;

    public String value() {
        return name();
    }

    public static StaticProtectionLevel fromValue(String v) {
        return valueOf(v);
    }

}
