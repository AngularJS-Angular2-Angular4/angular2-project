
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseNumber complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HouseNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseHouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouseNumberPreffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouseNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseNumber", propOrder = {
    "baseHouseNumber",
    "houseNumberPreffix",
    "houseNumberSuffix"
})
public class HouseNumber {

    @XmlElementRef(name = "BaseHouseNumber", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseHouseNumber;
    @XmlElementRef(name = "HouseNumberPreffix", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumberPreffix;
    @XmlElementRef(name = "HouseNumberSuffix", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumberSuffix;

    /**
     * Gets the value of the baseHouseNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBaseHouseNumber() {
        return baseHouseNumber;
    }

    /**
     * Sets the value of the baseHouseNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBaseHouseNumber(JAXBElement<String> value) {
        this.baseHouseNumber = value;
    }

    /**
     * Gets the value of the houseNumberPreffix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getHouseNumberPreffix() {
        return houseNumberPreffix;
    }

    /**
     * Sets the value of the houseNumberPreffix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setHouseNumberPreffix(JAXBElement<String> value) {
        this.houseNumberPreffix = value;
    }

    /**
     * Gets the value of the houseNumberSuffix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getHouseNumberSuffix() {
        return houseNumberSuffix;
    }

    /**
     * Sets the value of the houseNumberSuffix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setHouseNumberSuffix(JAXBElement<String> value) {
        this.houseNumberSuffix = value;
    }

}
