
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="TERMINATED_AND_AVAILABLE_FOR_MAPPING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TerminationMode")
@XmlEnum
public enum TerminationMode {

    NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING,
    NOT_APPLICABLE,
    TERMINATED_AND_AVAILABLE_FOR_MAPPING;

    public String value() {
        return name();
    }

    public static TerminationMode fromValue(String v) {
        return valueOf(v);
    }

}
