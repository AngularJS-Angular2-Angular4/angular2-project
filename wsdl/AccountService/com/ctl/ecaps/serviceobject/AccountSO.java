
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountSO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AccountSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountAliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountMarketUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bossBtnCc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disconnectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="discountGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rjsAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesRepId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAccountGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAccountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subAccountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSO", propOrder = {
    "accountAliasName",
    "accountChannelId",
    "accountDisplayName",
    "accountId",
    "accountMarketUnitId",
    "accountName",
    "accountRegionCode",
    "accountSystemCode",
    "accountTypeCode",
    "bossBtnCc",
    "ctaId",
    "disconnectDate",
    "discountGroupId",
    "marketingIndicator",
    "rjsAccountId",
    "salesRepId",
    "sourceSystem",
    "sourceSystemCode",
    "statusCode",
    "subAccountGroupId",
    "subAccountIndicator",
    "subAccountTypeCode"
})
@XmlSeeAlso({
    AccountDetailSO.class
})
public class AccountSO {

    protected String accountAliasName;
    protected String accountChannelId;
    protected String accountDisplayName;
    protected String accountId;
    protected String accountMarketUnitId;
    protected String accountName;
    protected String accountRegionCode;
    protected String accountSystemCode;
    protected String accountTypeCode;
    protected String bossBtnCc;
    protected String ctaId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disconnectDate;
    protected String discountGroupId;
    protected boolean marketingIndicator;
    protected String rjsAccountId;
    protected String salesRepId;
    protected String sourceSystem;
    protected String sourceSystemCode;
    protected String statusCode;
    protected String subAccountGroupId;
    protected boolean subAccountIndicator;
    protected String subAccountTypeCode;

    /**
     * Gets the value of the accountAliasName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountAliasName() {
        return accountAliasName;
    }

    /**
     * Sets the value of the accountAliasName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountAliasName(String value) {
        this.accountAliasName = value;
    }

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
     * Gets the value of the accountDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountDisplayName() {
        return accountDisplayName;
    }

    /**
     * Sets the value of the accountDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountDisplayName(String value) {
        this.accountDisplayName = value;
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
     * Gets the value of the accountMarketUnitId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountMarketUnitId() {
        return accountMarketUnitId;
    }

    /**
     * Sets the value of the accountMarketUnitId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountMarketUnitId(String value) {
        this.accountMarketUnitId = value;
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
     * Gets the value of the accountRegionCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountRegionCode() {
        return accountRegionCode;
    }

    /**
     * Sets the value of the accountRegionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountRegionCode(String value) {
        this.accountRegionCode = value;
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
     * Gets the value of the accountTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Sets the value of the accountTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountTypeCode(String value) {
        this.accountTypeCode = value;
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
     * Gets the value of the ctaId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCtaId() {
        return ctaId;
    }

    /**
     * Sets the value of the ctaId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCtaId(String value) {
        this.ctaId = value;
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
     * Gets the value of the discountGroupId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDiscountGroupId() {
        return discountGroupId;
    }

    /**
     * Sets the value of the discountGroupId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDiscountGroupId(String value) {
        this.discountGroupId = value;
    }

    /**
     * Gets the value of the marketingIndicator property.
     *
     */
    public boolean isMarketingIndicator() {
        return marketingIndicator;
    }

    /**
     * Sets the value of the marketingIndicator property.
     *
     */
    public void setMarketingIndicator(boolean value) {
        this.marketingIndicator = value;
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
     * Gets the value of the salesRepId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesRepId() {
        return salesRepId;
    }

    /**
     * Sets the value of the salesRepId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesRepId(String value) {
        this.salesRepId = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the sourceSystemCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSourceSystemCode() {
        return sourceSystemCode;
    }

    /**
     * Sets the value of the sourceSystemCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceSystemCode(String value) {
        this.sourceSystemCode = value;
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

    /**
     * Gets the value of the subAccountGroupId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubAccountGroupId() {
        return subAccountGroupId;
    }

    /**
     * Sets the value of the subAccountGroupId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubAccountGroupId(String value) {
        this.subAccountGroupId = value;
    }

    /**
     * Gets the value of the subAccountIndicator property.
     *
     */
    public boolean isSubAccountIndicator() {
        return subAccountIndicator;
    }

    /**
     * Sets the value of the subAccountIndicator property.
     *
     */
    public void setSubAccountIndicator(boolean value) {
        this.subAccountIndicator = value;
    }

    /**
     * Gets the value of the subAccountTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubAccountTypeCode() {
        return subAccountTypeCode;
    }

    /**
     * Sets the value of the subAccountTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubAccountTypeCode(String value) {
        this.subAccountTypeCode = value;
    }

}
