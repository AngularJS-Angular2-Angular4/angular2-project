
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarPartyRole complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CalendarPartyRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalendarAvailability" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCalendarAvailability" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarPartyRole", propOrder = {
    "calendarAvailability",
    "source"
})
public class CalendarPartyRole {

    @XmlElementRef(name = "CalendarAvailability", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCalendarAvailability> calendarAvailability;
    @XmlElementRef(name = "Source", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResource> source;

    /**
     * Gets the value of the calendarAvailability property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCalendarAvailability }{@code >}
     *
     */
    public JAXBElement<ArrayOfCalendarAvailability> getCalendarAvailability() {
        return calendarAvailability;
    }

    /**
     * Sets the value of the calendarAvailability property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCalendarAvailability }{@code >}
     *
     */
    public void setCalendarAvailability(JAXBElement<ArrayOfCalendarAvailability> value) {
        this.calendarAvailability = value;
    }

    /**
     * Gets the value of the source property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResource }{@code >}
     *
     */
    public JAXBElement<ArrayOfResource> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResource }{@code >}
     *
     */
    public void setSource(JAXBElement<ArrayOfResource> value) {
        this.source = value;
    }

}
