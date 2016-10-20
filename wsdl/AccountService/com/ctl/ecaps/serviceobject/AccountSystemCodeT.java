
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSystemCodeT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountSystemCodeT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CABS"/>
 *     &lt;enumeration value="CRIS"/>
 *     &lt;enumeration value="IABS"/>
 *     &lt;enumeration value="ENS"/>
 *     &lt;enumeration value="LATIS"/>
 *     &lt;enumeration value="NIBS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountSystemCodeT")
@XmlEnum
public enum AccountSystemCodeT {

    CABS,
    CRIS,
    IABS,
    ENS,
    LATIS,
    NIBS;

    public String value() {
        return name();
    }

    public static AccountSystemCodeT fromValue(String v) {
        return valueOf(v);
    }

}
