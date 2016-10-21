
package com.qwest.xmlschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingServiceRequestTActivity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingServiceRequestTActivity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inward"/>
 *     &lt;enumeration value="Outward"/>
 *     &lt;enumeration value="Change"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PendingServiceRequestTActivity")
@XmlEnum
public enum PendingServiceRequestTActivity {

    @XmlEnumValue("Inward")
    INWARD("Inward"),
    @XmlEnumValue("Outward")
    OUTWARD("Outward"),
    @XmlEnumValue("Change")
    CHANGE("Change");
    private final String value;

    PendingServiceRequestTActivity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PendingServiceRequestTActivity fromValue(String v) {
        for (PendingServiceRequestTActivity c: PendingServiceRequestTActivity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
