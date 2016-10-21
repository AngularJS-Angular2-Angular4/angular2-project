
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="updateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessPointInfo" type="{http://www.w3.org/namespace/}ArrayOfaccessPointInfo" minOccurs="0"/>
 *         &lt;element name="jacks" type="{http://www.w3.org/namespace/}jacks" minOccurs="0"/>
 *         &lt;element name="dropPole" type="{http://www.w3.org/namespace/}dropPole" minOccurs="0"/>
 *         &lt;element name="geographicalBlock" type="{http://www.w3.org/namespace/}geographicalBlock" minOccurs="0"/>
 *         &lt;element name="rateZone" type="{http://www.w3.org/namespace/}rateZone" minOccurs="0"/>
 *         &lt;element name="coaxCode" type="{http://www.w3.org/namespace/}coaxCode" minOccurs="0"/>
 *         &lt;element name="restrictCode" type="{http://www.w3.org/namespace/}restrictCode" minOccurs="0"/>
 *         &lt;element name="carrierFilterFlag" type="{http://www.w3.org/namespace/}carrierFilterFlag" minOccurs="0"/>
 *         &lt;element name="broadbandInd" type="{http://www.w3.org/namespace/}broadbandInd" minOccurs="0"/>
 *         &lt;element name="phoneMartSwitch" type="{http://www.w3.org/namespace/}phoneMartSwitch" minOccurs="0"/>
 *         &lt;element name="cpeSwitch" type="{http://www.w3.org/namespace/}cpeSwitch" minOccurs="0"/>
 *         &lt;element name="lastTelephone" type="{http://www.w3.org/namespace/}lastTelephone" minOccurs="0"/>
 *         &lt;element name="dedicatedCount" type="{http://www.w3.org/namespace/}dedicatedCount" minOccurs="0"/>
 *         &lt;element name="postalZip" type="{http://www.w3.org/namespace/}postalZip" minOccurs="0"/>
 *         &lt;element name="taxJurisdiction" type="{http://www.w3.org/namespace/}taxJurisdiction" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/namespace/}latitude" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/namespace/}longitude" minOccurs="0"/>
 *         &lt;element name="elevation" type="{http://www.w3.org/namespace/}elevation" minOccurs="0"/>
 *         &lt;element name="datum" type="{http://www.w3.org/namespace/}datum" minOccurs="0"/>
 *         &lt;element name="addressAliasId" type="{http://www.w3.org/namespace/}addressAliasId" minOccurs="0"/>
 *         &lt;element name="addressRemark" type="{http://www.w3.org/namespace/}ArrayOfaddressRemark" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateInfo", propOrder = {
    "accessPointInfo",
    "jacks",
    "dropPole",
    "geographicalBlock",
    "rateZone",
    "coaxCode",
    "restrictCode",
    "carrierFilterFlag",
    "broadbandInd",
    "phoneMartSwitch",
    "cpeSwitch",
    "lastTelephone",
    "dedicatedCount",
    "postalZip",
    "taxJurisdiction",
    "latitude",
    "longitude",
    "elevation",
    "datum",
    "addressAliasId",
    "addressRemark"
})
public class UpdateInfo {

