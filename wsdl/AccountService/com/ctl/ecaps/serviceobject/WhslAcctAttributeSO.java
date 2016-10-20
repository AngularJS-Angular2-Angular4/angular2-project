
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WhslAcctAttributeSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WhslAcctAttributeSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressMandatoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardStockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internationalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WhslAcctAttributeSO", propOrder = {
    "accountId",
    "accountSystemCode",
    "addressMandatoryCode",
    "cardStockCode",
    "cicCode",
    "internationalCode"
})
public class WhslAcctAttributeSO {

    protected String accountId;
    protected String accountSystemCode;
    protected String addressMandatoryCode;
    protected String cardStockCode;
    protected String cicCode;
    protected String internationalCode;

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
     * Gets the value of the addressMandatoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressMandatoryCode() {
        return addressMandatoryCode;
    }

    /**
     * Sets the value of the addressMandatoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressMandatoryCode(String value) {
        this.addressMandatoryCode = value;
    }

    /**
     * Gets the value of the cardStockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStockCode() {
        return cardStockCode;
    }

    /**
     * Sets the value of the cardStockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStockCode(String value) {
        this.cardStockCode = value;
    }

    /**
     * Gets the value of the cicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCicCode() {
        return cicCode;
    }

    /**
     * Sets the value of the cicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCicCode(String value) {
        this.cicCode = value;
    }

    /**
     * Gets the value of the internationalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalCode() {
        return internationalCode;
    }

    /**
     * Sets the value of the internationalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalCode(String value) {
        this.internationalCode = value;
    }

}
