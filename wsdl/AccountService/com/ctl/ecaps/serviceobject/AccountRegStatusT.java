
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountRegStatusT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountRegStatusT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="REMOVED"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountRegStatusT")
@XmlEnum
public enum AccountRegStatusT {

    ASSIGNED,
    REMOVED,
    ERROR;

    public String value() {
        return name();
    }

    public static AccountRegStatusT fromValue(String v) {
        return valueOf(v);
    }

}
