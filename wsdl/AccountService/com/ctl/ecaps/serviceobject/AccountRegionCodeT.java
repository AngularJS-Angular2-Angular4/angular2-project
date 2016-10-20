
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountRegionCodeT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountRegionCodeT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="OOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountRegionCodeT")
@XmlEnum
public enum AccountRegionCodeT {

    IR,
    OOR;

    public String value() {
        return name();
    }

    public static AccountRegionCodeT fromValue(String v) {
        return valueOf(v);
    }

}
