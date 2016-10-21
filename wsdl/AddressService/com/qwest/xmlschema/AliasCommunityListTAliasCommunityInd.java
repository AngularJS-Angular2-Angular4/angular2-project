
package com.qwest.xmlschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasCommunityListTAliasCommunityInd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AliasCommunityListTAliasCommunityInd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AliasCommunityListTAliasCommunityInd")
@XmlEnum
public enum AliasCommunityListTAliasCommunityInd {

    P,
    A,
    B;

    public String value() {
        return name();
    }

    public static AliasCommunityListTAliasCommunityInd fromValue(String v) {
        return valueOf(v);
    }

}
