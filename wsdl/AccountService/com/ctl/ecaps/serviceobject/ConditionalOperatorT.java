
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionalOperatorT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionalOperatorT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="IS_NULL"/>
 *     &lt;enumeration value="NOT_NULL"/>
 *     &lt;enumeration value="IN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionalOperatorT")
@XmlEnum
public enum ConditionalOperatorT {

    EQ,
    GE,
    GT,
    LE,
    LT,
    NE,
    IS_NULL,
    NOT_NULL,
    IN;

    public String value() {
        return name();
    }

    public static ConditionalOperatorT fromValue(String v) {
        return valueOf(v);
    }

}