    @XmlElementRef(name = "accessPointInfo", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfaccessPointInfo> accessPointInfo;
    @XmlElementRef(name = "jacks", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<Jacks> jacks;
    @XmlElementRef(name = "dropPole", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<DropPole> dropPole;
    @XmlElementRef(name = "geographicalBlock", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<GeographicalBlock> geographicalBlock;
    @XmlElementRef(name = "rateZone", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<RateZone> rateZone;
    @XmlElementRef(name = "coaxCode", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<CoaxCode> coaxCode;
    @XmlElementRef(name = "restrictCode", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<RestrictCode> restrictCode;
    @XmlElementRef(name = "carrierFilterFlag", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<CarrierFilterFlag> carrierFilterFlag;
    @XmlElementRef(name = "broadbandInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<BroadbandInd> broadbandInd;
    @XmlElementRef(name = "phoneMartSwitch", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneMartSwitch> phoneMartSwitch;
    @XmlElementRef(name = "cpeSwitch", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<CpeSwitch> cpeSwitch;
    @XmlElementRef(name = "lastTelephone", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<LastTelephone> lastTelephone;
    @XmlElementRef(name = "dedicatedCount", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<DedicatedCount> dedicatedCount;
    @XmlElementRef(name = "postalZip", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<PostalZip> postalZip;
    @XmlElementRef(name = "taxJurisdiction", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxJurisdiction> taxJurisdiction;
    @XmlElementRef(name = "latitude", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<Latitude> latitude;
    @XmlElementRef(name = "longitude", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<Longitude> longitude;
    @XmlElementRef(name = "elevation", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<Elevation> elevation;
    @XmlElementRef(name = "datum", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<Datum> datum;
    @XmlElementRef(name = "addressAliasId", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressAliasId> addressAliasId;
    @XmlElementRef(name = "addressRemark", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfaddressRemark> addressRemark;

    /**
     * Gets the value of the accessPointInfo property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfaccessPointInfo }{@code >}
     *
     */
    public JAXBElement<ArrayOfaccessPointInfo> getAccessPointInfo() {
        return accessPointInfo;
    }

    /**
     * Sets the value of the accessPointInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfaccessPointInfo }{@code >}
     *
     */
    public void setAccessPointInfo(JAXBElement<ArrayOfaccessPointInfo> value) {
        this.accessPointInfo = value;
    }

    /**
     * Gets the value of the jacks property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Jacks }{@code >}
     *
     */
    public JAXBElement<Jacks> getJacks() {
        return jacks;
    }

    /**
     * Sets the value of the jacks property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Jacks }{@code >}
     *
     */
    public void setJacks(JAXBElement<Jacks> value) {
        this.jacks = value;
    }

    /**
     * Gets the value of the dropPole property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DropPole }{@code >}
     *
     */
    public JAXBElement<DropPole> getDropPole() {
        return dropPole;
    }

    /**
     * Sets the value of the dropPole property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DropPole }{@code >}
     *
     */
    public void setDropPole(JAXBElement<DropPole> value) {
        this.dropPole = value;
    }

    /**
     * Gets the value of the geographicalBlock property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link GeographicalBlock }{@code >}
     *
     */
    public JAXBElement<GeographicalBlock> getGeographicalBlock() {
        return geographicalBlock;
    }

    /**
     * Sets the value of the geographicalBlock property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link GeographicalBlock }{@code >}
     *
     */
    public void setGeographicalBlock(JAXBElement<GeographicalBlock> value) {
        this.geographicalBlock = value;
    }

    /**
     * Gets the value of the rateZone property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RateZone }{@code >}
     *
     */
    public JAXBElement<RateZone> getRateZone() {
        return rateZone;
    }

    /**
     * Sets the value of the rateZone property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RateZone }{@code >}
     *
     */
    public void setRateZone(JAXBElement<RateZone> value) {
        this.rateZone = value;
    }

    /**
     * Gets the value of the coaxCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CoaxCode }{@code >}
     *
     */
    public JAXBElement<CoaxCode> getCoaxCode() {
        return coaxCode;
    }

    /**
     * Sets the value of the coaxCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CoaxCode }{@code >}
     *
     */
    public void setCoaxCode(JAXBElement<CoaxCode> value) {
        this.coaxCode = value;
    }

    /**
     * Gets the value of the restrictCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RestrictCode }{@code >}
     *
     */
    public JAXBElement<RestrictCode> getRestrictCode() {
        return restrictCode;
    }

    /**
     * Sets the value of the restrictCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RestrictCode }{@code >}
     *
     */
    public void setRestrictCode(JAXBElement<RestrictCode> value) {
        this.restrictCode = value;
    }

    /**
     * Gets the value of the carrierFilterFlag property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CarrierFilterFlag }{@code >}
     *
     */
    public JAXBElement<CarrierFilterFlag> getCarrierFilterFlag() {
        return carrierFilterFlag;
    }

    /**
     * Sets the value of the carrierFilterFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CarrierFilterFlag }{@code >}
     *
     */
    public void setCarrierFilterFlag(JAXBElement<CarrierFilterFlag> value) {
        this.carrierFilterFlag = value;
    }

    /**
     * Gets the value of the broadbandInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BroadbandInd }{@code >}
     *
     */
    public JAXBElement<BroadbandInd> getBroadbandInd() {
        return broadbandInd;
    }

    /**
     * Sets the value of the broadbandInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BroadbandInd }{@code >}
     *
     */
    public void setBroadbandInd(JAXBElement<BroadbandInd> value) {
        this.broadbandInd = value;
    }

    /**
     * Gets the value of the phoneMartSwitch property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PhoneMartSwitch }{@code >}
     *
     */
    public JAXBElement<PhoneMartSwitch> getPhoneMartSwitch() {
        return phoneMartSwitch;
    }

    /**
     * Sets the value of the phoneMartSwitch property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PhoneMartSwitch }{@code >}
     *
     */
    public void setPhoneMartSwitch(JAXBElement<PhoneMartSwitch> value) {
        this.phoneMartSwitch = value;
    }

    /**
     * Gets the value of the cpeSwitch property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CpeSwitch }{@code >}
     *
     */
    public JAXBElement<CpeSwitch> getCpeSwitch() {
        return cpeSwitch;
    }

    /**
     * Sets the value of the cpeSwitch property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CpeSwitch }{@code >}
     *
     */
    public void setCpeSwitch(JAXBElement<CpeSwitch> value) {
        this.cpeSwitch = value;
    }

    /**
     * Gets the value of the lastTelephone property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LastTelephone }{@code >}
     *
     */
    public JAXBElement<LastTelephone> getLastTelephone() {
        return lastTelephone;
    }

    /**
     * Sets the value of the lastTelephone property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LastTelephone }{@code >}
     *
     */
    public void setLastTelephone(JAXBElement<LastTelephone> value) {
        this.lastTelephone = value;
    }

    /**
     * Gets the value of the dedicatedCount property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DedicatedCount }{@code >}
     *
     */
    public JAXBElement<DedicatedCount> getDedicatedCount() {
        return dedicatedCount;
    }

    /**
     * Sets the value of the dedicatedCount property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DedicatedCount }{@code >}
     *
     */
    public void setDedicatedCount(JAXBElement<DedicatedCount> value) {
        this.dedicatedCount = value;
    }

    /**
     * Gets the value of the postalZip property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PostalZip }{@code >}
     *
     */
    public JAXBElement<PostalZip> getPostalZip() {
        return postalZip;
    }

    /**
     * Sets the value of the postalZip property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PostalZip }{@code >}
     *
     */
    public void setPostalZip(JAXBElement<PostalZip> value) {
        this.postalZip = value;
    }

    /**
     * Gets the value of the taxJurisdiction property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TaxJurisdiction }{@code >}
     *
     */
    public JAXBElement<TaxJurisdiction> getTaxJurisdiction() {
        return taxJurisdiction;
    }

    /**
     * Sets the value of the taxJurisdiction property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TaxJurisdiction }{@code >}
     *
     */
    public void setTaxJurisdiction(JAXBElement<TaxJurisdiction> value) {
        this.taxJurisdiction = value;
    }

    /**
     * Gets the value of the latitude property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Latitude }{@code >}
     *
     */
    public JAXBElement<Latitude> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Latitude }{@code >}
     *
     */
    public void setLatitude(JAXBElement<Latitude> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Longitude }{@code >}
     *
     */
    public JAXBElement<Longitude> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Longitude }{@code >}
     *
     */
    public void setLongitude(JAXBElement<Longitude> value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the elevation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Elevation }{@code >}
     *
     */
    public JAXBElement<Elevation> getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Elevation }{@code >}
     *
     */
    public void setElevation(JAXBElement<Elevation> value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the datum property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Datum }{@code >}
     *
     */
    public JAXBElement<Datum> getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Datum }{@code >}
     *
     */
    public void setDatum(JAXBElement<Datum> value) {
        this.datum = value;
    }

    /**
     * Gets the value of the addressAliasId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressAliasId }{@code >}
     *
     */
    public JAXBElement<AddressAliasId> getAddressAliasId() {
        return addressAliasId;
    }

    /**
     * Sets the value of the addressAliasId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressAliasId }{@code >}
     *
     */
    public void setAddressAliasId(JAXBElement<AddressAliasId> value) {
        this.addressAliasId = value;
    }

    /**
     * Gets the value of the addressRemark property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfaddressRemark }{@code >}
     *
     */
    public JAXBElement<ArrayOfaddressRemark> getAddressRemark() {
        return addressRemark;
    }

    /**
     * Sets the value of the addressRemark property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfaddressRemark }{@code >}
     *
     */
    public void setAddressRemark(JAXBElement<ArrayOfaddressRemark> value) {
        this.addressRemark = value;
    }

}
