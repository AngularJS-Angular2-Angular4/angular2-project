
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outDueDate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="outDueDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outDueMonth" type="{http://www.w3.org/namespace/}outDueMonth" minOccurs="0"/>
 *         &lt;element name="outDueDay" type="{http://www.w3.org/namespace/}outDueDay" minOccurs="0"/>
 *         &lt;element name="outDueYear" type="{http://www.w3.org/namespace/}outDueYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outDueDate", propOrder = {
    "outDueMonth",
    "outDueDay",
    "outDueYear"
})
public class OutDueDate {

    @XmlElementRef(name = "outDueMonth", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<OutDueMonth> outDueMonth;
    @XmlElementRef(name = "outDueDay", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<OutDueDay> outDueDay;
    @XmlElementRef(name = "outDueYear", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<OutDueYear> outDueYear;

    /**
     * Gets the value of the outDueMonth property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutDueMonth }{@code >}
     *
     */
    public JAXBElement<OutDueMonth> getOutDueMonth() {
        return outDueMonth;
    }

    /**
     * Sets the value of the outDueMonth property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutDueMonth }{@code >}
     *
     */
    public void setOutDueMonth(JAXBElement<OutDueMonth> value) {
        this.outDueMonth = value;
    }

    /**
     * Gets the value of the outDueDay property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutDueDay }{@code >}
     *
     */
    public JAXBElement<OutDueDay> getOutDueDay() {
        return outDueDay;
    }

    /**
     * Sets the value of the outDueDay property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutDueDay }{@code >}
     *
     */
    public void setOutDueDay(JAXBElement<OutDueDay> value) {
        this.outDueDay = value;
    }

    /**
     * Gets the value of the outDueYear property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutDueYear }{@code >}
     *
     */
    public JAXBElement<OutDueYear> getOutDueYear() {
        return outDueYear;
    }

    /**
     * Sets the value of the outDueYear property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutDueYear }{@code >}
     *
     */
    public void setOutDueYear(JAXBElement<OutDueYear> value) {
        this.outDueYear = value;
    }

}
