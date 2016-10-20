
package com.ctl.ecaps.service.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignAccountToEnterpriseWithLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignAccountToEnterpriseWithLookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountSystemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allowInactive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignAccountToEnterpriseWithLookup", propOrder = {
    "enterpriseId",
    "accountId",
    "accountSystemCode",
    "allowInactive"
})
public class AssignAccountToEnterpriseWithLookup {

    protected long enterpriseId;
    @XmlElement(required = true)
    protected String accountId;
    @XmlElement(required = true)
    protected String accountSystemCode;
    protected boolean allowInactive;

    /**
     * Gets the value of the enterpriseId property.
     * 
     */
    public long getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * Sets the value of the enterpriseId property.
     * 
     */
    public void setEnterpriseId(long value) {
        this.enterpriseId = value;
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
     * Gets the value of the allowInactive property.
     * 
     */
    public boolean isAllowInactive() {
        return allowInactive;
    }

    /**
     * Sets the value of the allowInactive property.
     * 
     */
    public void setAllowInactive(boolean value) {
        this.allowInactive = value;
    }

}
