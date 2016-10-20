
package com.ctl.ecaps.service.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkAccountStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkAccountStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="accountSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enterpriseChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkAccountStatus", propOrder = {
    "accountIds",
    "accountSystemCode",
    "enterpriseId",
    "enterpriseChannelCode"
})
public class CheckAccountStatus {

    @XmlElement(required = true)
    protected List<String> accountIds;
    protected String accountSystemCode;
    protected Long enterpriseId;
    protected String enterpriseChannelCode;

    /**
     * Gets the value of the accountIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccountIds() {
        if (accountIds == null) {
            accountIds = new ArrayList<String>();
        }
        return this.accountIds;
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
     * Gets the value of the enterpriseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * Sets the value of the enterpriseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnterpriseId(Long value) {
        this.enterpriseId = value;
    }

    /**
     * Gets the value of the enterpriseChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseChannelCode() {
        return enterpriseChannelCode;
    }

    /**
     * Sets the value of the enterpriseChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseChannelCode(String value) {
        this.enterpriseChannelCode = value;
    }

}
