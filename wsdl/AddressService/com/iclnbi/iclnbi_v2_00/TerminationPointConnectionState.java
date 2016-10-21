
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminationPointConnectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminationPointConnectionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIDIRECTIONAL_CONNECTED"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="NOT_CONNECTED"/>
 *     &lt;enumeration value="SINK_CONNECTED"/>
 *     &lt;enumeration value="SOURCE_CONNECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TerminationPointConnectionState")
@XmlEnum
public enum TerminationPointConnectionState {

    BIDIRECTIONAL_CONNECTED,
    NOT_APPLICABLE,
    NOT_CONNECTED,
    SINK_CONNECTED,
    SOURCE_CONNECTED;

    public String value() {
        return name();
    }

    public static TerminationPointConnectionState fromValue(String v) {
        return valueOf(v);
    }

}
