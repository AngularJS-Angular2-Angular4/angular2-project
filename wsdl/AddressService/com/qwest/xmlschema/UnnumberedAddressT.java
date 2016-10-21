
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnnumberedAddressT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UnnumberedAddressT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Community" type="{http://www.qwest.com/XMLSchema}CommunityT" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.qwest.com/XMLSchema}StreetNameT" minOccurs="0"/>
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
@XmlType(name = "UnnumberedAddressT", propOrder = {
    "community",
    "description",
    "streetName",
    "supplementalAddress"
})
public class UnnumberedAddressT {

    @XmlElementRef(name = "Community", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CommunityT> community;
    @XmlElementRef(name = "Description", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "StreetName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetNameT> streetName;
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
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
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
