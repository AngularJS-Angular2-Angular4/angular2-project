
package com.ctl.as.domain.geo.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Found"/>
 *     &lt;enumeration value="NotFound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchResult")
@XmlEnum
public enum SearchResult {

    @XmlEnumValue("Found")
    FOUND("Found"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound");
    private final String value;

    SearchResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchResult fromValue(String v) {
        for (SearchResult c: SearchResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
