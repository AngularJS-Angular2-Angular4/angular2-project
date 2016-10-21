
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalResource complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PhysicalResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Resource">
 *       &lt;sequence>
 *         &lt;element name="manufactureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="powerState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorPartName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceProvidesLocalPlaces" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfLocalPlace" minOccurs="0"/>
 *         &lt;element name="PhysicalResourceInNetwork" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfNetwork" minOccurs="0"/>
 *         &lt;element name="InstalledAtAddress" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}AmericanPropertyAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalResource", propOrder = {
    "manufactureDate",
    "otherIdentifier",
    "powerState",
    "serialNumber",
    "versionNumber",
    "manufacturer",
    "prStatus",
    "model",
    "vendor",
    "vendorPartName",
    "resourceProvidesLocalPlaces",
    "physicalResourceInNetwork",
    "installedAtAddress"
})
@XmlSeeAlso({
    PhysicalDevice.class,
    Hardware.class
})
public class PhysicalResource
    extends Resource
{

    @XmlElementRef(name = "manufactureDate", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufactureDate;
    @XmlElementRef(name = "otherIdentifier", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherIdentifier;
    protected Integer powerState;
    @XmlElementRef(name = "serialNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialNumber;
    @XmlElementRef(name = "versionNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> versionNumber;
    @XmlElementRef(name = "manufacturer", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufacturer;
    @XmlElementRef(name = "prStatus", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prStatus;
    @XmlElementRef(name = "model", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "vendor", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendor;
    @XmlElementRef(name = "vendorPartName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorPartName;
    @XmlElementRef(name = "ResourceProvidesLocalPlaces", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocalPlace> resourceProvidesLocalPlaces;
    @XmlElementRef(name = "PhysicalResourceInNetwork", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetwork> physicalResourceInNetwork;
    @XmlElementRef(name = "InstalledAtAddress", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<AmericanPropertyAddress> installedAtAddress;

    /**
     * Gets the value of the manufactureDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setManufactureDate(JAXBElement<String> value) {
        this.manufactureDate = value;
    }

    /**
     * Gets the value of the otherIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOtherIdentifier() {
        return otherIdentifier;
    }

    /**
     * Sets the value of the otherIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOtherIdentifier(JAXBElement<String> value) {
        this.otherIdentifier = value;
    }

    /**
     * Gets the value of the powerState property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPowerState() {
        return powerState;
    }

    /**
     * Sets the value of the powerState property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPowerState(Integer value) {
        this.powerState = value;
    }

    /**
     * Gets the value of the serialNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSerialNumber(JAXBElement<String> value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the versionNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setVersionNumber(JAXBElement<String> value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the manufacturer property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setManufacturer(JAXBElement<String> value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the prStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPrStatus() {
        return prStatus;
    }

    /**
     * Sets the value of the prStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPrStatus(JAXBElement<String> value) {
        this.prStatus = value;
    }

    /**
     * Gets the value of the model property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * Gets the value of the vendor property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVendor(JAXBElement<String> value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the vendorPartName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVendorPartName() {
        return vendorPartName;
    }

    /**
     * Sets the value of the vendorPartName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVendorPartName(JAXBElement<String> value) {
        this.vendorPartName = value;
    }

    /**
     * Gets the value of the resourceProvidesLocalPlaces property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLocalPlace }{@code >}
     *
     */
    public JAXBElement<ArrayOfLocalPlace> getResourceProvidesLocalPlaces() {
        return resourceProvidesLocalPlaces;
    }

    /**
     * Sets the value of the resourceProvidesLocalPlaces property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLocalPlace }{@code >}
     *
     */
    public void setResourceProvidesLocalPlaces(JAXBElement<ArrayOfLocalPlace> value) {
        this.resourceProvidesLocalPlaces = value;
    }

    /**
     * Gets the value of the physicalResourceInNetwork property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfNetwork }{@code >}
     *
     */
    public JAXBElement<ArrayOfNetwork> getPhysicalResourceInNetwork() {
        return physicalResourceInNetwork;
    }

    /**
     * Sets the value of the physicalResourceInNetwork property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfNetwork }{@code >}
     *
     */
    public void setPhysicalResourceInNetwork(JAXBElement<ArrayOfNetwork> value) {
        this.physicalResourceInNetwork = value;
    }

    /**
     * Gets the value of the installedAtAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AmericanPropertyAddress }{@code >}
     *
     */
    public JAXBElement<AmericanPropertyAddress> getInstalledAtAddress() {
        return installedAtAddress;
    }

    /**
     * Sets the value of the installedAtAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AmericanPropertyAddress }{@code >}
     *
     */
    public void setInstalledAtAddress(JAXBElement<AmericanPropertyAddress> value) {
        this.installedAtAddress = value;
    }

}
