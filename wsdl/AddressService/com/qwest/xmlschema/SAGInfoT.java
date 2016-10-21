
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for SAGInfoT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SAGInfoT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternateCommunity" type="{http://www.qwest.com/XMLSchema}ArrayOfCommunityT" minOccurs="0"/>
 *         &lt;element name="AlternateStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommunityNameRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeCodeSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignTownship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSGRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HuntGroupAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PhoneCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlantDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuralDeliveryArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAGNPA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateNameRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StreetRangeRemarks" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="SwitchList" type="{http://www.qwest.com/XMLSchema}ArrayOfSwitch" minOccurs="0"/>
 *         &lt;element name="TTARemarks" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TwoTechInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WireCenter" type="{http://www.qwest.com/XMLSchema}WireCenterT" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAGInfoT", propOrder = {
    "alternateCommunity",
    "alternateStreet",
    "businessOffice",
    "communityNameRequiredInd",
    "directory",
    "exchangeCode",
    "exchangeCodeSuffix",
    "foreignTownship",
    "gsgRemarks",
    "huntGroupAvailability",
    "phoneCenter",
    "plantDistrict",
    "rateZone",
    "ruralDeliveryArea",
    "sagnpa",
    "stateNameRequiredInd",
    "streetRangeRemarks",
    "switchList",
    "ttaRemarks",
    "taxCode",
    "twoTechInd",
    "wireCenter",
    "zipCode"
})
public class SAGInfoT {

