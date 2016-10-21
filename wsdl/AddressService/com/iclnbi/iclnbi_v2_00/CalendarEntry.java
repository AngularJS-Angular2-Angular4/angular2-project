
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEntry complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CalendarEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeZone" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TimeZone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarEntry", propOrder = {
    "timeZone"
})
@XmlSeeAlso({
    CalendarActionEntry.class
})
public class CalendarEntry {

    @XmlElementRef(name = "TimeZone", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeZone> timeZone;

    /**
     * Gets the value of the timeZone property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TimeZone }{@code >}
     *
     */
    public JAXBElement<TimeZone> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TimeZone }{@code >}
     *
     */
    public void setTimeZone(JAXBElement<TimeZone> value) {
        this.timeZone = value;
    }

}
