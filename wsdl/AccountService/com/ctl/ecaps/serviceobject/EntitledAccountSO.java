
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitledAccountSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitledAccountSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountAliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountMarketUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingStateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bossBtnCc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAccountGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAccountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subAccountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="userEntitled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitledAccountSO", propOrder = {
    "accountAliasName",
    "accountChannelId",
    "accountId",
    "accountMarketUnitId",
    "accountName",
    "accountSystemCode",
    "accountTypeCode",
    "billingAddressLine1",
    "billingAddressLine2",
    "billingCity",
    "billingPostalCode",
    "billingStateProvinceCode",
    "bossBtnCc",
    "ctaId",
    "discountGroupId",
    "marketingIndicator",
    "sourceSystem",
    "sourceSystemCode",
    "statusCode",
    "subAccountGroupId",
    "subAccountIndicator",
    "subAccountTypeCode",
    "userAssigned",
    "userEntitled"
})
public class EntitledAccountSO {

    protected String accountAliasName;
    protected String accountChannelId;
    protected String accountId;
    protected String accountMarketUnitId;
    protected String accountName;
    protected String accountSystemCode;
    protected String accountTypeCode;
    protected String billingAddressLine1;
    protected String billingAddressLine2;
    protected String billingCity;
    protected String billingPostalCode;
    protected String billingStateProvinceCode;
    protected String bossBtnCc;
    protected String ctaId;
    protected String discountGroupId;
    protected boolean marketingIndicator;
    protected String sourceSystem;
    protected String sourceSystemCode;
    protected String statusCode;
    protected String subAccountGroupId;
    protected boolean subAccountIndicator;
    protected String subAccountTypeCode;
    protected boolean userAssigned;
    protected boolean userEntitled;

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
     * Gets the value of the billingAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressLine1() {
        return billingAddressLine1;
    }

    /**
     * Sets the value of the billingAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressLine1(String value) {
        this.billingAddressLine1 = value;
    }

    /**
     * Gets the value of the billingAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressLine2() {
        return billingAddressLine2;
    }

    /**
     * Sets the value of the billingAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressLine2(String value) {
        this.billingAddressLine2 = value;
    }

    /**
     * Gets the value of the billingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Sets the value of the billingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCity(String value) {
        this.billingCity = value;
    }

    /**
     * Gets the value of the billingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    /**
     * Sets the value of the billingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPostalCode(String value) {
        this.billingPostalCode = value;
    }

    /**
     * Gets the value of the billingStateProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingStateProvinceCode() {
        return billingStateProvinceCode;
    }

    /**
     * Sets the value of the billingStateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingStateProvinceCode(String value) {
        this.billingStateProvinceCode = value;
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

    /**
     * Gets the value of the userAssigned property.
     * 
     */
    public boolean isUserAssigned() {
        return userAssigned;
    }

    /**
     * Sets the value of the userAssigned property.
     * 
     */
    public void setUserAssigned(boolean value) {
        this.userAssigned = value;
    }

    /**
     * Gets the value of the userEntitled property.
     * 
     */
    public boolean isUserEntitled() {
        return userEntitled;
    }

    /**
     * Sets the value of the userEntitled property.
     * 
     */
    public void setUserEntitled(boolean value) {
        this.userEntitled = value;
    }

}
