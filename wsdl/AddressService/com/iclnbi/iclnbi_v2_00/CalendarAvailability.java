
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarAvailability complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CalendarAvailability">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}CalendarActionEntry">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodAvailability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availability" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfAvailability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarAvailability", propOrder = {
    "type",
    "method",
    "methodAvailability",
    "availability"
})
public class CalendarAvailability
    extends CalendarActionEntry
{

    @XmlElementRef(name = "type", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "method", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> method;
    @XmlElementRef(name = "methodAvailability", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> methodAvailability;
    @XmlElementRef(name = "availability", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAvailability> availability;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the method property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMethod(JAXBElement<String> value) {
        this.method = value;
    }

    /**
     * Gets the value of the methodAvailability property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMethodAvailability() {
        return methodAvailability;
    }

    /**
     * Sets the value of the methodAvailability property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMethodAvailability(JAXBElement<String> value) {
        this.methodAvailability = value;
    }

    /**
     * Gets the value of the availability property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAvailability }{@code >}
     *
     */
    public JAXBElement<ArrayOfAvailability> getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAvailability }{@code >}
     *
     */
    public void setAvailability(JAXBElement<ArrayOfAvailability> value) {
        this.availability = value;
    }

}
