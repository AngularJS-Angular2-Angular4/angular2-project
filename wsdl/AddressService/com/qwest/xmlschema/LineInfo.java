
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LineInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectThrough" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectedFacility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DedicatedInsidePlant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisconnectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModularWiringData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResistanceZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineInfo", propOrder = {
    "activityDate",
    "classOfService",
    "connectThrough",
    "connectedFacility",
    "dedicatedInsidePlant",
    "disconnectReason",
    "lineId",
    "modularWiringData",
    "resistanceZone"
})
public class LineInfo {

    @XmlElementRef(name = "ActivityDate", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activityDate;
    @XmlElementRef(name = "ClassOfService", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classOfService;
    @XmlElement(name = "ConnectThrough")
    protected Boolean connectThrough;
    @XmlElement(name = "ConnectedFacility")
    protected Boolean connectedFacility;
    @XmlElement(name = "DedicatedInsidePlant")
    protected Boolean dedicatedInsidePlant;
    @XmlElementRef(name = "DisconnectReason", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disconnectReason;
    @XmlElementRef(name = "LineId", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineId;
    @XmlElementRef(name = "ModularWiringData", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modularWiringData;
    @XmlElementRef(name = "ResistanceZone", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resistanceZone;

    /**
     * Gets the value of the activityDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setActivityDate(JAXBElement<String> value) {
        this.activityDate = value;
    }

    /**
     * Gets the value of the classOfService property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setClassOfService(JAXBElement<String> value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the connectThrough property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isConnectThrough() {
        return connectThrough;
    }

    /**
     * Sets the value of the connectThrough property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setConnectThrough(Boolean value) {
        this.connectThrough = value;
    }

    /**
     * Gets the value of the connectedFacility property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isConnectedFacility() {
        return connectedFacility;
    }

    /**
     * Sets the value of the connectedFacility property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setConnectedFacility(Boolean value) {
        this.connectedFacility = value;
    }

    /**
     * Gets the value of the dedicatedInsidePlant property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDedicatedInsidePlant() {
        return dedicatedInsidePlant;
    }

    /**
     * Sets the value of the dedicatedInsidePlant property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDedicatedInsidePlant(Boolean value) {
        this.dedicatedInsidePlant = value;
    }

    /**
     * Gets the value of the disconnectReason property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDisconnectReason() {
        return disconnectReason;
    }

    /**
     * Sets the value of the disconnectReason property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDisconnectReason(JAXBElement<String> value) {
        this.disconnectReason = value;
    }

    /**
     * Gets the value of the lineId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLineId(JAXBElement<String> value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the modularWiringData property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getModularWiringData() {
        return modularWiringData;
    }

    /**
     * Sets the value of the modularWiringData property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setModularWiringData(JAXBElement<String> value) {
        this.modularWiringData = value;
    }

    /**
     * Gets the value of the resistanceZone property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getResistanceZone() {
        return resistanceZone;
    }

    /**
     * Sets the value of the resistanceZone property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setResistanceZone(JAXBElement<String> value) {
        this.resistanceZone = value;
    }

}
