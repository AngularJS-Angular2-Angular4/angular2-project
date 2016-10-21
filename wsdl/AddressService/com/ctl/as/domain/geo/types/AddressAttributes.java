
package com.ctl.as.domain.geo.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressAttributes complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddressAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CALA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClliCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBulkBilledMdu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsContractedProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFiberPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMdu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LegacyProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NpaNxx" type="{http://geo.domain.as.ctl.com/Types}NpaNxx" minOccurs="0"/>
 *         &lt;element name="RateCenter" type="{http://geo.domain.as.ctl.com/Types}RateCenter" minOccurs="0"/>
 *         &lt;element name="RateZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAddressRoles" type="{http://geo.domain.as.ctl.com/Types}ArrayOfRole" minOccurs="0"/>
 *         &lt;element name="WireCenter" type="{http://geo.domain.as.ctl.com/Types}WireCenter" minOccurs="0"/>
 *         &lt;element name="InTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressAttributes", propOrder = {
    "cala",
    "clliCode",
    "contractType",
    "exchangeCode",
    "isBulkBilledMdu",
    "isContractedProperty",
    "isFiberPresent",
    "isInRegion",
    "isMdu",
    "legacyProvider",
    "npaNxx",
    "rateCenter",
    "rateZone",
    "serviceRestrictionCode",
    "taxCode",
    "serviceAddressRoles",
    "wireCenter",
    "inTown",
    "tta"
})
public class AddressAttributes {

    @XmlElementRef(name = "CALA", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cala;
    @XmlElementRef(name = "ClliCode", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clliCode;
    @XmlElementRef(name = "ContractType", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractType;
    @XmlElementRef(name = "ExchangeCode", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exchangeCode;
    @XmlElementRef(name = "IsBulkBilledMdu", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isBulkBilledMdu;
    @XmlElementRef(name = "IsContractedProperty", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isContractedProperty;
    @XmlElementRef(name = "IsFiberPresent", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isFiberPresent;
    @XmlElementRef(name = "IsInRegion", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isInRegion;
    @XmlElementRef(name = "IsMdu", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isMdu;
    @XmlElementRef(name = "LegacyProvider", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legacyProvider;
    @XmlElementRef(name = "NpaNxx", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<NpaNxx> npaNxx;
    @XmlElementRef(name = "RateCenter", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<RateCenter> rateCenter;
    @XmlElementRef(name = "RateZone", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rateZone;
    @XmlElementRef(name = "ServiceRestrictionCode", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceRestrictionCode;
    @XmlElementRef(name = "TaxCode", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxCode;
    @XmlElementRef(name = "ServiceAddressRoles", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRole> serviceAddressRoles;
    @XmlElementRef(name = "WireCenter", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<WireCenter> wireCenter;
    @XmlElementRef(name = "InTown", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inTown;
    @XmlElementRef(name = "TTA", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tta;

    /**
     * Gets the value of the cala property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCALA() {
        return cala;
    }

    /**
     * Sets the value of the cala property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCALA(JAXBElement<String> value) {
        this.cala = value;
    }

    /**
     * Gets the value of the clliCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getClliCode() {
        return clliCode;
    }

    /**
     * Sets the value of the clliCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setClliCode(JAXBElement<String> value) {
        this.clliCode = value;
    }

    /**
     * Gets the value of the contractType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setContractType(JAXBElement<String> value) {
        this.contractType = value;
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
     * Gets the value of the isBulkBilledMdu property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getIsBulkBilledMdu() {
        return isBulkBilledMdu;
    }

    /**
     * Sets the value of the isBulkBilledMdu property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setIsBulkBilledMdu(JAXBElement<Boolean> value) {
        this.isBulkBilledMdu = value;
    }

    /**
     * Gets the value of the isContractedProperty property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getIsContractedProperty() {
        return isContractedProperty;
    }

    /**
     * Sets the value of the isContractedProperty property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setIsContractedProperty(JAXBElement<Boolean> value) {
        this.isContractedProperty = value;
    }

    /**
     * Gets the value of the isFiberPresent property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getIsFiberPresent() {
        return isFiberPresent;
    }

    /**
     * Sets the value of the isFiberPresent property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setIsFiberPresent(JAXBElement<Boolean> value) {
        this.isFiberPresent = value;
    }

    /**
     * Gets the value of the isInRegion property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getIsInRegion() {
        return isInRegion;
    }

    /**
     * Sets the value of the isInRegion property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setIsInRegion(JAXBElement<Boolean> value) {
        this.isInRegion = value;
    }

    /**
     * Gets the value of the isMdu property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getIsMdu() {
        return isMdu;
    }

    /**
     * Sets the value of the isMdu property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setIsMdu(JAXBElement<Boolean> value) {
        this.isMdu = value;
    }

    /**
     * Gets the value of the legacyProvider property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLegacyProvider() {
        return legacyProvider;
    }

    /**
     * Sets the value of the legacyProvider property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLegacyProvider(JAXBElement<String> value) {
        this.legacyProvider = value;
    }

    /**
     * Gets the value of the npaNxx property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NpaNxx }{@code >}
     *
     */
    public JAXBElement<NpaNxx> getNpaNxx() {
        return npaNxx;
    }

    /**
     * Sets the value of the npaNxx property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NpaNxx }{@code >}
     *
     */
    public void setNpaNxx(JAXBElement<NpaNxx> value) {
        this.npaNxx = value;
    }

    /**
     * Gets the value of the rateCenter property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RateCenter }{@code >}
     *
     */
    public JAXBElement<RateCenter> getRateCenter() {
        return rateCenter;
    }

    /**
     * Sets the value of the rateCenter property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RateCenter }{@code >}
     *
     */
    public void setRateCenter(JAXBElement<RateCenter> value) {
        this.rateCenter = value;
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
     * Gets the value of the serviceRestrictionCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceRestrictionCode() {
        return serviceRestrictionCode;
    }

    /**
     * Sets the value of the serviceRestrictionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceRestrictionCode(JAXBElement<String> value) {
        this.serviceRestrictionCode = value;
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
     * Gets the value of the serviceAddressRoles property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfRole> getServiceAddressRoles() {
        return serviceAddressRoles;
    }

    /**
     * Sets the value of the serviceAddressRoles property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRole }{@code >}
     *
     */
    public void setServiceAddressRoles(JAXBElement<ArrayOfRole> value) {
        this.serviceAddressRoles = value;
    }

    /**
     * Gets the value of the wireCenter property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link WireCenter }{@code >}
     *
     */
    public JAXBElement<WireCenter> getWireCenter() {
        return wireCenter;
    }

    /**
     * Sets the value of the wireCenter property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link WireCenter }{@code >}
     *
     */
    public void setWireCenter(JAXBElement<WireCenter> value) {
        this.wireCenter = value;
    }

    /**
     * Gets the value of the inTown property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getInTown() {
        return inTown;
    }

    /**
     * Sets the value of the inTown property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setInTown(JAXBElement<String> value) {
        this.inTown = value;
    }

    /**
     * Gets the value of the tta property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTTA() {
        return tta;
    }

    /**
     * Sets the value of the tta property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTTA(JAXBElement<String> value) {
        this.tta = value;
    }

}