    @XmlElementRef(name = "AlternateCommunity", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCommunityT> alternateCommunity;
    @XmlElementRef(name = "AlternateStreet", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternateStreet;
    @XmlElementRef(name = "BusinessOffice", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessOffice;
    @XmlElement(name = "CommunityNameRequiredInd")
    protected Boolean communityNameRequiredInd;
    @XmlElementRef(name = "Directory", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> directory;
    @XmlElementRef(name = "ExchangeCode", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exchangeCode;
    @XmlElementRef(name = "ExchangeCodeSuffix", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exchangeCodeSuffix;
    @XmlElementRef(name = "ForeignTownship", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> foreignTownship;
    @XmlElementRef(name = "GSGRemarks", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsgRemarks;
    @XmlElement(name = "HuntGroupAvailability")
    protected Boolean huntGroupAvailability;
    @XmlElementRef(name = "PhoneCenter", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneCenter;
    @XmlElementRef(name = "PlantDistrict", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plantDistrict;
    @XmlElementRef(name = "RateZone", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rateZone;
    @XmlElementRef(name = "RuralDeliveryArea", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruralDeliveryArea;
    @XmlElementRef(name = "SAGNPA", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sagnpa;
    @XmlElement(name = "StateNameRequiredInd")
    protected Boolean stateNameRequiredInd;
    @XmlElementRef(name = "StreetRangeRemarks", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> streetRangeRemarks;
    @XmlElementRef(name = "SwitchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSwitch> switchList;
    @XmlElementRef(name = "TTARemarks", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> ttaRemarks;
    @XmlElementRef(name = "TaxCode", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxCode;
    @XmlElement(name = "TwoTechInd")
    protected Boolean twoTechInd;
    @XmlElementRef(name = "WireCenter", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<WireCenterT> wireCenter;
    @XmlElementRef(name = "ZipCode", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipCode;

    /**
     * Gets the value of the alternateCommunity property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCommunityT }{@code >}
     *
     */
    public JAXBElement<ArrayOfCommunityT> getAlternateCommunity() {
        return alternateCommunity;
    }

    /**
     * Sets the value of the alternateCommunity property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCommunityT }{@code >}
     *
     */
    public void setAlternateCommunity(JAXBElement<ArrayOfCommunityT> value) {
        this.alternateCommunity = value;
    }

    /**
     * Gets the value of the alternateStreet property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAlternateStreet() {
        return alternateStreet;
    }

    /**
     * Sets the value of the alternateStreet property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAlternateStreet(JAXBElement<String> value) {
        this.alternateStreet = value;
    }

    /**
     * Gets the value of the businessOffice property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBusinessOffice() {
        return businessOffice;
    }

    /**
     * Sets the value of the businessOffice property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBusinessOffice(JAXBElement<String> value) {
        this.businessOffice = value;
    }

    /**
     * Gets the value of the communityNameRequiredInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCommunityNameRequiredInd() {
        return communityNameRequiredInd;
    }

    /**
     * Sets the value of the communityNameRequiredInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCommunityNameRequiredInd(Boolean value) {
        this.communityNameRequiredInd = value;
    }

    /**
     * Gets the value of the directory property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDirectory(JAXBElement<String> value) {
        this.directory = value;
    }

    /**
     * Gets the value of the exchangeCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getExchangeCode() {
        return exchangeCode;
    }

    /**
     * Sets the value of the exchangeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setExchangeCode(JAXBElement<String> value) {
        this.exchangeCode = value;
    }

    /**
     * Gets the value of the exchangeCodeSuffix property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getExchangeCodeSuffix() {
        return exchangeCodeSuffix;
    }

    /**
     * Sets the value of the exchangeCodeSuffix property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setExchangeCodeSuffix(JAXBElement<String> value) {
        this.exchangeCodeSuffix = value;
    }

    /**
     * Gets the value of the foreignTownship property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getForeignTownship() {
        return foreignTownship;
    }

    /**
     * Sets the value of the foreignTownship property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setForeignTownship(JAXBElement<String> value) {
        this.foreignTownship = value;
    }

    /**
     * Gets the value of the gsgRemarks property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getGSGRemarks() {
        return gsgRemarks;
    }

    /**
     * Sets the value of the gsgRemarks property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setGSGRemarks(JAXBElement<String> value) {
        this.gsgRemarks = value;
    }

    /**
     * Gets the value of the huntGroupAvailability property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHuntGroupAvailability() {
        return huntGroupAvailability;
    }

    /**
     * Sets the value of the huntGroupAvailability property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setHuntGroupAvailability(Boolean value) {
        this.huntGroupAvailability = value;
    }

    /**
     * Gets the value of the phoneCenter property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPhoneCenter() {
        return phoneCenter;
    }

    /**
     * Sets the value of the phoneCenter property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPhoneCenter(JAXBElement<String> value) {
        this.phoneCenter = value;
    }

    /**
     * Gets the value of the plantDistrict property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPlantDistrict() {
        return plantDistrict;
    }

    /**
     * Sets the value of the plantDistrict property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPlantDistrict(JAXBElement<String> value) {
        this.plantDistrict = value;
    }

    /**
     * Gets the value of the rateZone property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRateZone() {
        return rateZone;
    }

    /**
     * Sets the value of the rateZone property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRateZone(JAXBElement<String> value) {
        this.rateZone = value;
    }

    /**
     * Gets the value of the ruralDeliveryArea property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRuralDeliveryArea() {
        return ruralDeliveryArea;
    }

    /**
     * Sets the value of the ruralDeliveryArea property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRuralDeliveryArea(JAXBElement<String> value) {
        this.ruralDeliveryArea = value;
    }

    /**
     * Gets the value of the sagnpa property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSAGNPA() {
        return sagnpa;
    }

    /**
     * Sets the value of the sagnpa property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSAGNPA(JAXBElement<String> value) {
        this.sagnpa = value;
    }

    /**
     * Gets the value of the stateNameRequiredInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isStateNameRequiredInd() {
        return stateNameRequiredInd;
    }

    /**
     * Sets the value of the stateNameRequiredInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setStateNameRequiredInd(Boolean value) {
        this.stateNameRequiredInd = value;
    }

    /**
     * Gets the value of the streetRangeRemarks property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getStreetRangeRemarks() {
        return streetRangeRemarks;
    }

    /**
     * Sets the value of the streetRangeRemarks property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setStreetRangeRemarks(JAXBElement<ArrayOfstring> value) {
        this.streetRangeRemarks = value;
    }

    /**
     * Gets the value of the switchList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSwitch }{@code >}
     *
     */
    public JAXBElement<ArrayOfSwitch> getSwitchList() {
        return switchList;
    }

    /**
     * Sets the value of the switchList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSwitch }{@code >}
     *
     */
    public void setSwitchList(JAXBElement<ArrayOfSwitch> value) {
        this.switchList = value;
    }

    /**
     * Gets the value of the ttaRemarks property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getTTARemarks() {
        return ttaRemarks;
    }

    /**
     * Sets the value of the ttaRemarks property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setTTARemarks(JAXBElement<ArrayOfstring> value) {
        this.ttaRemarks = value;
    }

    /**
     * Gets the value of the taxCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTaxCode(JAXBElement<String> value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the twoTechInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isTwoTechInd() {
        return twoTechInd;
    }

    /**
     * Sets the value of the twoTechInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setTwoTechInd(Boolean value) {
        this.twoTechInd = value;
    }

    /**
     * Gets the value of the wireCenter property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link WireCenterT }{@code >}
     *
     */
    public JAXBElement<WireCenterT> getWireCenter() {
        return wireCenter;
    }

    /**
     * Sets the value of the wireCenter property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link WireCenterT }{@code >}
     *
     */
    public void setWireCenter(JAXBElement<WireCenterT> value) {
        this.wireCenter = value;
    }

    /**
     * Gets the value of the zipCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setZipCode(JAXBElement<String> value) {
        this.zipCode = value;
    }

}
