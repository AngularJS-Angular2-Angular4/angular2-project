
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubAccountTypeCodeT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubAccountTypeCodeT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IG"/>
 *     &lt;enumeration value="MSB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubAccountTypeCodeT")
@XmlEnum
public enum SubAccountTypeCodeT {

    IG,
    MSB;

    public String value() {
        return name();
    }

    public static SubAccountTypeCodeT fromValue(String v) {
        return valueOf(v);
    }

}
