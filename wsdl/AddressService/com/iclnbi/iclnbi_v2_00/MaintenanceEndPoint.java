
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceEndPoint complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MaintenanceEndPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="MEGLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryVLANID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MACAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCIEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCMLTMPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LowestPriorityDefect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaultAlarmTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaultResetTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceEndPoint", propOrder = {
    "megLevel",
    "primaryVLANID",
    "direction",
    "macAddress",
    "cciEnabled",
    "ccmltmPriority",
    "lowestPriorityDefect",
    "faultAlarmTime",
    "faultResetTime"
})
public class MaintenanceEndPoint
    extends Entity
{

    @XmlElementRef(name = "MEGLevel", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> megLevel;
    @XmlElementRef(name = "PrimaryVLANID", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryVLANID;
    @XmlElementRef(name = "Direction", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direction;
    @XmlElementRef(name = "MACAddress", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> macAddress;
    @XmlElementRef(name = "CCIEnabled", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cciEnabled;
    @XmlElementRef(name = "CCMLTMPriority", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ccmltmPriority;
    @XmlElementRef(name = "LowestPriorityDefect", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lowestPriorityDefect;
    @XmlElementRef(name = "FaultAlarmTime", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faultAlarmTime;
    @XmlElementRef(name = "FaultResetTime", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faultResetTime;

    /**
     * Gets the value of the megLevel property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMEGLevel() {
        return megLevel;
    }

    /**
     * Sets the value of the megLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMEGLevel(JAXBElement<String> value) {
        this.megLevel = value;
    }

    /**
     * Gets the value of the primaryVLANID property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPrimaryVLANID() {
        return primaryVLANID;
    }

    /**
     * Sets the value of the primaryVLANID property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPrimaryVLANID(JAXBElement<String> value) {
        this.primaryVLANID = value;
    }

    /**
     * Gets the value of the direction property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDirection(JAXBElement<String> value) {
        this.direction = value;
    }

    /**
     * Gets the value of the macAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMACAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMACAddress(JAXBElement<String> value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the cciEnabled property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCCIEnabled() {
        return cciEnabled;
    }

    /**
     * Sets the value of the cciEnabled property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCCIEnabled(JAXBElement<String> value) {
        this.cciEnabled = value;
    }

    /**
     * Gets the value of the ccmltmPriority property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCCMLTMPriority() {
        return ccmltmPriority;
    }

    /**
     * Sets the value of the ccmltmPriority property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCCMLTMPriority(JAXBElement<String> value) {
        this.ccmltmPriority = value;
    }

    /**
     * Gets the value of the lowestPriorityDefect property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLowestPriorityDefect() {
        return lowestPriorityDefect;
    }

    /**
     * Sets the value of the lowestPriorityDefect property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLowestPriorityDefect(JAXBElement<String> value) {
        this.lowestPriorityDefect = value;
    }

    /**
     * Gets the value of the faultAlarmTime property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFaultAlarmTime() {
        return faultAlarmTime;
    }

    /**
     * Sets the value of the faultAlarmTime property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFaultAlarmTime(JAXBElement<String> value) {
        this.faultAlarmTime = value;
    }

    /**
     * Gets the value of the faultResetTime property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFaultResetTime() {
        return faultResetTime;
    }

    /**
     * Sets the value of the faultResetTime property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFaultResetTime(JAXBElement<String> value) {
        this.faultResetTime = value;
    }

}
