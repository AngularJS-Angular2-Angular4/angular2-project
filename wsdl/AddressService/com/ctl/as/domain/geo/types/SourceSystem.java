
package com.ctl.as.domain.geo.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceSystem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLC"/>
 *     &lt;enumeration value="LFACS"/>
 *     &lt;enumeration value="MARTENS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceSystem")
@XmlEnum
public enum SourceSystem {

    CLC,
    LFACS,
    MARTENS;

    public String value() {
        return name();
    }

    public static SourceSystem fromValue(String v) {
        return valueOf(v);
    }

}
