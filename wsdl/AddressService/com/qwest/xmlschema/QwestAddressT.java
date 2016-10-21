
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QwestAddressT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QwestAddressT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Box" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Community" type="{http://www.qwest.com/XMLSchema}CommunityT" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptiveLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeographicSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "QwestAddressT", propOrder = {
    "additionalLocation",
    "box",
    "community",
    "customerName",
    "descriptiveLocation",
    "geographicSegment",
    "internalStreetNumber",
    "route",
    "streetId",
    "streetName",
    "supplementalAddress"
})
@XmlSeeAlso({
    AHNMatch.class
})
public class QwestAddressT {

    @XmlElementRef(name = "AdditionalLocation", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalLocation;
    @XmlElementRef(name = "Box", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> box;
    @XmlElementRef(name = "Community", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CommunityT> community;
    @XmlElementRef(name = "CustomerName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerName;
    @XmlElementRef(name = "DescriptiveLocation", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptiveLocation;
    @XmlElementRef(name = "GeographicSegment", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geographicSegment;
    @XmlElementRef(name = "InternalStreetNumber", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> internalStreetNumber;
    @XmlElementRef(name = "Route", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> route;
    @XmlElementRef(name = "StreetId", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetId;
    @XmlElementRef(name = "StreetName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetNameT> streetName;
    @XmlElementRef(name = "SupplementalAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<SupplementalAddressT> supplementalAddress;

    /**
     * Gets the value of the additionalLocation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAdditionalLocation() {
        return additionalLocation;
    }

    /**
     * Sets the value of the additionalLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAdditionalLocation(JAXBElement<String> value) {
        this.additionalLocation = value;
    }

    /**
     * Gets the value of the box property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBox() {
        return box;
    }

    /**
     * Sets the value of the box property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBox(JAXBElement<String> value) {
        this.box = value;
    }

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
     * Gets the value of the descriptiveLocation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDescriptiveLocation() {
        return descriptiveLocation;
    }

    /**
     * Sets the value of the descriptiveLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDescriptiveLocation(JAXBElement<String> value) {
        this.descriptiveLocation = value;
    }

    /**
     * Gets the value of the geographicSegment property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getGeographicSegment() {
        return geographicSegment;
    }

    /**
     * Sets the value of the geographicSegment property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setGeographicSegment(JAXBElement<String> value) {
        this.geographicSegment = value;
    }

    /**
     * Gets the value of the internalStreetNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getInternalStreetNumber() {
        return internalStreetNumber;
    }

    /**
     * Sets the value of the internalStreetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setInternalStreetNumber(JAXBElement<String> value) {
        this.internalStreetNumber = value;
    }

    /**
     * Gets the value of the route property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRoute(JAXBElement<String> value) {
        this.route = value;
    }

    /**
     * Gets the value of the streetId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStreetId() {
        return streetId;
    }

    /**
     * Sets the value of the streetId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStreetId(JAXBElement<String> value) {
        this.streetId = value;
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
