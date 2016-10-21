
package com.ctl.as.domain.geo.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultColor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultColor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Yellow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultColor")
@XmlEnum
public enum ResultColor {

    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("Yellow")
    YELLOW("Yellow");
    private final String value;

    ResultColor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultColor fromValue(String v) {
        for (ResultColor c: ResultColor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
