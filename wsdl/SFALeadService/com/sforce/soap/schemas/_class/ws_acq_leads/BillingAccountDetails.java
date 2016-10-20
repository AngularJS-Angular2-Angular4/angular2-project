
package com.sforce.soap.schemas._class.ws_acq_leads;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingAccountDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BillingAccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountOwnerURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAcctEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingAccountDetails", propOrder = {
    "billingAccountId",
    "billingAccountName",
    "billingAccountOwner",
    "billingAccountOwnerURL",
    "billingAcctEntity",
    "billingSystem"
})
public class BillingAccountDetails {

    @XmlElementRef(name = "BillingAccountId", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billingAccountId;
    @XmlElementRef(name = "BillingAccountName", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billingAccountName;
    @XmlElementRef(name = "BillingAccountOwner", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billingAccountOwner;
    @XmlElementRef(name = "BillingAccountOwnerURL", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billingAccountOwnerURL;
    @XmlElementRef(name = "BillingAcctEntity", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billingAcctEntity;
    @XmlElementRef(name = "BillingSystem", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billingSystem;

    /**
     * Gets the value of the billingAccountId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBillingAccountId() {
        return billingAccountId;
    }

    /**
     * Sets the value of the billingAccountId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBillingAccountId(JAXBElement<String> value) {
        this.billingAccountId = value;
    }

    /**
     * Gets the value of the billingAccountName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBillingAccountName() {
        return billingAccountName;
    }

    /**
     * Sets the value of the billingAccountName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBillingAccountName(JAXBElement<String> value) {
        this.billingAccountName = value;
    }

    /**
     * Gets the value of the billingAccountOwner property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBillingAccountOwner() {
        return billingAccountOwner;
    }

    /**
     * Sets the value of the billingAccountOwner property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBillingAccountOwner(JAXBElement<String> value) {
        this.billingAccountOwner = value;
    }

    /**
     * Gets the value of the billingAccountOwnerURL property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBillingAccountOwnerURL() {
        return billingAccountOwnerURL;
    }

    /**
     * Sets the value of the billingAccountOwnerURL property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBillingAccountOwnerURL(JAXBElement<String> value) {
        this.billingAccountOwnerURL = value;
    }

    /**
     * Gets the value of the billingAcctEntity property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBillingAcctEntity() {
        return billingAcctEntity;
    }

    /**
     * Sets the value of the billingAcctEntity property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBillingAcctEntity(JAXBElement<String> value) {
        this.billingAcctEntity = value;
    }

    /**
     * Gets the value of the billingSystem property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBillingSystem() {
        return billingSystem;
    }

    /**
     * Sets the value of the billingSystem property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBillingSystem(JAXBElement<String> value) {
        this.billingSystem = value;
    }

}
