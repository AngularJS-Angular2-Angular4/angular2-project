
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrbanPropertyAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UrbanPropertyAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}GeographicAddress">
 *       &lt;sequence>
 *         &lt;element name="primaryAddressLocationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="newConstructionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="addressFormatType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNrFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNrFirstSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNrLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNrLastSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcodeExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanPropertyAddress", propOrder = {
    "primaryAddressLocationIndicator",
    "newConstructionIndicator",
    "addressFormatType",
    "streetNrFirst",
    "streetNrFirstSuffix",
    "streetNrLast",
    "streetNrLastSuffix",
    "streetName",
    "streetType",
    "streetSuffix",
    "locality",
    "postcode",
    "postcodeExt",
    "floor",
    "room",
    "longitude",
    "latitude"
})
@XmlSeeAlso({
    AmericanPropertyAddress.class
})
public class UrbanPropertyAddress
    extends GeographicAddress
{

    protected Boolean primaryAddressLocationIndicator;
    protected Boolean newConstructionIndicator;
    @XmlElementRef(name = "addressFormatType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressFormatType;
    @XmlElementRef(name = "streetNrFirst", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrFirst;
    @XmlElementRef(name = "streetNrFirstSuffix", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrFirstSuffix;
    @XmlElementRef(name = "streetNrLast", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrLast;
    @XmlElementRef(name = "streetNrLastSuffix", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetNrLastSuffix;
    @XmlElementRef(name = "streetName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetName;
    @XmlElementRef(name = "streetType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetType;
    @XmlElementRef(name = "streetSuffix", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetSuffix;
    @XmlElementRef(name = "locality", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locality;
    @XmlElementRef(name = "postcode", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postcode;
    @XmlElementRef(name = "postcodeExt", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postcodeExt;
    @XmlElementRef(name = "floor", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> floor;
    @XmlElementRef(name = "room", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> room;
    @XmlElementRef(name = "longitude", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longitude;
    @XmlElementRef(name = "latitude", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latitude;

    /**
     * Gets the value of the primaryAddressLocationIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPrimaryAddressLocationIndicator() {
        return primaryAddressLocationIndicator;
    }

    /**
     * Sets the value of the primaryAddressLocationIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPrimaryAddressLocationIndicator(Boolean value) {
        this.primaryAddressLocationIndicator = value;
    }

    /**
     * Gets the value of the newConstructionIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isNewConstructionIndicator() {
        return newConstructionIndicator;
    }

    /**
     * Sets the value of the newConstructionIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNewConstructionIndicator(Boolean value) {
        this.newConstructionIndicator = value;
    }

    /**
     * Gets the value of the addressFormatType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAddressFormatType() {
        return addressFormatType;
    }

    /**
     * Sets the value of the addressFormatType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAddressFormatType(JAXBElement<String> value) {
        this.addressFormatType = value;
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
     * Gets the value of the postcode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPostcode(JAXBElement<String> value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the postcodeExt property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPostcodeExt() {
        return postcodeExt;
    }

    /**
     * Sets the value of the postcodeExt property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPostcodeExt(JAXBElement<String> value) {
        this.postcodeExt = value;
    }

    /**
     * Gets the value of the floor property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFloor(JAXBElement<String> value) {
        this.floor = value;
    }

    /**
     * Gets the value of the room property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRoom(JAXBElement<String> value) {
        this.room = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLongitude(JAXBElement<String> value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLatitude(JAXBElement<String> value) {
        this.latitude = value;
    }

}
