
package com.qwest.xmlschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Item"/>
 *     &lt;enumeration value="CHY"/>
 *     &lt;enumeration value="DNV"/>
 *     &lt;enumeration value="IDO"/>
 *     &lt;enumeration value="MTA"/>
 *     &lt;enumeration value="NCO"/>
 *     &lt;enumeration value="NMX"/>
 *     &lt;enumeration value="PNX"/>
 *     &lt;enumeration value="SCO"/>
 *     &lt;enumeration value="TSN"/>
 *     &lt;enumeration value="UTA"/>
 *     &lt;enumeration value="MAL"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="BLVU"/>
 *     &lt;enumeration value="EAST"/>
 *     &lt;enumeration value="EUGN"/>
 *     &lt;enumeration value="OLYM"/>
 *     &lt;enumeration value="OREA"/>
 *     &lt;enumeration value="PORT"/>
 *     &lt;enumeration value="SEAT"/>
 *     &lt;enumeration value="SPOK"/>
 *     &lt;enumeration value="VANC"/>
 *     &lt;enumeration value="CPR"/>
 *     &lt;enumeration value="XNDU"/>
 *     &lt;enumeration value="UT"/>
 *     &lt;enumeration value="WY"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="WO"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="WI"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="WYO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaT")
@XmlEnum
public enum AreaT {

    @XmlEnumValue("Item")
    ITEM("Item"),
    CHY("CHY"),
    DNV("DNV"),
    IDO("IDO"),
    MTA("MTA"),
    NCO("NCO"),
    NMX("NMX"),
    PNX("PNX"),
    SCO("SCO"),
    TSN("TSN"),
    UTA("UTA"),
    MAL("MAL"),
    ND("ND"),
    SD("SD"),
    IA("IA"),
    NE("NE"),
    MN("MN"),
    BLVU("BLVU"),
    EAST("EAST"),
    EUGN("EUGN"),
    OLYM("OLYM"),
    OREA("OREA"),
    PORT("PORT"),
    SEAT("SEAT"),
    SPOK("SPOK"),
    VANC("VANC"),
    CPR("CPR"),
    XNDU("XNDU"),
    UT("UT"),
    WY("WY"),
    MT("MT"),
    WO("WO"),
    ID("ID"),
    WI("WI"),
    CO("CO"),
    WYO("WYO");
    private final String value;

    AreaT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaT fromValue(String v) {
        for (AreaT c: AreaT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
