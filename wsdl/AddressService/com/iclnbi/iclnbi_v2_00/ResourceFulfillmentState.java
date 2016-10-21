
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceFulfillmentState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceFulfillmentState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_SERVICE"/>
 *     &lt;enumeration value="OUT_OF_SERVICE"/>
 *     &lt;enumeration value="OUT_OF_SERVICE_BY_MAINTENANCE"/>
 *     &lt;enumeration value="SERVICE_STATE_NOT_APPLICABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceFulfillmentState")
@XmlEnum
public enum ResourceFulfillmentState {

    IN_SERVICE,
    OUT_OF_SERVICE,
    OUT_OF_SERVICE_BY_MAINTENANCE,
    SERVICE_STATE_NOT_APPLICABLE;

    public String value() {
        return name();
    }

    public static ResourceFulfillmentState fromValue(String v) {
        return valueOf(v);
    }

}
