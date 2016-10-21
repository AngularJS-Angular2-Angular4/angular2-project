
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectionRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BACKUP"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="PRIMARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtectionRole")
@XmlEnum
public enum ProtectionRole {

    BACKUP,
    NOT_APPLICABLE,
    PRIMARY;

    public String value() {
        return name();
    }

    public static ProtectionRole fromValue(String v) {
        return valueOf(v);
    }

}
