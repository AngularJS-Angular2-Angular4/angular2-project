
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EchoRequestT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EchoRequestT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessParams" type="{http://www.qwest.com/XMLSchema}AccessParamsT" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.qwest.com/XMLSchema}AreaT" minOccurs="0"/>
 *         &lt;element name="CivicAddress" type="{http://www.qwest.com/XMLSchema}CivicAddressT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EchoRequestT", propOrder = {
    "accessParams",
    "area",
    "civicAddress"
})
public class EchoRequestT {

    @XmlElementRef(name = "AccessParams", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccessParamsT> accessParams;
    @XmlElement(name = "Area")
    @XmlSchemaType(name = "string")
    protected AreaT area;
    @XmlElementRef(name = "CivicAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CivicAddressT> civicAddress;

    /**
     * Gets the value of the accessParams property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AccessParamsT }{@code >}
     *
     */
    public JAXBElement<AccessParamsT> getAccessParams() {
        return accessParams;
    }

    /**
     * Sets the value of the accessParams property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AccessParamsT }{@code >}
     *
     */
    public void setAccessParams(JAXBElement<AccessParamsT> value) {
        this.accessParams = value;
    }

    /**
     * Gets the value of the area property.
     *
     * @return
     *     possible object is
     *     {@link AreaT }
     *
     */
    public AreaT getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value
     *     allowed object is
     *     {@link AreaT }
     *
     */
    public void setArea(AreaT value) {
        this.area = value;
    }

    /**
     * Gets the value of the civicAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressT }{@code >}
     *
     */
    public JAXBElement<CivicAddressT> getCivicAddress() {
        return civicAddress;
    }

    /**
     * Sets the value of the civicAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressT }{@code >}
     *
     */
    public void setCivicAddress(JAXBElement<CivicAddressT> value) {
        this.civicAddress = value;
    }

}
