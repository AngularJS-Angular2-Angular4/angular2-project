
package com.ctl.as.domain.geo.v2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CivicAddressSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CivicAddressSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRILLIUM"/>
 *     &lt;enumeration value="GOOGLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CivicAddressSource")
@XmlEnum
public enum CivicAddressSource {

    TRILLIUM,
    GOOGLE;

    public String value() {
        return name();
    }

    public static CivicAddressSource fromValue(String v) {
        return valueOf(v);
    }

}
