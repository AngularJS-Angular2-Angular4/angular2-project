
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecureHolder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SecureHolder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}HolderComposite">
 *       &lt;sequence>
 *         &lt;element name="audibleAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="audibleAlarmDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="securityBreach" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="securityBreachDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visibleAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="visibleAlarmDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecureHolder", propOrder = {
    "audibleAlarm",
    "audibleAlarmDescription",
    "lockPresent",
    "securityBreach",
    "securityBreachDescription",
    "visibleAlarm",
    "visibleAlarmDescription"
})
@XmlSeeAlso({
    Rack.class
})
public class SecureHolder
    extends HolderComposite
{

    protected Boolean audibleAlarm;
    @XmlElementRef(name = "audibleAlarmDescription", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> audibleAlarmDescription;
    protected Boolean lockPresent;
    protected Integer securityBreach;
    @XmlElementRef(name = "securityBreachDescription", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityBreachDescription;
    protected Boolean visibleAlarm;
    @XmlElementRef(name = "visibleAlarmDescription", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visibleAlarmDescription;

    /**
     * Gets the value of the audibleAlarm property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAudibleAlarm() {
        return audibleAlarm;
    }

    /**
     * Sets the value of the audibleAlarm property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAudibleAlarm(Boolean value) {
        this.audibleAlarm = value;
    }

    /**
     * Gets the value of the audibleAlarmDescription property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAudibleAlarmDescription() {
        return audibleAlarmDescription;
    }

    /**
     * Sets the value of the audibleAlarmDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAudibleAlarmDescription(JAXBElement<String> value) {
        this.audibleAlarmDescription = value;
    }

    /**
     * Gets the value of the lockPresent property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isLockPresent() {
        return lockPresent;
    }

    /**
     * Sets the value of the lockPresent property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setLockPresent(Boolean value) {
        this.lockPresent = value;
    }

    /**
     * Gets the value of the securityBreach property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSecurityBreach() {
        return securityBreach;
    }

    /**
     * Sets the value of the securityBreach property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSecurityBreach(Integer value) {
        this.securityBreach = value;
    }

    /**
     * Gets the value of the securityBreachDescription property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getSecurityBreachDescription() {
        return securityBreachDescription;
    }

    /**
     * Sets the value of the securityBreachDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setSecurityBreachDescription(JAXBElement<String> value) {
        this.securityBreachDescription = value;
    }

    /**
     * Gets the value of the visibleAlarm property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isVisibleAlarm() {
        return visibleAlarm;
    }

    /**
     * Sets the value of the visibleAlarm property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setVisibleAlarm(Boolean value) {
        this.visibleAlarm = value;
    }

    /**
     * Gets the value of the visibleAlarmDescription property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVisibleAlarmDescription() {
        return visibleAlarmDescription;
    }

    /**
     * Sets the value of the visibleAlarmDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVisibleAlarmDescription(JAXBElement<String> value) {
        this.visibleAlarmDescription = value;
    }

}
