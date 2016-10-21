
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reroute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Reroute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="NOT_SET"/>
 *     &lt;enumeration value="YES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Reroute")
@XmlEnum
public enum Reroute {

    NO,
    NOT_SET,
    YES;

    public String value() {
        return name();
    }

    public static Reroute fromValue(String v) {
        return valueOf(v);
    }

}
