
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTypeCodeT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypeCodeT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="IG"/>
 *     &lt;enumeration value="MSB"/>
 *     &lt;enumeration value="SUB-ACCT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountTypeCodeT")
@XmlEnum
public enum AccountTypeCodeT {

    BTN("BTN"),
    IG("IG"),
    MSB("MSB"),
    @XmlEnumValue("SUB-ACCT")
    SUB_ACCT("SUB-ACCT");
    private final String value;

    AccountTypeCodeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountTypeCodeT fromValue(String v) {
        for (AccountTypeCodeT c: AccountTypeCodeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
