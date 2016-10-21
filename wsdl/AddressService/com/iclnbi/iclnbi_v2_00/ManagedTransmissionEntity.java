
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedTransmissionEntity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ManagedTransmissionEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="mteAdministrativeState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logicalAlarmReportingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="logicalAlarmStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isMTEOperational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="typeOfMTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="operationalState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedTransmissionEntity", propOrder = {
    "mteAdministrativeState",
    "logicalAlarmReportingEnabled",
    "logicalAlarmStatus",
    "isMTEOperational",
    "typeOfMTE",
    "operationalState"
})
@XmlSeeAlso({
    TerminationPoint.class
})
public class ManagedTransmissionEntity
    extends LogicalResource
{

    @XmlElementRef(name = "mteAdministrativeState", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mteAdministrativeState;
    protected Boolean logicalAlarmReportingEnabled;
    protected Integer logicalAlarmStatus;
    protected Boolean isMTEOperational;
    protected Integer typeOfMTE;
    protected Integer operationalState;

    /**
     * Gets the value of the mteAdministrativeState property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMteAdministrativeState() {
        return mteAdministrativeState;
    }

    /**
     * Sets the value of the mteAdministrativeState property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMteAdministrativeState(JAXBElement<String> value) {
        this.mteAdministrativeState = value;
    }

    /**
     * Gets the value of the logicalAlarmReportingEnabled property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isLogicalAlarmReportingEnabled() {
        return logicalAlarmReportingEnabled;
    }

    /**
     * Sets the value of the logicalAlarmReportingEnabled property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setLogicalAlarmReportingEnabled(Boolean value) {
        this.logicalAlarmReportingEnabled = value;
    }

    /**
     * Gets the value of the logicalAlarmStatus property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getLogicalAlarmStatus() {
        return logicalAlarmStatus;
    }

    /**
     * Sets the value of the logicalAlarmStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setLogicalAlarmStatus(Integer value) {
        this.logicalAlarmStatus = value;
    }

    /**
     * Gets the value of the isMTEOperational property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsMTEOperational() {
        return isMTEOperational;
    }

    /**
     * Sets the value of the isMTEOperational property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsMTEOperational(Boolean value) {
        this.isMTEOperational = value;
    }

    /**
     * Gets the value of the typeOfMTE property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeOfMTE() {
        return typeOfMTE;
    }

    /**
     * Sets the value of the typeOfMTE property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeOfMTE(Integer value) {
        this.typeOfMTE = value;
    }

    /**
     * Gets the value of the operationalState property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getOperationalState() {
        return operationalState;
    }

    /**
     * Sets the value of the operationalState property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setOperationalState(Integer value) {
        this.operationalState = value;
    }

}
