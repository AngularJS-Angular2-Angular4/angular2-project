
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Service complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="isServiceEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasStarted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="startMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isStateful" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="aliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aliasName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfRemarks" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_partyRole2" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PartyRole" minOccurs="0"/>
 *         &lt;element name="ServiceHostedOn" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPhysicalResourceRole" minOccurs="0"/>
 *         &lt;element name="LocalPartyContact" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPartyRole" minOccurs="0"/>
 *         &lt;element name="ServiceRunBy" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfLogicalResourceRole" minOccurs="0"/>
 *         &lt;element name="lrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceDescribedBy" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfServiceCharacteristicValue" minOccurs="0"/>
 *         &lt;element name="ServiceRelationship" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfServiceRelationship" minOccurs="0"/>
 *         &lt;element name="OwnsServiceDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}OwnsServiceDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "isServiceEnabled",
    "hasStarted",
    "isMandatory",
    "startMode",
    "isStateful",
    "aliasName",
    "aliasName2",
    "creationDate",
    "modificationDate",
    "functionalStatus",
    "remarks",
    "serviceType",
    "serviceSubType",
    "action",
    "partyRole2",
    "serviceHostedOn",
    "localPartyContact",
    "serviceRunBy",
    "lrStatus",
    "serviceDescribedBy",
    "serviceRelationship",
    "ownsServiceDetails"
})
@XmlSeeAlso({
    ResourceFacingService.class
})
public class Service
    extends RootEntity
{

    protected Boolean isServiceEnabled;
    protected Boolean hasStarted;
    protected Boolean isMandatory;
    protected Integer startMode;
    protected Boolean isStateful;
    @XmlElementRef(name = "aliasName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasName;
    @XmlElementRef(name = "aliasName2", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasName2;
    @XmlElementRef(name = "CreationDate", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creationDate;
    @XmlElementRef(name = "ModificationDate", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modificationDate;
    @XmlElementRef(name = "functionalStatus", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> functionalStatus;
    @XmlElementRef(name = "Remarks", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemarks> remarks;
    @XmlElementRef(name = "serviceType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceType;
    @XmlElementRef(name = "serviceSubType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceSubType;
    @XmlElementRef(name = "action", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "_partyRole2", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PartyRole> partyRole2;
    @XmlElementRef(name = "ServiceHostedOn", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhysicalResourceRole> serviceHostedOn;
    @XmlElementRef(name = "LocalPartyContact", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPartyRole> localPartyContact;
    @XmlElementRef(name = "ServiceRunBy", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLogicalResourceRole> serviceRunBy;
    @XmlElementRef(name = "lrStatus", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lrStatus;
    @XmlElementRef(name = "ServiceDescribedBy", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceCharacteristicValue> serviceDescribedBy;
    @XmlElementRef(name = "ServiceRelationship", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceRelationship> serviceRelationship;
    @XmlElementRef(name = "OwnsServiceDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<OwnsServiceDetails> ownsServiceDetails;

    /**
     * Gets the value of the isServiceEnabled property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsServiceEnabled() {
        return isServiceEnabled;
    }

    /**
     * Sets the value of the isServiceEnabled property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsServiceEnabled(Boolean value) {
        this.isServiceEnabled = value;
    }

    /**
     * Gets the value of the hasStarted property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHasStarted() {
        return hasStarted;
    }

    /**
     * Sets the value of the hasStarted property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setHasStarted(Boolean value) {
        this.hasStarted = value;
    }

    /**
     * Gets the value of the isMandatory property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the startMode property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getStartMode() {
        return startMode;
    }

    /**
     * Sets the value of the startMode property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setStartMode(Integer value) {
        this.startMode = value;
    }

    /**
     * Gets the value of the isStateful property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsStateful() {
        return isStateful;
    }

    /**
     * Sets the value of the isStateful property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsStateful(Boolean value) {
        this.isStateful = value;
    }

    /**
     * Gets the value of the aliasName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAliasName() {
        return aliasName;
    }

    /**
     * Sets the value of the aliasName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAliasName(JAXBElement<String> value) {
        this.aliasName = value;
    }

    /**
     * Gets the value of the aliasName2 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAliasName2() {
        return aliasName2;
    }

    /**
     * Sets the value of the aliasName2 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAliasName2(JAXBElement<String> value) {
        this.aliasName2 = value;
    }

    /**
     * Gets the value of the creationDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCreationDate(JAXBElement<String> value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the modificationDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setModificationDate(JAXBElement<String> value) {
        this.modificationDate = value;
    }

    /**
     * Gets the value of the functionalStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFunctionalStatus() {
        return functionalStatus;
    }

    /**
     * Sets the value of the functionalStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFunctionalStatus(JAXBElement<String> value) {
        this.functionalStatus = value;
    }

    /**
     * Gets the value of the remarks property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRemarks }{@code >}
     *
     */
    public JAXBElement<ArrayOfRemarks> getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRemarks }{@code >}
     *
     */
    public void setRemarks(JAXBElement<ArrayOfRemarks> value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the serviceType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceType(JAXBElement<String> value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceSubType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceSubType() {
        return serviceSubType;
    }

    /**
     * Sets the value of the serviceSubType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceSubType(JAXBElement<String> value) {
        this.serviceSubType = value;
    }

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAction(JAXBElement<String> value) {
        this.action = value;
    }

    /**
     * Gets the value of the partyRole2 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PartyRole }{@code >}
     *
     */
    public JAXBElement<PartyRole> getPartyRole2() {
        return partyRole2;
    }

    /**
     * Sets the value of the partyRole2 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PartyRole }{@code >}
     *
     */
    public void setPartyRole2(JAXBElement<PartyRole> value) {
        this.partyRole2 = value;
    }

    /**
     * Gets the value of the serviceHostedOn property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalResourceRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfPhysicalResourceRole> getServiceHostedOn() {
        return serviceHostedOn;
    }

    /**
     * Sets the value of the serviceHostedOn property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalResourceRole }{@code >}
     *
     */
    public void setServiceHostedOn(JAXBElement<ArrayOfPhysicalResourceRole> value) {
        this.serviceHostedOn = value;
    }

    /**
     * Gets the value of the localPartyContact property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPartyRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfPartyRole> getLocalPartyContact() {
        return localPartyContact;
    }

    /**
     * Sets the value of the localPartyContact property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPartyRole }{@code >}
     *
     */
    public void setLocalPartyContact(JAXBElement<ArrayOfPartyRole> value) {
        this.localPartyContact = value;
    }

    /**
     * Gets the value of the serviceRunBy property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLogicalResourceRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfLogicalResourceRole> getServiceRunBy() {
        return serviceRunBy;
    }

    /**
     * Sets the value of the serviceRunBy property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLogicalResourceRole }{@code >}
     *
     */
    public void setServiceRunBy(JAXBElement<ArrayOfLogicalResourceRole> value) {
        this.serviceRunBy = value;
    }

    /**
     * Gets the value of the lrStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLrStatus() {
        return lrStatus;
    }

    /**
     * Sets the value of the lrStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLrStatus(JAXBElement<String> value) {
        this.lrStatus = value;
    }

    /**
     * Gets the value of the serviceDescribedBy property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceCharacteristicValue }{@code >}
     *
     */
    public JAXBElement<ArrayOfServiceCharacteristicValue> getServiceDescribedBy() {
        return serviceDescribedBy;
    }

    /**
     * Sets the value of the serviceDescribedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceCharacteristicValue }{@code >}
     *
     */
    public void setServiceDescribedBy(JAXBElement<ArrayOfServiceCharacteristicValue> value) {
        this.serviceDescribedBy = value;
    }

    /**
     * Gets the value of the serviceRelationship property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceRelationship }{@code >}
     *
     */
    public JAXBElement<ArrayOfServiceRelationship> getServiceRelationship() {
        return serviceRelationship;
    }

    /**
     * Sets the value of the serviceRelationship property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceRelationship }{@code >}
     *
     */
    public void setServiceRelationship(JAXBElement<ArrayOfServiceRelationship> value) {
        this.serviceRelationship = value;
    }

    /**
     * Gets the value of the ownsServiceDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OwnsServiceDetails }{@code >}
     *
     */
    public JAXBElement<OwnsServiceDetails> getOwnsServiceDetails() {
        return ownsServiceDetails;
    }

    /**
     * Sets the value of the ownsServiceDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OwnsServiceDetails }{@code >}
     *
     */
    public void setOwnsServiceDetails(JAXBElement<OwnsServiceDetails> value) {
        this.ownsServiceDetails = value;
    }

}
