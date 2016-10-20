
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountFilterSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountFilterSO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ecaps.ctl.com/serviceObject}FilterSO">
 *       &lt;sequence>
 *         &lt;element name="accountAliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excludeNonEnterpriseCabsAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excludeNonEnterpriseIabsAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeProductAccountsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="productTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAccountGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAccountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subAccountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountFilterSO", propOrder = {
    "accountAliasName",
    "accountId",
    "accountName",
    "accountRegionCode",
    "accountSystemCode",
    "accountTypeCode",
    "excludeNonEnterpriseCabsAccounts",
    "excludeNonEnterpriseIabsAccounts",
    "includeProductAccountsOnly",
    "productTypeCode",
    "statusCode",
    "subAccountGroupId",
    "subAccountIndicator",
    "subAccountTypeCode"
})
public class AccountFilterSO
    extends FilterSO
{

    protected String accountAliasName;
    protected String accountId;
    protected String accountName;
    protected String accountRegionCode;
    protected String accountSystemCode;
    protected String accountTypeCode;
    protected Boolean excludeNonEnterpriseCabsAccounts;
    protected Boolean excludeNonEnterpriseIabsAccounts;
    protected Boolean includeProductAccountsOnly;
    protected String productTypeCode;
    protected String statusCode;
    protected String subAccountGroupId;
    protected Boolean subAccountIndicator;
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
     * Gets the value of the excludeNonEnterpriseCabsAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeNonEnterpriseCabsAccounts() {
        return excludeNonEnterpriseCabsAccounts;
    }

    /**
     * Sets the value of the excludeNonEnterpriseCabsAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeNonEnterpriseCabsAccounts(Boolean value) {
        this.excludeNonEnterpriseCabsAccounts = value;
    }

    /**
     * Gets the value of the excludeNonEnterpriseIabsAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeNonEnterpriseIabsAccounts() {
        return excludeNonEnterpriseIabsAccounts;
    }

    /**
     * Sets the value of the excludeNonEnterpriseIabsAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeNonEnterpriseIabsAccounts(Boolean value) {
        this.excludeNonEnterpriseIabsAccounts = value;
    }

    /**
     * Gets the value of the includeProductAccountsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeProductAccountsOnly() {
        return includeProductAccountsOnly;
    }

    /**
     * Sets the value of the includeProductAccountsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeProductAccountsOnly(Boolean value) {
        this.includeProductAccountsOnly = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubAccountIndicator() {
        return subAccountIndicator;
    }

    /**
     * Sets the value of the subAccountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubAccountIndicator(Boolean value) {
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
