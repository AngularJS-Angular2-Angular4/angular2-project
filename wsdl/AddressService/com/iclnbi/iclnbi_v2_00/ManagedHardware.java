
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedHardware complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ManagedHardware">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Hardware">
 *       &lt;sequence>
 *         &lt;element name="administrativeState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="physicalAlarmReportingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="physicalAlarmStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coolingRequirements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hardwarePurpose" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedHardware", propOrder = {
    "administrativeState",
    "physicalAlarmReportingEnabled",
    "physicalAlarmStatus",
    "coolingRequirements",
    "hardwarePurpose"
})
@XmlSeeAlso({
    PhysicalContainer.class,
    PhysicalPort.class
})
public class ManagedHardware
    extends Hardware
{

    protected Integer administrativeState;
    protected Boolean physicalAlarmReportingEnabled;
    protected Integer physicalAlarmStatus;
    @XmlElementRef(name = "coolingRequirements", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coolingRequirements;
    protected Integer hardwarePurpose;

    /**
     * Gets the value of the administrativeState property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getAdministrativeState() {
        return administrativeState;
    }

    /**
     * Sets the value of the administrativeState property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setAdministrativeState(Integer value) {
        this.administrativeState = value;
    }

    /**
     * Gets the value of the physicalAlarmReportingEnabled property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPhysicalAlarmReportingEnabled() {
        return physicalAlarmReportingEnabled;
    }

    /**
     * Sets the value of the physicalAlarmReportingEnabled property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPhysicalAlarmReportingEnabled(Boolean value) {
        this.physicalAlarmReportingEnabled = value;
    }

    /**
     * Gets the value of the physicalAlarmStatus property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPhysicalAlarmStatus() {
        return physicalAlarmStatus;
    }

    /**
     * Sets the value of the physicalAlarmStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPhysicalAlarmStatus(Integer value) {
        this.physicalAlarmStatus = value;
    }

    /**
     * Gets the value of the coolingRequirements property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCoolingRequirements() {
        return coolingRequirements;
    }

    /**
     * Sets the value of the coolingRequirements property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCoolingRequirements(JAXBElement<String> value) {
        this.coolingRequirements = value;
    }

    /**
     * Gets the value of the hardwarePurpose property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getHardwarePurpose() {
        return hardwarePurpose;
    }

    /**
     * Sets the value of the hardwarePurpose property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setHardwarePurpose(Integer value) {
        this.hardwarePurpose = value;
    }

}
