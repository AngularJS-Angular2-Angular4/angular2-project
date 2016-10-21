
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransmissionDescriptorState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransmissionDescriptorState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLIED"/>
 *     &lt;enumeration value="MISMATCH"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="TMD_MISSING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransmissionDescriptorState")
@XmlEnum
public enum TransmissionDescriptorState {

    APPLIED,
    MISMATCH,
    NOT_APPLICABLE,
    PENDING,
    TMD_MISSING;

    public String value() {
        return name();
    }

    public static TransmissionDescriptorState fromValue(String v) {
        return valueOf(v);
    }

}
