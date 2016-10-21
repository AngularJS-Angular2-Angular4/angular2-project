
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmericanPropertyAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AmericanPropertyAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}UrbanPropertyAddress">
 *       &lt;sequence>
 *         &lt;element name="streetNrFirstPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNrLastPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvolvedParty" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmericanPropertyAddress", propOrder = {
    "streetNrFirstPrefix",
    "streetNrLastPrefix",
    "streetNamePrefix",
    "streetNameSuffix",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "involvedParty"
})
public class AmericanPropertyAddress
    extends UrbanPropertyAddress
{

    @XmlElementRef(name = "streetNrFirstPrefix", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrFirstPrefix;
    @XmlElementRef(name = "streetNrLastPrefix", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrLastPrefix;
    @XmlElementRef(name = "streetNamePrefix", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNamePrefix;
    @XmlElementRef(name = "streetNameSuffix", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNameSuffix;
    @XmlElementRef(name = "AddressLine1", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "AddressLine3", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine3;
    @XmlElementRef(name = "InvolvedParty", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParty> involvedParty;

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
     * Gets the value of the addressLine1 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAddressLine3(JAXBElement<String> value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the involvedParty property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfParty }{@code >}
     *
     */
    public JAXBElement<ArrayOfParty> getInvolvedParty() {
        return involvedParty;
    }

    /**
     * Sets the value of the involvedParty property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfParty }{@code >}
     *
     */
    public void setInvolvedParty(JAXBElement<ArrayOfParty> value) {
        this.involvedParty = value;
    }

}
