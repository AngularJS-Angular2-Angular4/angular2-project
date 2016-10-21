
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDomainType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowDomainType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NETWORK"/>
 *     &lt;enumeration value="SINGLETON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlowDomainType")
@XmlEnum
public enum FlowDomainType {

    NETWORK,
    SINGLETON;

    public String value() {
        return name();
    }

    public static FlowDomainType fromValue(String v) {
        return valueOf(v);
    }

}
