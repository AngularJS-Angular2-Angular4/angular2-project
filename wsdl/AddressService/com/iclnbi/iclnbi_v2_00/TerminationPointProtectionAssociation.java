
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminationPointProtectionAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminationPointProtectionAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="PSR_RELATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TerminationPointProtectionAssociation")
@XmlEnum
public enum TerminationPointProtectionAssociation {

    NOT_APPLICABLE,
    PSR_RELATED;

    public String value() {
        return name();
    }

    public static TerminationPointProtectionAssociation fromValue(String v) {
        return valueOf(v);
    }

}
