
package com.ctl.as.domain.geo.v2.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.SubAddressDesignator;


/**
 * <p>Java class for PostalAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PostalAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types}AmericanPropertyAddress">
 *       &lt;sequence>
 *         &lt;element name="SubAddress" type="{http://geo.domain.as.ctl.com/Types}SubAddressDesignator" minOccurs="0"/>
 *         &lt;element name="PostalPreferredLocalityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetComponentsChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StreetNameChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalityChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PostCodeChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress", propOrder = {
    "subAddress",
    "postalPreferredLocalityName",
    "streetComponentsChanged",
    "streetNameChanged",
    "localityChanged",
    "postCodeChanged"
})
public class PostalAddress
    extends AmericanPropertyAddress
{

    @XmlElementRef(name = "SubAddress", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<SubAddressDesignator> subAddress;
    @XmlElementRef(name = "PostalPreferredLocalityName", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalPreferredLocalityName;
    @XmlElement(name = "StreetComponentsChanged")
    protected Boolean streetComponentsChanged;
    @XmlElement(name = "StreetNameChanged")
    protected Boolean streetNameChanged;
    @XmlElement(name = "LocalityChanged")
    protected Boolean localityChanged;
    @XmlElement(name = "PostCodeChanged")
    protected Boolean postCodeChanged;

    /**
     * Gets the value of the subAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SubAddressDesignator }{@code >}
     *
     */
    public JAXBElement<SubAddressDesignator> getSubAddress() {
        return subAddress;
    }

    /**
     * Sets the value of the subAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SubAddressDesignator }{@code >}
     *
     */
    public void setSubAddress(JAXBElement<SubAddressDesignator> value) {
        this.subAddress = value;
    }

    /**
     * Gets the value of the postalPreferredLocalityName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPostalPreferredLocalityName() {
        return postalPreferredLocalityName;
    }

    /**
     * Sets the value of the postalPreferredLocalityName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPostalPreferredLocalityName(JAXBElement<String> value) {
        this.postalPreferredLocalityName = value;
    }

    /**
     * Gets the value of the streetComponentsChanged property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isStreetComponentsChanged() {
        return streetComponentsChanged;
    }

    /**
     * Sets the value of the streetComponentsChanged property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setStreetComponentsChanged(Boolean value) {
        this.streetComponentsChanged = value;
    }

    /**
     * Gets the value of the streetNameChanged property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isStreetNameChanged() {
        return streetNameChanged;
    }

    /**
     * Sets the value of the streetNameChanged property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setStreetNameChanged(Boolean value) {
        this.streetNameChanged = value;
    }

    /**
     * Gets the value of the localityChanged property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isLocalityChanged() {
        return localityChanged;
    }

    /**
     * Sets the value of the localityChanged property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setLocalityChanged(Boolean value) {
        this.localityChanged = value;
    }

    /**
     * Gets the value of the postCodeChanged property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPostCodeChanged() {
        return postCodeChanged;
    }

    /**
     * Sets the value of the postCodeChanged property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPostCodeChanged(Boolean value) {
        this.postCodeChanged = value;
    }

}
