
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIDIRECTIONAL"/>
 *     &lt;enumeration value="UNIDIRECTIONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionDirection")
@XmlEnum
public enum ConnectionDirection {

    BIDIRECTIONAL,
    UNIDIRECTIONAL;

    public String value() {
        return name();
    }

    public static ConnectionDirection fromValue(String v) {
        return valueOf(v);
    }

}
