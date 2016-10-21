
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarActionEntry complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CalendarActionEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}CalendarEntry">
 *       &lt;sequence>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Place" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Place" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarActionEntry", propOrder = {
    "priority",
    "place"
})
@XmlSeeAlso({
    CalendarAvailability.class
})
public class CalendarActionEntry
    extends CalendarEntry
{

    @XmlElementRef(name = "priority", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priority;
    @XmlElementRef(name = "Place", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Place> place;

    /**
     * Gets the value of the priority property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPriority(JAXBElement<String> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the place property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Place }{@code >}
     *
     */
    public JAXBElement<Place> getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Place }{@code >}
     *
     */
    public void setPlace(JAXBElement<Place> value) {
        this.place = value;
    }

}
