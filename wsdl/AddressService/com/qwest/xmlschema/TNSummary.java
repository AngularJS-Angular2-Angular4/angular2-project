
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TNSummary complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TNSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonPublishedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TNStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNSummary", propOrder = {
    "customerName",
    "nonPublishedInd",
    "tnStatus",
    "telephoneNumber"
})
public class TNSummary {

    @XmlElementRef(name = "CustomerName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerName;
    @XmlElement(name = "NonPublishedInd")
    protected Boolean nonPublishedInd;
    @XmlElementRef(name = "TNStatus", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tnStatus;
    @XmlElementRef(name = "TelephoneNumber", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telephoneNumber;

    /**
     * Gets the value of the customerName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCustomerName(JAXBElement<String> value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the nonPublishedInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isNonPublishedInd() {
        return nonPublishedInd;
    }

    /**
     * Sets the value of the nonPublishedInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNonPublishedInd(Boolean value) {
        this.nonPublishedInd = value;
    }

    /**
     * Gets the value of the tnStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTNStatus() {
        return tnStatus;
    }

    /**
     * Sets the value of the tnStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTNStatus(JAXBElement<String> value) {
        this.tnStatus = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTelephoneNumber(JAXBElement<String> value) {
        this.telephoneNumber = value;
    }

}
