
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubnetworkConnectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubnetworkConnectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD_DROP_A"/>
 *     &lt;enumeration value="ADD_DROP_Z"/>
 *     &lt;enumeration value="DOUBLE_ADD_DROP"/>
 *     &lt;enumeration value="DOUBLE_INTERCONNECT"/>
 *     &lt;enumeration value="EXPLICIT"/>
 *     &lt;enumeration value="INTERCONNECT"/>
 *     &lt;enumeration value="OPEN_ADD_DROP"/>
 *     &lt;enumeration value="SIMPLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubnetworkConnectionType")
@XmlEnum
public enum SubnetworkConnectionType {

    ADD_DROP_A,
    ADD_DROP_Z,
    DOUBLE_ADD_DROP,
    DOUBLE_INTERCONNECT,
    EXPLICIT,
    INTERCONNECT,
    OPEN_ADD_DROP,
    SIMPLE;

    public String value() {
        return name();
    }

    public static SubnetworkConnectionType fromValue(String v) {
        return valueOf(v);
    }

}
