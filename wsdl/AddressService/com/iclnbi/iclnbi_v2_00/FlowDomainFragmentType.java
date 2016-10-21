
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDomainFragmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowDomainFragmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MULTIPOINT"/>
 *     &lt;enumeration value="POINT_TO_MULTIPOINT"/>
 *     &lt;enumeration value="POINT_TO_POINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlowDomainFragmentType")
@XmlEnum
public enum FlowDomainFragmentType {

    MULTIPOINT,
    POINT_TO_MULTIPOINT,
    POINT_TO_POINT;

    public String value() {
        return name();
    }

    public static FlowDomainFragmentType fromValue(String v) {
        return valueOf(v);
    }

}
