
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalDevice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PhysicalDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PhysicalResource">
 *       &lt;sequence>
 *         &lt;element name="backplaneIndependent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="backplaneNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="configurationOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isComposite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canMixPower" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EMSName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMSHostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NMSType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NMSHostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNMPObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telnetConnectivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chassisSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsistsOf" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfHardware" minOccurs="0"/>
 *         &lt;element name="HasPhysicalDeviceRoles" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPhysicalDeviceRole" minOccurs="0"/>
 *         &lt;element name="ConsistsOfRack" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfRack" minOccurs="0"/>
 *         &lt;element name="ConsistsOfShelf" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfShelf" minOccurs="0"/>
 *         &lt;element name="HasPorts" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPhysicalPort" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfIPAddress" minOccurs="0"/>
 *         &lt;element name="AllowableSFPDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCardOnCardDetails" minOccurs="0"/>
 *         &lt;element name="AssociatedTopology" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfSubNetworkConnection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalDevice", propOrder = {
    "backplaneIndependent",
    "backplaneNumber",
    "configurationOrder",
    "deviceGroupID",
    "isComposite",
    "canMixPower",
    "emsName",
    "emsHostName",
    "nmsType",
    "nmsHostName",
    "snmpObjectID",
    "telnetConnectivity",
    "chassisSerialNumber",
    "consistsOf",
    "hasPhysicalDeviceRoles",
    "consistsOfRack",
    "consistsOfShelf",
    "hasPorts",
    "ipAddress",
    "allowableSFPDetails",
    "associatedTopology"
})
public class PhysicalDevice
    extends PhysicalResource
{

    protected Boolean backplaneIndependent;
    protected Integer backplaneNumber;
    @XmlElementRef(name = "configurationOrder", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> configurationOrder;
    @XmlElementRef(name = "deviceGroupID", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deviceGroupID;
    protected Boolean isComposite;
    protected Boolean canMixPower;
    @XmlElementRef(name = "EMSName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emsName;
    @XmlElementRef(name = "EMSHostName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emsHostName;
    @XmlElementRef(name = "NMSType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nmsType;
    @XmlElementRef(name = "NMSHostName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nmsHostName;
    @XmlElementRef(name = "SNMPObjectID", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> snmpObjectID;
    @XmlElementRef(name = "telnetConnectivity", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telnetConnectivity;
    @XmlElementRef(name = "chassisSerialNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chassisSerialNumber;
    @XmlElementRef(name = "ConsistsOf", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHardware> consistsOf;
    @XmlElementRef(name = "HasPhysicalDeviceRoles", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhysicalDeviceRole> hasPhysicalDeviceRoles;
    @XmlElementRef(name = "ConsistsOfRack", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRack> consistsOfRack;
    @XmlElementRef(name = "ConsistsOfShelf", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfShelf> consistsOfShelf;
    @XmlElementRef(name = "HasPorts", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhysicalPort> hasPorts;
    @XmlElementRef(name = "IPAddress", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfIPAddress> ipAddress;
    @XmlElementRef(name = "AllowableSFPDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCardOnCardDetails> allowableSFPDetails;
    @XmlElementRef(name = "AssociatedTopology", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubNetworkConnection> associatedTopology;

    /**
     * Gets the value of the backplaneIndependent property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isBackplaneIndependent() {
        return backplaneIndependent;
    }

    /**
     * Sets the value of the backplaneIndependent property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setBackplaneIndependent(Boolean value) {
        this.backplaneIndependent = value;
    }

    /**
     * Gets the value of the backplaneNumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getBackplaneNumber() {
        return backplaneNumber;
    }

    /**
     * Sets the value of the backplaneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setBackplaneNumber(Integer value) {
        this.backplaneNumber = value;
    }

    /**
     * Gets the value of the configurationOrder property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getConfigurationOrder() {
        return configurationOrder;
    }

    /**
     * Sets the value of the configurationOrder property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setConfigurationOrder(JAXBElement<String> value) {
        this.configurationOrder = value;
    }

    /**
     * Gets the value of the deviceGroupID property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDeviceGroupID() {
        return deviceGroupID;
    }

    /**
     * Sets the value of the deviceGroupID property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDeviceGroupID(JAXBElement<String> value) {
        this.deviceGroupID = value;
    }

    /**
     * Gets the value of the isComposite property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsComposite() {
        return isComposite;
    }

    /**
     * Sets the value of the isComposite property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsComposite(Boolean value) {
        this.isComposite = value;
    }

    /**
     * Gets the value of the canMixPower property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCanMixPower() {
        return canMixPower;
    }

    /**
     * Sets the value of the canMixPower property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCanMixPower(Boolean value) {
        this.canMixPower = value;
    }

    /**
     * Gets the value of the emsName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEMSName() {
        return emsName;
    }

    /**
     * Sets the value of the emsName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEMSName(JAXBElement<String> value) {
        this.emsName = value;
    }

    /**
     * Gets the value of the emsHostName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEMSHostName() {
        return emsHostName;
    }

    /**
     * Sets the value of the emsHostName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEMSHostName(JAXBElement<String> value) {
        this.emsHostName = value;
    }

    /**
     * Gets the value of the nmsType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNMSType() {
        return nmsType;
    }

    /**
     * Sets the value of the nmsType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNMSType(JAXBElement<String> value) {
        this.nmsType = value;
    }

    /**
     * Gets the value of the nmsHostName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNMSHostName() {
        return nmsHostName;
    }

    /**
     * Sets the value of the nmsHostName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNMSHostName(JAXBElement<String> value) {
        this.nmsHostName = value;
    }

    /**
     * Gets the value of the snmpObjectID property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSNMPObjectID() {
        return snmpObjectID;
    }

    /**
     * Sets the value of the snmpObjectID property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSNMPObjectID(JAXBElement<String> value) {
        this.snmpObjectID = value;
    }

    /**
     * Gets the value of the telnetConnectivity property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTelnetConnectivity() {
        return telnetConnectivity;
    }

    /**
     * Sets the value of the telnetConnectivity property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTelnetConnectivity(JAXBElement<String> value) {
        this.telnetConnectivity = value;
    }

    /**
     * Gets the value of the chassisSerialNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getChassisSerialNumber() {
        return chassisSerialNumber;
    }

    /**
     * Sets the value of the chassisSerialNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setChassisSerialNumber(JAXBElement<String> value) {
        this.chassisSerialNumber = value;
    }

    /**
     * Gets the value of the consistsOf property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfHardware }{@code >}
     *
     */
    public JAXBElement<ArrayOfHardware> getConsistsOf() {
        return consistsOf;
    }

    /**
     * Sets the value of the consistsOf property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfHardware }{@code >}
     *
     */
    public void setConsistsOf(JAXBElement<ArrayOfHardware> value) {
        this.consistsOf = value;
    }

    /**
     * Gets the value of the hasPhysicalDeviceRoles property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalDeviceRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfPhysicalDeviceRole> getHasPhysicalDeviceRoles() {
        return hasPhysicalDeviceRoles;
    }

    /**
     * Sets the value of the hasPhysicalDeviceRoles property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalDeviceRole }{@code >}
     *
     */
    public void setHasPhysicalDeviceRoles(JAXBElement<ArrayOfPhysicalDeviceRole> value) {
        this.hasPhysicalDeviceRoles = value;
    }

    /**
     * Gets the value of the consistsOfRack property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRack }{@code >}
     *
     */
    public JAXBElement<ArrayOfRack> getConsistsOfRack() {
        return consistsOfRack;
    }

    /**
     * Sets the value of the consistsOfRack property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRack }{@code >}
     *
     */
    public void setConsistsOfRack(JAXBElement<ArrayOfRack> value) {
        this.consistsOfRack = value;
    }

    /**
     * Gets the value of the consistsOfShelf property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfShelf }{@code >}
     *
     */
    public JAXBElement<ArrayOfShelf> getConsistsOfShelf() {
        return consistsOfShelf;
    }

    /**
     * Sets the value of the consistsOfShelf property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfShelf }{@code >}
     *
     */
    public void setConsistsOfShelf(JAXBElement<ArrayOfShelf> value) {
        this.consistsOfShelf = value;
    }

    /**
     * Gets the value of the hasPorts property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalPort }{@code >}
     *
     */
    public JAXBElement<ArrayOfPhysicalPort> getHasPorts() {
        return hasPorts;
    }

    /**
     * Sets the value of the hasPorts property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalPort }{@code >}
     *
     */
    public void setHasPorts(JAXBElement<ArrayOfPhysicalPort> value) {
        this.hasPorts = value;
    }

    /**
     * Gets the value of the ipAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfIPAddress }{@code >}
     *
     */
    public JAXBElement<ArrayOfIPAddress> getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfIPAddress }{@code >}
     *
     */
    public void setIPAddress(JAXBElement<ArrayOfIPAddress> value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the allowableSFPDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCardOnCardDetails }{@code >}
     *
     */
    public JAXBElement<ArrayOfCardOnCardDetails> getAllowableSFPDetails() {
        return allowableSFPDetails;
    }

    /**
     * Sets the value of the allowableSFPDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCardOnCardDetails }{@code >}
     *
     */
    public void setAllowableSFPDetails(JAXBElement<ArrayOfCardOnCardDetails> value) {
        this.allowableSFPDetails = value;
    }

    /**
     * Gets the value of the associatedTopology property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubNetworkConnection }{@code >}
     *
     */
    public JAXBElement<ArrayOfSubNetworkConnection> getAssociatedTopology() {
        return associatedTopology;
    }

    /**
     * Sets the value of the associatedTopology property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubNetworkConnection }{@code >}
     *
     */
    public void setAssociatedTopology(JAXBElement<ArrayOfSubNetworkConnection> value) {
        this.associatedTopology = value;
    }

}
