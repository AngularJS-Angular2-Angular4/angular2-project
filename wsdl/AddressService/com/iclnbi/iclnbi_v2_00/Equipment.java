
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Equipment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Equipment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PhysicalContainer">
 *       &lt;sequence>
 *         &lt;element name="resourceFulfillmentState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ResourceFulfillmentState" minOccurs="0"/>
 *         &lt;element name="protectionSchemeState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ProtectionSchemeState" minOccurs="0"/>
 *         &lt;element name="protectionRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ProtectionRole" minOccurs="0"/>
 *         &lt;element name="isReportingAlarms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="installedVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installedSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installedPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installedEquipmentObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expectedEquipmentObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expectedEquipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installedEquipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redundancy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="asapRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentInEquipment" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Equipment" minOccurs="0"/>
 *         &lt;element name="supportedBy" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEquipment" minOccurs="0"/>
 *         &lt;element name="supports" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEquipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equipment", propOrder = {
    "resourceFulfillmentState",
    "protectionSchemeState",
    "protectionRole",
    "isReportingAlarms",
    "installedVersion",
    "installedSerialNumber",
    "installedPartNumber",
    "installedEquipmentObjectType",
    "expectedEquipmentObjectType",
    "installStatus",
    "expectedEquipmentType",
    "installedEquipmentType",
    "redundancy",
    "asapRef",
    "equipmentInEquipment",
    "supportedBy",
    "supports"
})
@XmlSeeAlso({
    Card.class
})
public class Equipment
    extends PhysicalContainer
{

    @XmlSchemaType(name = "string")
    protected ResourceFulfillmentState resourceFulfillmentState;
    @XmlSchemaType(name = "string")
    protected ProtectionSchemeState protectionSchemeState;
    @XmlSchemaType(name = "string")
    protected ProtectionRole protectionRole;
    protected Boolean isReportingAlarms;
    @XmlElementRef(name = "installedVersion", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installedVersion;
    @XmlElementRef(name = "installedSerialNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installedSerialNumber;
    @XmlElementRef(name = "installedPartNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installedPartNumber;
    @XmlElementRef(name = "installedEquipmentObjectType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installedEquipmentObjectType;
    @XmlElementRef(name = "expectedEquipmentObjectType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expectedEquipmentObjectType;
    protected Integer installStatus;
    @XmlElementRef(name = "expectedEquipmentType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expectedEquipmentType;
    @XmlElementRef(name = "installedEquipmentType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installedEquipmentType;
    protected Integer redundancy;
    @XmlElementRef(name = "asapRef", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asapRef;
    @XmlElementRef(name = "EquipmentInEquipment", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Equipment> equipmentInEquipment;
    @XmlElementRef(name = "supportedBy", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipment> supportedBy;
    @XmlElementRef(name = "supports", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipment> supports;

    /**
     * Gets the value of the resourceFulfillmentState property.
     *
     * @return
     *     possible object is
     *     {@link ResourceFulfillmentState }
     *
     */
    public ResourceFulfillmentState getResourceFulfillmentState() {
        return resourceFulfillmentState;
    }

    /**
     * Sets the value of the resourceFulfillmentState property.
     *
     * @param value
     *     allowed object is
     *     {@link ResourceFulfillmentState }
     *
     */
    public void setResourceFulfillmentState(ResourceFulfillmentState value) {
        this.resourceFulfillmentState = value;
    }

    /**
     * Gets the value of the protectionSchemeState property.
     *
     * @return
     *     possible object is
     *     {@link ProtectionSchemeState }
     *
     */
    public ProtectionSchemeState getProtectionSchemeState() {
        return protectionSchemeState;
    }

    /**
     * Sets the value of the protectionSchemeState property.
     *
     * @param value
     *     allowed object is
     *     {@link ProtectionSchemeState }
     *
     */
    public void setProtectionSchemeState(ProtectionSchemeState value) {
        this.protectionSchemeState = value;
    }

    /**
     * Gets the value of the protectionRole property.
     *
     * @return
     *     possible object is
     *     {@link ProtectionRole }
     *
     */
    public ProtectionRole getProtectionRole() {
        return protectionRole;
    }

    /**
     * Sets the value of the protectionRole property.
     *
     * @param value
     *     allowed object is
     *     {@link ProtectionRole }
     *
     */
    public void setProtectionRole(ProtectionRole value) {
        this.protectionRole = value;
    }

    /**
     * Gets the value of the isReportingAlarms property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsReportingAlarms() {
        return isReportingAlarms;
    }

    /**
     * Sets the value of the isReportingAlarms property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsReportingAlarms(Boolean value) {
        this.isReportingAlarms = value;
    }

    /**
     * Gets the value of the installedVersion property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getInstalledVersion() {
        return installedVersion;
    }

    /**
     * Sets the value of the installedVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setInstalledVersion(JAXBElement<String> value) {
        this.installedVersion = value;
    }

    /**
     * Gets the value of the installedSerialNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getInstalledSerialNumber() {
        return installedSerialNumber;
    }

    /**
     * Sets the value of the installedSerialNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setInstalledSerialNumber(JAXBElement<String> value) {
        this.installedSerialNumber = value;
    }

    /**
     * Gets the value of the installedPartNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getInstalledPartNumber() {
        return installedPartNumber;
    }

    /**
     * Sets the value of the installedPartNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setInstalledPartNumber(JAXBElement<String> value) {
        this.installedPartNumber = value;
    }

    /**
     * Gets the value of the installedEquipmentObjectType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getInstalledEquipmentObjectType() {
        return installedEquipmentObjectType;
    }

    /**
     * Sets the value of the installedEquipmentObjectType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setInstalledEquipmentObjectType(JAXBElement<String> value) {
        this.installedEquipmentObjectType = value;
    }

    /**
     * Gets the value of the expectedEquipmentObjectType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getExpectedEquipmentObjectType() {
        return expectedEquipmentObjectType;
    }

    /**
     * Sets the value of the expectedEquipmentObjectType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setExpectedEquipmentObjectType(JAXBElement<String> value) {
        this.expectedEquipmentObjectType = value;
    }

    /**
     * Gets the value of the installStatus property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getInstallStatus() {
        return installStatus;
    }

    /**
     * Sets the value of the installStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setInstallStatus(Integer value) {
        this.installStatus = value;
    }

    /**
     * Gets the value of the expectedEquipmentType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getExpectedEquipmentType() {
        return expectedEquipmentType;
    }

    /**
     * Sets the value of the expectedEquipmentType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setExpectedEquipmentType(JAXBElement<String> value) {
        this.expectedEquipmentType = value;
    }

    /**
     * Gets the value of the installedEquipmentType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getInstalledEquipmentType() {
        return installedEquipmentType;
    }

    /**
     * Sets the value of the installedEquipmentType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setInstalledEquipmentType(JAXBElement<String> value) {
        this.installedEquipmentType = value;
    }

    /**
     * Gets the value of the redundancy property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRedundancy() {
        return redundancy;
    }

    /**
     * Sets the value of the redundancy property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setRedundancy(Integer value) {
        this.redundancy = value;
    }

    /**
     * Gets the value of the asapRef property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAsapRef() {
        return asapRef;
    }

    /**
     * Sets the value of the asapRef property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAsapRef(JAXBElement<String> value) {
        this.asapRef = value;
    }

    /**
     * Gets the value of the equipmentInEquipment property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.iclnbi.iclnbi_v2_00.Equipment }{@code >}
     *
     */
    public JAXBElement<Equipment> getEquipmentInEquipment() {
        return equipmentInEquipment;
    }

    /**
     * Sets the value of the equipmentInEquipment property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.iclnbi.iclnbi_v2_00.Equipment }{@code >}
     *
     */
    public void setEquipmentInEquipment(JAXBElement<Equipment> value) {
        this.equipmentInEquipment = value;
    }

    /**
     * Gets the value of the supportedBy property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEquipment }{@code >}
     *
     */
    public JAXBElement<ArrayOfEquipment> getSupportedBy() {
        return supportedBy;
    }

    /**
     * Sets the value of the supportedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEquipment }{@code >}
     *
     */
    public void setSupportedBy(JAXBElement<ArrayOfEquipment> value) {
        this.supportedBy = value;
    }

    /**
     * Gets the value of the supports property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEquipment }{@code >}
     *
     */
    public JAXBElement<ArrayOfEquipment> getSupports() {
        return supports;
    }

    /**
     * Sets the value of the supports property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEquipment }{@code >}
     *
     */
    public void setSupports(JAXBElement<ArrayOfEquipment> value) {
        this.supports = value;
    }

}
