
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailabilityStatusCodeT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailabilityStatusCodeT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="ALREADY_ASSIGNED"/>
 *     &lt;enumeration value="ALREADY_ASSIGNED_TO_ENTERPRISE"/>
 *     &lt;enumeration value="UNKNOWN_ACCOUNT"/>
 *     &lt;enumeration value="INVALID_ACCOUNT_FOR_ASSIGNMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityStatusCodeT")
@XmlEnum
public enum AvailabilityStatusCodeT {

    AVAILABLE,
    ALREADY_ASSIGNED,
    ALREADY_ASSIGNED_TO_ENTERPRISE,
    UNKNOWN_ACCOUNT,
    INVALID_ACCOUNT_FOR_ASSIGNMENT;

    public String value() {
        return name();
    }

    public static AvailabilityStatusCodeT fromValue(String v) {
        return valueOf(v);
    }

}
