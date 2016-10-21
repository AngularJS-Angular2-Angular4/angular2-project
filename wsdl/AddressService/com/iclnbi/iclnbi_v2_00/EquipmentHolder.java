
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentHolder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EquipmentHolder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PhysicalContainer">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}HolderState" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isReportingAlarms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expectedOrInstalledEquipmentRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asapRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acceptableEquipmentTypeList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acceptableEquipmentList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfHolder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isSolitaryHolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="holderStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoldsHardware" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfHardware" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEquipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentHolder", propOrder = {
    "type",
    "state",
    "location",
    "isReportingAlarms",
    "expectedOrInstalledEquipmentRef",
    "asapRef",
    "acceptableEquipmentTypeList",
    "acceptableEquipmentList",
    "typeOfHolder",
    "isSolitaryHolder",
    "holderStatus",
    "holdsHardware",
    "equipment"
})
@XmlSeeAlso({
    HolderComposite.class,
    HolderAtomic.class
})
public class EquipmentHolder
    extends PhysicalContainer
{

    @XmlElementRef(name = "type", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlSchemaType(name = "string")
    protected HolderState state;
    @XmlElementRef(name = "location", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    protected Boolean isReportingAlarms;
    @XmlElementRef(name = "expectedOrInstalledEquipmentRef", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expectedOrInstalledEquipmentRef;
    @XmlElementRef(name = "asapRef", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asapRef;
    @XmlElementRef(name = "acceptableEquipmentTypeList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acceptableEquipmentTypeList;
    @XmlElementRef(name = "acceptableEquipmentList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acceptableEquipmentList;
    protected Integer typeOfHolder;
    protected Boolean isSolitaryHolder;
    protected Integer holderStatus;
    @XmlElementRef(name = "HoldsHardware", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHardware> holdsHardware;
    @XmlElementRef(name = "Equipment", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipment> equipment;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link HolderState }
     *
     */
    public HolderState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link HolderState }
     *
     */
    public void setState(HolderState value) {
        this.state = value;
    }

    /**
     * Gets the value of the location property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
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
     * Gets the value of the expectedOrInstalledEquipmentRef property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getExpectedOrInstalledEquipmentRef() {
        return expectedOrInstalledEquipmentRef;
    }

    /**
     * Sets the value of the expectedOrInstalledEquipmentRef property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setExpectedOrInstalledEquipmentRef(JAXBElement<String> value) {
        this.expectedOrInstalledEquipmentRef = value;
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
     * Gets the value of the acceptableEquipmentTypeList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAcceptableEquipmentTypeList() {
        return acceptableEquipmentTypeList;
    }

    /**
     * Sets the value of the acceptableEquipmentTypeList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAcceptableEquipmentTypeList(JAXBElement<String> value) {
        this.acceptableEquipmentTypeList = value;
    }

    /**
     * Gets the value of the acceptableEquipmentList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAcceptableEquipmentList() {
        return acceptableEquipmentList;
    }

    /**
     * Sets the value of the acceptableEquipmentList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAcceptableEquipmentList(JAXBElement<String> value) {
        this.acceptableEquipmentList = value;
    }

    /**
     * Gets the value of the typeOfHolder property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeOfHolder() {
        return typeOfHolder;
    }

    /**
     * Sets the value of the typeOfHolder property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeOfHolder(Integer value) {
        this.typeOfHolder = value;
    }

    /**
     * Gets the value of the isSolitaryHolder property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsSolitaryHolder() {
        return isSolitaryHolder;
    }

    /**
     * Sets the value of the isSolitaryHolder property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsSolitaryHolder(Boolean value) {
        this.isSolitaryHolder = value;
    }

    /**
     * Gets the value of the holderStatus property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getHolderStatus() {
        return holderStatus;
    }

    /**
     * Sets the value of the holderStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setHolderStatus(Integer value) {
        this.holderStatus = value;
    }

    /**
     * Gets the value of the holdsHardware property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfHardware }{@code >}
     *
     */
    public JAXBElement<ArrayOfHardware> getHoldsHardware() {
            return holdsHardware;
    }

    /**
     * Sets the value of the holdsHardware property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfHardware }{@code >}
     *
     */
    public void setHoldsHardware(JAXBElement<ArrayOfHardware> value) {
            this.holdsHardware = value;
    }

    /**
     * Gets the value of the equipment property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEquipment }{@code >}
     *
     */
    public JAXBElement<ArrayOfEquipment> getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEquipment }{@code >}
     *
     */
    public void setEquipment(JAXBElement<ArrayOfEquipment> value) {
        this.equipment = value;
    }

}
