
package com.qwest.xmlschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequestStatusT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceRequestStatusT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="Suspended-SDT"/>
 *     &lt;enumeration value="Working"/>
 *     &lt;enumeration value="SDT"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceRequestStatusT")
@XmlEnum
public enum ServiceRequestStatusT {

    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),
    @XmlEnumValue("Suspended-SDT")
    SUSPENDED_SDT("Suspended-SDT"),
    @XmlEnumValue("Working")
    WORKING("Working"),
    SDT("SDT"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ServiceRequestStatusT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceRequestStatusT fromValue(String v) {
        for (ServiceRequestStatusT c: ServiceRequestStatusT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
