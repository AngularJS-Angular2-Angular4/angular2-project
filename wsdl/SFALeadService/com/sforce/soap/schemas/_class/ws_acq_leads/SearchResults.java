
package com.sforce.soap.schemas._class.ws_acq_leads;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchResults complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SearchResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAcctEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isBillingAcctExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isTooManyBAcctsExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpportunityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prospectingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResults", propOrder = {
    "accountId",
    "accountName",
    "billingAcctEntity",
    "createdDate",
    "isBillingAcctExists",
    "isTooManyBAcctsExists",
    "opportunityId",
    "prospectingStatus"
})
public class SearchResults {

    @XmlElementRef(name = "AccountId", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountId;
    @XmlElementRef(name = "AccountName", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountName;
    @XmlElementRef(name = "billingAcctEntity", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billingAcctEntity;
    @XmlElementRef(name = "CreatedDate", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "isBillingAcctExists", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isBillingAcctExists;
    @XmlElementRef(name = "isTooManyBAcctsExists", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isTooManyBAcctsExists;
    @XmlElementRef(name = "OpportunityId", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityId;
    @XmlElementRef(name = "prospectingStatus", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prospectingStatus;

    /**
     * Gets the value of the accountId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAccountId(JAXBElement<String> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAccountName(JAXBElement<String> value) {
        this.accountName = value;
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
     * Gets the value of the createdDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public void setCreatedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the isBillingAcctExists property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getIsBillingAcctExists() {
        return isBillingAcctExists;
    }

    /**
     * Sets the value of the isBillingAcctExists property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setIsBillingAcctExists(JAXBElement<Boolean> value) {
        this.isBillingAcctExists = value;
    }

    /**
     * Gets the value of the isTooManyBAcctsExists property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getIsTooManyBAcctsExists() {
        return isTooManyBAcctsExists;
    }

    /**
     * Sets the value of the isTooManyBAcctsExists property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setIsTooManyBAcctsExists(JAXBElement<Boolean> value) {
        this.isTooManyBAcctsExists = value;
    }

    /**
     * Gets the value of the opportunityId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOpportunityId(JAXBElement<String> value) {
        this.opportunityId = value;
    }

    /**
     * Gets the value of the prospectingStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getProspectingStatus() {
        return prospectingStatus;
    }

    /**
     * Sets the value of the prospectingStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setProspectingStatus(JAXBElement<String> value) {
        this.prospectingStatus = value;
    }

}
