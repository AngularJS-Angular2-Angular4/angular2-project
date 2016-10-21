
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GeographicAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}AbstractGeographicAddress">
 *       &lt;sequence>
 *         &lt;element name="GeographicLocation" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfGeographicLocation" minOccurs="0"/>
 *         &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEntityRole" minOccurs="0"/>
 *         &lt;element name="CLLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoAddressHasLogicalAddresses" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfLogicalAddress" minOccurs="0"/>
 *         &lt;element name="EllipticLocation" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Elliptic" minOccurs="0"/>
 *         &lt;element name="PoBoxAddress" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PoBoxAddress" minOccurs="0"/>
 *         &lt;element name="GridLocalLocation" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}GridLocalLocation" minOccurs="0"/>
 *         &lt;element name="ExchangeServiceArea" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfExchangeServiceArea" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Country" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicAddress", propOrder = {
    "geographicLocation",
    "stateOrProvince",
    "addressType",
    "addressRole",
    "clli",
    "geoAddressHasLogicalAddresses",
    "ellipticLocation",
    "poBoxAddress",
    "gridLocalLocation",
    "exchangeServiceArea",
    "country"
})
@XmlSeeAlso({
    UrbanPropertyAddress.class
})
public class GeographicAddress
    extends AbstractGeographicAddress
{

    @XmlElementRef(name = "GeographicLocation", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGeographicLocation> geographicLocation;
    @XmlElementRef(name = "stateOrProvince", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateOrProvince;
    @XmlElementRef(name = "addressType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressType;
    @XmlElementRef(name = "AddressRole", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEntityRole> addressRole;
    @XmlElementRef(name = "CLLI", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clli;
    @XmlElementRef(name = "GeoAddressHasLogicalAddresses", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLogicalAddress> geoAddressHasLogicalAddresses;
    @XmlElementRef(name = "EllipticLocation", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Elliptic> ellipticLocation;
    @XmlElementRef(name = "PoBoxAddress", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PoBoxAddress> poBoxAddress;
    @XmlElementRef(name = "GridLocalLocation", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<GridLocalLocation> gridLocalLocation;
    @XmlElementRef(name = "ExchangeServiceArea", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExchangeServiceArea> exchangeServiceArea;
    @XmlElementRef(name = "Country", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Country> country;

    /**
     * Gets the value of the geographicLocation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfGeographicLocation }{@code >}
     *
     */
    public JAXBElement<ArrayOfGeographicLocation> getGeographicLocation() {
        return geographicLocation;
    }

    /**
     * Sets the value of the geographicLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfGeographicLocation }{@code >}
     *
     */
    public void setGeographicLocation(JAXBElement<ArrayOfGeographicLocation> value) {
        this.geographicLocation = value;
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
     * Gets the value of the addressType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAddressType(JAXBElement<String> value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressRole property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEntityRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfEntityRole> getAddressRole() {
        return addressRole;
    }

    /**
     * Sets the value of the addressRole property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEntityRole }{@code >}
     *
     */
    public void setAddressRole(JAXBElement<ArrayOfEntityRole> value) {
        this.addressRole = value;
    }

    /**
     * Gets the value of the clli property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCLLI() {
        return clli;
    }

    /**
     * Sets the value of the clli property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCLLI(JAXBElement<String> value) {
        this.clli = value;
    }

    /**
     * Gets the value of the geoAddressHasLogicalAddresses property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLogicalAddress }{@code >}
     *
     */
    public JAXBElement<ArrayOfLogicalAddress> getGeoAddressHasLogicalAddresses() {
        return geoAddressHasLogicalAddresses;
    }

    /**
     * Sets the value of the geoAddressHasLogicalAddresses property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLogicalAddress }{@code >}
     *
     */
    public void setGeoAddressHasLogicalAddresses(JAXBElement<ArrayOfLogicalAddress> value) {
        this.geoAddressHasLogicalAddresses = value;
    }

    /**
     * Gets the value of the ellipticLocation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Elliptic }{@code >}
     *
     */
    public JAXBElement<Elliptic> getEllipticLocation() {
        return ellipticLocation;
    }

    /**
     * Sets the value of the ellipticLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Elliptic }{@code >}
     *
     */
    public void setEllipticLocation(JAXBElement<Elliptic> value) {
        this.ellipticLocation = value;
    }

    /**
     * Gets the value of the poBoxAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PoBoxAddress }{@code >}
     *
     */
    public JAXBElement<PoBoxAddress> getPoBoxAddress() {
        return poBoxAddress;
    }

    /**
     * Sets the value of the poBoxAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PoBoxAddress }{@code >}
     *
     */
    public void setPoBoxAddress(JAXBElement<PoBoxAddress> value) {
        this.poBoxAddress = value;
    }

    /**
     * Gets the value of the gridLocalLocation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link GridLocalLocation }{@code >}
     *
     */
    public JAXBElement<GridLocalLocation> getGridLocalLocation() {
        return gridLocalLocation;
    }

    /**
     * Sets the value of the gridLocalLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link GridLocalLocation }{@code >}
     *
     */
    public void setGridLocalLocation(JAXBElement<GridLocalLocation> value) {
        this.gridLocalLocation = value;
    }

    /**
     * Gets the value of the exchangeServiceArea property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfExchangeServiceArea }{@code >}
     *
     */
    public JAXBElement<ArrayOfExchangeServiceArea> getExchangeServiceArea() {
        return exchangeServiceArea;
    }

    /**
     * Sets the value of the exchangeServiceArea property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfExchangeServiceArea }{@code >}
     *
     */
    public void setExchangeServiceArea(JAXBElement<ArrayOfExchangeServiceArea> value) {
        this.exchangeServiceArea = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Country }{@code >}
     *
     */
    public JAXBElement<Country> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Country }{@code >}
     *
     */
    public void setCountry(JAXBElement<Country> value) {
        this.country = value;
    }

}
