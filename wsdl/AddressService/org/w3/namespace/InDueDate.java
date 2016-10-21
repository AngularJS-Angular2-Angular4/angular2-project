
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inDueDate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="inDueDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inDueMonth" type="{http://www.w3.org/namespace/}inDueMonth" minOccurs="0"/>
 *         &lt;element name="inDueDay" type="{http://www.w3.org/namespace/}inDueDay" minOccurs="0"/>
 *         &lt;element name="inDueYear" type="{http://www.w3.org/namespace/}inDueYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inDueDate", propOrder = {
    "inDueMonth",
    "inDueDay",
    "inDueYear"
})
public class InDueDate {

    @XmlElementRef(name = "inDueMonth", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<InDueMonth> inDueMonth;
    @XmlElementRef(name = "inDueDay", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<InDueDay> inDueDay;
    @XmlElementRef(name = "inDueYear", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<InDueYear> inDueYear;

    /**
     * Gets the value of the inDueMonth property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InDueMonth }{@code >}
     *
     */
    public JAXBElement<InDueMonth> getInDueMonth() {
        return inDueMonth;
    }

    /**
     * Sets the value of the inDueMonth property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InDueMonth }{@code >}
     *
     */
    public void setInDueMonth(JAXBElement<InDueMonth> value) {
        this.inDueMonth = value;
    }

    /**
     * Gets the value of the inDueDay property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InDueDay }{@code >}
     *
     */
    public JAXBElement<InDueDay> getInDueDay() {
        return inDueDay;
    }

    /**
     * Sets the value of the inDueDay property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InDueDay }{@code >}
     *
     */
    public void setInDueDay(JAXBElement<InDueDay> value) {
        this.inDueDay = value;
    }

    /**
     * Gets the value of the inDueYear property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InDueYear }{@code >}
     *
     */
    public JAXBElement<InDueYear> getInDueYear() {
        return inDueYear;
    }

    /**
     * Sets the value of the inDueYear property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InDueYear }{@code >}
     *
     */
    public void setInDueYear(JAXBElement<InDueYear> value) {
        this.inDueYear = value;
    }

}
