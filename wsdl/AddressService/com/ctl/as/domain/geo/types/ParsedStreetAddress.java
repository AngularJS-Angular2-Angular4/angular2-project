
package com.ctl.as.domain.geo.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParsedStreetAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ParsedStreetAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNrFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNrFirstPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNrFirstSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParsedStreetAddress", propOrder = {
    "streetName",
    "streetNamePrefix",
    "streetNameSuffix",
    "streetNrFirst",
    "streetNrFirstPrefix",
    "streetNrFirstSuffix",
    "streetType"
})
public class ParsedStreetAddress {

    @XmlElementRef(name = "StreetName", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetName;
    @XmlElementRef(name = "StreetNamePrefix", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNamePrefix;
    @XmlElementRef(name = "StreetNameSuffix", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNameSuffix;
    @XmlElementRef(name = "StreetNrFirst", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrFirst;
    @XmlElementRef(name = "StreetNrFirstPrefix", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrFirstPrefix;
    @XmlElementRef(name = "StreetNrFirstSuffix", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrFirstSuffix;
    @XmlElementRef(name = "StreetType", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetType;

    /**
     * Gets the value of the streetName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetName(JAXBElement<String> value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetNamePrefix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetNamePrefix() {
        return streetNamePrefix;
    }

    /**
     * Sets the value of the streetNamePrefix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetNamePrefix(JAXBElement<String> value) {
        this.streetNamePrefix = value;
    }

    /**
     * Gets the value of the streetNameSuffix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetNameSuffix() {
        return streetNameSuffix;
    }

    /**
     * Sets the value of the streetNameSuffix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetNameSuffix(JAXBElement<String> value) {
        this.streetNameSuffix = value;
    }

    /**
     * Gets the value of the streetNrFirst property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetNrFirst() {
        return streetNrFirst;
    }

    /**
     * Sets the value of the streetNrFirst property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetNrFirst(JAXBElement<String> value) {
        this.streetNrFirst = value;
    }

    /**
     * Gets the value of the streetNrFirstPrefix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getStreetNrFirstPrefix() {
        return streetNrFirstPrefix;
    }

    /**
     * Sets the value of the streetNrFirstPrefix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setStreetNrFirstPrefix(JAXBElement<String> value) {
        this.streetNrFirstPrefix = value;
    }

    /**
     * Gets the value of the streetNrFirstSuffix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getStreetNrFirstSuffix() {
        return streetNrFirstSuffix;
    }

    /**
     * Sets the value of the streetNrFirstSuffix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setStreetNrFirstSuffix(JAXBElement<String> value) {
        this.streetNrFirstSuffix = value;
    }

    /**
     * Gets the value of the streetType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetType(JAXBElement<String> value) {
        this.streetType = value;
    }

}
