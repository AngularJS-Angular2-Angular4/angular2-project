
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Card complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Card">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Equipment">
 *       &lt;sequence>
 *         &lt;element name="cardCompatibilityResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daughterCardInstallStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="daughterCardOperatingStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="daughterCardRequirements" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isConfigurablePhysically" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isMotherBoard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isUniquePhysical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxDataWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="slotLayout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slotsRequired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="uniqueRequirementsPhysical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hardwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markedForDeletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhysicalPort" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPhysicalPort" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfIPAddress" minOccurs="0"/>
 *         &lt;element name="CardOnCardDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCardOnCardDetails" minOccurs="0"/>
 *         &lt;element name="AllowableCardOnCardDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCardOnCardDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", propOrder = {
    "cardCompatibilityResults",
    "daughterCardInstallStatus",
    "daughterCardOperatingStatus",
    "daughterCardRequirements",
    "isConfigurablePhysically",
    "isMotherBoard",
    "isUniquePhysical",
    "maxDataWidth",
    "slotLayout",
    "slotsRequired",
    "uniqueRequirementsPhysical",
    "hardwareVersion",
    "markedForDeletion",
    "physicalPort",
    "ipAddress",
    "cardOnCardDetails",
    "allowableCardOnCardDetails"
})
public class Card
    extends Equipment
{

    @XmlElementRef(name = "cardCompatibilityResults", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardCompatibilityResults;
    protected Integer daughterCardInstallStatus;
    protected Integer daughterCardOperatingStatus;
    protected Integer daughterCardRequirements;
    protected Boolean isConfigurablePhysically;
    protected Boolean isMotherBoard;
    protected Boolean isUniquePhysical;
    protected Integer maxDataWidth;
    @XmlElementRef(name = "slotLayout", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> slotLayout;
    protected Integer slotsRequired;
    @XmlElementRef(name = "uniqueRequirementsPhysical", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueRequirementsPhysical;
    @XmlElementRef(name = "hardwareVersion", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hardwareVersion;
    @XmlElementRef(name = "markedForDeletion", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markedForDeletion;
    @XmlElementRef(name = "PhysicalPort", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhysicalPort> physicalPort;
    @XmlElementRef(name = "IPAddress", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfIPAddress> ipAddress;
    @XmlElementRef(name = "CardOnCardDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCardOnCardDetails> cardOnCardDetails;
    @XmlElementRef(name = "AllowableCardOnCardDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCardOnCardDetails> allowableCardOnCardDetails;

    /**
     * Gets the value of the cardCompatibilityResults property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCardCompatibilityResults() {
        return cardCompatibilityResults;
    }

    /**
     * Sets the value of the cardCompatibilityResults property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCardCompatibilityResults(JAXBElement<String> value) {
        this.cardCompatibilityResults = value;
    }

    /**
     * Gets the value of the daughterCardInstallStatus property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDaughterCardInstallStatus() {
        return daughterCardInstallStatus;
    }

    /**
     * Sets the value of the daughterCardInstallStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDaughterCardInstallStatus(Integer value) {
        this.daughterCardInstallStatus = value;
    }

    /**
     * Gets the value of the daughterCardOperatingStatus property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDaughterCardOperatingStatus() {
        return daughterCardOperatingStatus;
    }

    /**
     * Sets the value of the daughterCardOperatingStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDaughterCardOperatingStatus(Integer value) {
        this.daughterCardOperatingStatus = value;
    }

    /**
     * Gets the value of the daughterCardRequirements property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDaughterCardRequirements() {
        return daughterCardRequirements;
    }

    /**
     * Sets the value of the daughterCardRequirements property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDaughterCardRequirements(Integer value) {
        this.daughterCardRequirements = value;
    }

    /**
     * Gets the value of the isConfigurablePhysically property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsConfigurablePhysically() {
        return isConfigurablePhysically;
    }

    /**
     * Sets the value of the isConfigurablePhysically property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsConfigurablePhysically(Boolean value) {
        this.isConfigurablePhysically = value;
    }

    /**
     * Gets the value of the isMotherBoard property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsMotherBoard() {
        return isMotherBoard;
    }

    /**
     * Sets the value of the isMotherBoard property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsMotherBoard(Boolean value) {
        this.isMotherBoard = value;
    }

    /**
     * Gets the value of the isUniquePhysical property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsUniquePhysical() {
        return isUniquePhysical;
    }

    /**
     * Sets the value of the isUniquePhysical property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsUniquePhysical(Boolean value) {
        this.isUniquePhysical = value;
    }

    /**
     * Gets the value of the maxDataWidth property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxDataWidth() {
        return maxDataWidth;
    }

    /**
     * Sets the value of the maxDataWidth property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMaxDataWidth(Integer value) {
        this.maxDataWidth = value;
    }

    /**
     * Gets the value of the slotLayout property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSlotLayout() {
        return slotLayout;
    }

    /**
     * Sets the value of the slotLayout property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSlotLayout(JAXBElement<String> value) {
        this.slotLayout = value;
    }

    /**
     * Gets the value of the slotsRequired property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSlotsRequired() {
        return slotsRequired;
    }

    /**
     * Sets the value of the slotsRequired property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSlotsRequired(Integer value) {
        this.slotsRequired = value;
    }

    /**
     * Gets the value of the uniqueRequirementsPhysical property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getUniqueRequirementsPhysical() {
        return uniqueRequirementsPhysical;
    }

    /**
     * Sets the value of the uniqueRequirementsPhysical property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setUniqueRequirementsPhysical(JAXBElement<String> value) {
        this.uniqueRequirementsPhysical = value;
    }

    /**
     * Gets the value of the hardwareVersion property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getHardwareVersion() {
        return hardwareVersion;
    }

    /**
     * Sets the value of the hardwareVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setHardwareVersion(JAXBElement<String> value) {
        this.hardwareVersion = value;
    }

    /**
     * Gets the value of the markedForDeletion property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMarkedForDeletion() {
        return markedForDeletion;
    }

    /**
     * Sets the value of the markedForDeletion property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMarkedForDeletion(JAXBElement<String> value) {
        this.markedForDeletion = value;
    }

    /**
     * Gets the value of the physicalPort property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalPort }{@code >}
     *
     */
    public JAXBElement<ArrayOfPhysicalPort> getPhysicalPort() {
        return physicalPort;
    }

    /**
     * Sets the value of the physicalPort property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalPort }{@code >}
     *
     */
    public void setPhysicalPort(JAXBElement<ArrayOfPhysicalPort> value) {
        this.physicalPort = value;
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
     * Gets the value of the cardOnCardDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCardOnCardDetails }{@code >}
     *
     */
    public JAXBElement<ArrayOfCardOnCardDetails> getCardOnCardDetails() {
        return cardOnCardDetails;
    }

    /**
     * Sets the value of the cardOnCardDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCardOnCardDetails }{@code >}
     *
     */
    public void setCardOnCardDetails(JAXBElement<ArrayOfCardOnCardDetails> value) {
        this.cardOnCardDetails = value;
    }

    /**
     * Gets the value of the allowableCardOnCardDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCardOnCardDetails }{@code >}
     *
     */
    public JAXBElement<ArrayOfCardOnCardDetails> getAllowableCardOnCardDetails() {
        return allowableCardOnCardDetails;
    }

    /**
     * Sets the value of the allowableCardOnCardDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCardOnCardDetails }{@code >}
     *
     */
    public void setAllowableCardOnCardDetails(JAXBElement<ArrayOfCardOnCardDetails> value) {
        this.allowableCardOnCardDetails = value;
    }

}
