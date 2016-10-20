
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountStatusSO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AccountStatusSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availabilityStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bossBtnCc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disconnectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="disconnectedMonths" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="rjsAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatusSO", propOrder = {
    "accountChannelId",
    "accountId",
    "accountName",
    "accountSystemCode",
    "availabilityStatusCode",
    "bossBtnCc",
    "disconnectDate",
    "disconnectedMonths",
    "rjsAccountId",
    "statusCode"
})
public class AccountStatusSO {

    protected String accountChannelId;
    protected String accountId;
    protected String accountName;
    protected String accountSystemCode;
    protected String availabilityStatusCode;
    protected String bossBtnCc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disconnectDate;
    protected Float disconnectedMonths;
    protected String rjsAccountId;
    protected String statusCode;

    /**
     * Gets the value of the accountChannelId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountChannelId() {
        return accountChannelId;
    }

    /**
     * Sets the value of the accountChannelId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountChannelId(String value) {
        this.accountChannelId = value;
    }

    /**
     * Gets the value of the accountId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountSystemCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountSystemCode() {
        return accountSystemCode;
    }

    /**
     * Sets the value of the accountSystemCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountSystemCode(String value) {
        this.accountSystemCode = value;
    }

    /**
     * Gets the value of the availabilityStatusCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAvailabilityStatusCode() {
        return availabilityStatusCode;
    }

    /**
     * Sets the value of the availabilityStatusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAvailabilityStatusCode(String value) {
        this.availabilityStatusCode = value;
    }

    /**
     * Gets the value of the bossBtnCc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBossBtnCc() {
        return bossBtnCc;
    }

    /**
     * Sets the value of the bossBtnCc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBossBtnCc(String value) {
        this.bossBtnCc = value;
    }

    /**
     * Gets the value of the disconnectDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDisconnectDate() {
        return disconnectDate;
    }

    /**
     * Sets the value of the disconnectDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setDisconnectDate(XMLGregorianCalendar value) {
        this.disconnectDate = value;
    }

    /**
     * Gets the value of the disconnectedMonths property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getDisconnectedMonths() {
        return disconnectedMonths;
    }

    /**
     * Sets the value of the disconnectedMonths property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setDisconnectedMonths(Float value) {
        this.disconnectedMonths = value;
    }

    /**
     * Gets the value of the rjsAccountId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRjsAccountId() {
        return rjsAccountId;
    }

    /**
     * Sets the value of the rjsAccountId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRjsAccountId(String value) {
        this.rjsAccountId = value;
    }

    /**
     * Gets the value of the statusCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

}
