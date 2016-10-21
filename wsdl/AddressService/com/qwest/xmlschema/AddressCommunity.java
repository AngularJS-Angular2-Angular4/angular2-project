
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressCommunity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddressCommunity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CivicAddress" type="{http://www.qwest.com/XMLSchema}ArrayOfCivicAddressT" minOccurs="0"/>
 *         &lt;element name="Community" type="{http://www.qwest.com/XMLSchema}ArrayOfCommunityT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressCommunity", propOrder = {
    "civicAddress",
    "community"
})
public class AddressCommunity {

    @XmlElementRef(name = "CivicAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCivicAddressT> civicAddress;
    @XmlElementRef(name = "Community", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCommunityT> community;

    /**
     * Gets the value of the civicAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCivicAddressT }{@code >}
     *
     */
    public JAXBElement<ArrayOfCivicAddressT> getCivicAddress() {
        return civicAddress;
    }

    /**
     * Sets the value of the civicAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCivicAddressT }{@code >}
     *
     */
    public void setCivicAddress(JAXBElement<ArrayOfCivicAddressT> value) {
        this.civicAddress = value;
    }

    /**
     * Gets the value of the community property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCommunityT }{@code >}
     *
     */
    public JAXBElement<ArrayOfCommunityT> getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCommunityT }{@code >}
     *
     */
    public void setCommunity(JAXBElement<ArrayOfCommunityT> value) {
        this.community = value;
    }

}
