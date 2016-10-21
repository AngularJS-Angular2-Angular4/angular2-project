
package com.ctl.as.domain.geo.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceStatus")
@XmlEnum
public enum ServiceStatus {

    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    ServiceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceStatus fromValue(String v) {
        for (ServiceStatus c: ServiceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
