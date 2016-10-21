
package com.qwest.xmlschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneConnectionTClassOfService.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneConnectionTClassOfService">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelephoneConnectionTClassOfService")
@XmlEnum
public enum TelephoneConnectionTClassOfService {

    R,
    B,
    C;

    public String value() {
        return name();
    }

    public static TelephoneConnectionTClassOfService fromValue(String v) {
        return valueOf(v);
    }

}
