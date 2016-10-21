
package com.ctl.as.domain.geo.v2.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmericanPropertyAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AmericanPropertyAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNrFirstPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNrFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNrFirstSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNrLastPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNrLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNrLastSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmericanPropertyAddress", propOrder = {
    "streetAddress",
    "streetNrFirstPrefix",
    "streetNrFirst",
    "streetNrFirstSuffix",
    "streetNrLastPrefix",
    "streetNrLast",
    "streetNrLastSuffix",
    "streetNamePrefix",
    "streetName",
    "streetSuffix",
    "streetType",
    "streetNameSuffix",
    "locality",
    "stateOrProvince",
    "postCode",
    "country"
})
@XmlSeeAlso({
    PostalAddress.class,
    CivicAddress.class,
    ServiceAddress.class,
    ParsedAddress.class
})
public class AmericanPropertyAddress {

    @XmlElementRef(name = "StreetAddress", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetAddress;
    @XmlElementRef(name = "StreetNrFirstPrefix", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrFirstPrefix;
    @XmlElementRef(name = "StreetNrFirst", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrFirst;
    @XmlElementRef(name = "StreetNrFirstSuffix", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrFirstSuffix;
    @XmlElementRef(name = "StreetNrLastPrefix", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrLastPrefix;
    @XmlElementRef(name = "StreetNrLast", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrLast;
    @XmlElementRef(name = "StreetNrLastSuffix", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrLastSuffix;
    @XmlElementRef(name = "StreetNamePrefix", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNamePrefix;
    @XmlElementRef(name = "StreetName", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetName;
    @XmlElementRef(name = "StreetSuffix", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetSuffix;
    @XmlElementRef(name = "StreetType", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetType;
    @XmlElementRef(name = "StreetNameSuffix", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNameSuffix;
    @XmlElementRef(name = "Locality", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locality;
    @XmlElementRef(name = "StateOrProvince", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateOrProvince;
    @XmlElementRef(name = "PostCode", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "Country", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;

    /**
     * Gets the value of the streetAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetAddress(JAXBElement<String> value) {
        this.streetAddress = value;
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
     * Gets the value of the streetNrLastPrefix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetNrLastPrefix() {
        return streetNrLastPrefix;
    }

    /**
     * Sets the value of the streetNrLastPrefix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetNrLastPrefix(JAXBElement<String> value) {
        this.streetNrLastPrefix = value;
    }

    /**
     * Gets the value of the streetNrLast property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetNrLast() {
        return streetNrLast;
    }

    /**
     * Sets the value of the streetNrLast property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetNrLast(JAXBElement<String> value) {
        this.streetNrLast = value;
    }

    /**
     * Gets the value of the streetNrLastSuffix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetNrLastSuffix() {
        return streetNrLastSuffix;
    }

    /**
     * Sets the value of the streetNrLastSuffix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetNrLastSuffix(JAXBElement<String> value) {
        this.streetNrLastSuffix = value;
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
     * Gets the value of the streetSuffix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetSuffix(JAXBElement<String> value) {
        this.streetSuffix = value;
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
     * Gets the value of the locality property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLocality(JAXBElement<String> value) {
        this.locality = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStateOrProvince(JAXBElement<String> value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the postCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

}
