
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberedAddressT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NumberedAddressT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Community" type="{http://www.qwest.com/XMLSchema}CommunityT" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.qwest.com/XMLSchema}StreetNameT" minOccurs="0"/>
 *         &lt;element name="StreetNumber" type="{http://www.qwest.com/XMLSchema}StreetNumberT" minOccurs="0"/>
 *         &lt;element name="SupplementalAddress" type="{http://www.qwest.com/XMLSchema}SupplementalAddressT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberedAddressT", propOrder = {
    "community",
    "streetName",
    "streetNumber",
    "supplementalAddress"
})
public class NumberedAddressT {

    @XmlElementRef(name = "Community", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CommunityT> community;
    @XmlElementRef(name = "StreetName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetNameT> streetName;
    @XmlElementRef(name = "StreetNumber", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetNumberT> streetNumber;
    @XmlElementRef(name = "SupplementalAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<SupplementalAddressT> supplementalAddress;

    /**
     * Gets the value of the community property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CommunityT }{@code >}
     *
     */
    public JAXBElement<CommunityT> getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CommunityT }{@code >}
     *
     */
    public void setCommunity(JAXBElement<CommunityT> value) {
        this.community = value;
    }

    /**
     * Gets the value of the streetName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link StreetNameT }{@code >}
     *
     */
    public JAXBElement<StreetNameT> getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link StreetNameT }{@code >}
     *
     */
    public void setStreetName(JAXBElement<StreetNameT> value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link StreetNumberT }{@code >}
     *
     */
    public JAXBElement<StreetNumberT> getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link StreetNumberT }{@code >}
     *
     */
    public void setStreetNumber(JAXBElement<StreetNumberT> value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the supplementalAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SupplementalAddressT }{@code >}
     *
     */
    public JAXBElement<SupplementalAddressT> getSupplementalAddress() {
        return supplementalAddress;
    }

    /**
     * Sets the value of the supplementalAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SupplementalAddressT }{@code >}
     *
     */
    public void setSupplementalAddress(JAXBElement<SupplementalAddressT> value) {
        this.supplementalAddress = value;
    }

}
