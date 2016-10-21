
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for Resource complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Resource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ManagedEntity">
 *       &lt;sequence>
 *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aliasName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usageState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLLICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationCLLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HECIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TimePeriod" minOccurs="0"/>
 *         &lt;element name="ResourcesInManagementDomain" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfManagementDomain" minOccurs="0"/>
 *         &lt;element name="RFServiceConfiguredUsing" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResourceFacingService" minOccurs="0"/>
 *         &lt;element name="ResourceTakesOnRoles" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResourceRole" minOccurs="0"/>
 *         &lt;element name="ResourceDescribedBy" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResourceCharacteristicValue" minOccurs="0"/>
 *         &lt;element name="OwnsResourceDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}OwnsResourceDetails" minOccurs="0"/>
 *         &lt;element name="ResourceRelationship" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResourceRelationship" minOccurs="0"/>
 *         &lt;element name="AdministerResourceDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfAdministerResourceDetails" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AffectedServiceTypeList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "additionalInfo",
    "aliasName",
    "aliasName2",
    "usageState",
    "functionalStatus",
    "clliCode",
    "locationCLLI",
    "hecig",
    "mco",
    "resourceType",
    "resourceSubType",
    "action",
    "validFor",
    "resourcesInManagementDomain",
    "rfServiceConfiguredUsing",
    "resourceTakesOnRoles",
    "resourceDescribedBy",
    "ownsResourceDetails",
    "resourceRelationship",
    "administerResourceDetails",
    "creationDate",
    "modificationDate",
    "affectedServiceTypeList"
})
@XmlSeeAlso({
    Network.class,
    LogicalResource.class,
    PhysicalResource.class
})
public class Resource
    extends ManagedEntity
{

    @XmlElementRef(name = "additionalInfo", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalInfo;
    @XmlElementRef(name = "aliasName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasName;
    @XmlElementRef(name = "aliasName2", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasName2;
    @XmlElementRef(name = "usageState", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usageState;
    @XmlElementRef(name = "functionalStatus", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> functionalStatus;
    @XmlElementRef(name = "CLLICode", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clliCode;
    @XmlElementRef(name = "locationCLLI", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationCLLI;
    @XmlElementRef(name = "HECIG", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hecig;
    @XmlElementRef(name = "MCO", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mco;
    @XmlElementRef(name = "ResourceType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceType;
    @XmlElementRef(name = "ResourceSubType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceSubType;
    @XmlElementRef(name = "action", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "validFor", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TimePeriod> validFor;
    @XmlElementRef(name = "ResourcesInManagementDomain", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfManagementDomain> resourcesInManagementDomain;
    @XmlElementRef(name = "RFServiceConfiguredUsing", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceFacingService> rfServiceConfiguredUsing;
    @XmlElementRef(name = "ResourceTakesOnRoles", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceRole> resourceTakesOnRoles;
    @XmlElementRef(name = "ResourceDescribedBy", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceCharacteristicValue> resourceDescribedBy;
    @XmlElementRef(name = "OwnsResourceDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<OwnsResourceDetails> ownsResourceDetails;
    @XmlElementRef(name = "ResourceRelationship", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceRelationship> resourceRelationship;
    @XmlElementRef(name = "AdministerResourceDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAdministerResourceDetails> administerResourceDetails;
    @XmlElementRef(name = "CreationDate", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creationDate;
    @XmlElementRef(name = "ModificationDate", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modificationDate;
    @XmlElementRef(name = "AffectedServiceTypeList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> affectedServiceTypeList;

    /**
     * Gets the value of the additionalInfo property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAdditionalInfo(JAXBElement<String> value) {
        this.additionalInfo = value;
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
     * Gets the value of the usageState property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getUsageState() {
        return usageState;
    }

    /**
     * Sets the value of the usageState property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setUsageState(JAXBElement<String> value) {
        this.usageState = value;
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
     * Gets the value of the clliCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCLLICode() {
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
    public void setCLLICode(JAXBElement<String> value) {
        this.clliCode = value;
    }

    /**
     * Gets the value of the locationCLLI property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLocationCLLI() {
        return locationCLLI;
    }

    /**
     * Sets the value of the locationCLLI property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLocationCLLI(JAXBElement<String> value) {
        this.locationCLLI = value;
    }

    /**
     * Gets the value of the hecig property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getHECIG() {
        return hecig;
    }

    /**
     * Sets the value of the hecig property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setHECIG(JAXBElement<String> value) {
        this.hecig = value;
    }

    /**
     * Gets the value of the mco property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMCO() {
        return mco;
    }

    /**
     * Sets the value of the mco property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMCO(JAXBElement<String> value) {
        this.mco = value;
    }

    /**
     * Gets the value of the resourceType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setResourceType(JAXBElement<String> value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the resourceSubType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getResourceSubType() {
        return resourceSubType;
    }

    /**
     * Sets the value of the resourceSubType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setResourceSubType(JAXBElement<String> value) {
        this.resourceSubType = value;
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
     * Gets the value of the validFor property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TimePeriod }{@code >}
     *
     */
    public JAXBElement<TimePeriod> getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TimePeriod }{@code >}
     *
     */
    public void setValidFor(JAXBElement<TimePeriod> value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the resourcesInManagementDomain property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfManagementDomain }{@code >}
     *
     */
    public JAXBElement<ArrayOfManagementDomain> getResourcesInManagementDomain() {
        return resourcesInManagementDomain;
    }

    /**
     * Sets the value of the resourcesInManagementDomain property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfManagementDomain }{@code >}
     *
     */
    public void setResourcesInManagementDomain(JAXBElement<ArrayOfManagementDomain> value) {
        this.resourcesInManagementDomain = value;
    }

    /**
     * Gets the value of the rfServiceConfiguredUsing property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceFacingService }{@code >}
     *
     */
    public JAXBElement<ArrayOfResourceFacingService> getRFServiceConfiguredUsing() {
        return rfServiceConfiguredUsing;
    }

    /**
     * Sets the value of the rfServiceConfiguredUsing property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceFacingService }{@code >}
     *
     */
    public void setRFServiceConfiguredUsing(JAXBElement<ArrayOfResourceFacingService> value) {
        this.rfServiceConfiguredUsing = value;
    }

    /**
     * Gets the value of the resourceTakesOnRoles property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfResourceRole> getResourceTakesOnRoles() {
        return resourceTakesOnRoles;
    }

    /**
     * Sets the value of the resourceTakesOnRoles property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceRole }{@code >}
     *
     */
    public void setResourceTakesOnRoles(JAXBElement<ArrayOfResourceRole> value) {
        this.resourceTakesOnRoles = value;
    }

    /**
     * Gets the value of the resourceDescribedBy property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceCharacteristicValue }{@code >}
     *
     */
    public JAXBElement<ArrayOfResourceCharacteristicValue> getResourceDescribedBy() {
        return resourceDescribedBy;
    }

    /**
     * Sets the value of the resourceDescribedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceCharacteristicValue }{@code >}
     *
     */
    public void setResourceDescribedBy(JAXBElement<ArrayOfResourceCharacteristicValue> value) {
        this.resourceDescribedBy = value;
    }

    /**
     * Gets the value of the ownsResourceDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OwnsResourceDetails }{@code >}
     *
     */
    public JAXBElement<OwnsResourceDetails> getOwnsResourceDetails() {
        return ownsResourceDetails;
    }

    /**
     * Sets the value of the ownsResourceDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OwnsResourceDetails }{@code >}
     *
     */
    public void setOwnsResourceDetails(JAXBElement<OwnsResourceDetails> value) {
        this.ownsResourceDetails = value;
    }

    /**
     * Gets the value of the resourceRelationship property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceRelationship }{@code >}
     *
     */
    public JAXBElement<ArrayOfResourceRelationship> getResourceRelationship() {
        return resourceRelationship;
    }

    /**
     * Sets the value of the resourceRelationship property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceRelationship }{@code >}
     *
     */
    public void setResourceRelationship(JAXBElement<ArrayOfResourceRelationship> value) {
        this.resourceRelationship = value;
    }

    /**
     * Gets the value of the administerResourceDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAdministerResourceDetails }{@code >}
     *
     */
    public JAXBElement<ArrayOfAdministerResourceDetails> getAdministerResourceDetails() {
        return administerResourceDetails;
    }

    /**
     * Sets the value of the administerResourceDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAdministerResourceDetails }{@code >}
     *
     */
    public void setAdministerResourceDetails(JAXBElement<ArrayOfAdministerResourceDetails> value) {
        this.administerResourceDetails = value;
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
     * Gets the value of the affectedServiceTypeList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getAffectedServiceTypeList() {
        return affectedServiceTypeList;
    }

    /**
     * Sets the value of the affectedServiceTypeList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setAffectedServiceTypeList(JAXBElement<ArrayOfstring> value) {
        this.affectedServiceTypeList = value;
    }

}
