
package com.ctl.as.domain.geo.v2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoPointSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoPointSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLC"/>
 *     &lt;enumeration value="GOOGLE"/>
 *     &lt;enumeration value="GPS"/>
 *     &lt;enumeration value="MARTENS"/>
 *     &lt;enumeration value="TRILLIUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeoPointSource")
@XmlEnum
public enum GeoPointSource {

    CLC,
    GOOGLE,
    GPS,
    MARTENS,
    TRILLIUM;

    public String value() {
        return name();
    }

    public static GeoPointSource fromValue(String v) {
        return valueOf(v);
    }

}
