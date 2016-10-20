
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccessNumberSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAccessNumberSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardAccessNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCompGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccessNumberSO", propOrder = {
    "cardAccessNumber",
    "cardCompGroupCode"
})
public class CardAccessNumberSO {

    protected String cardAccessNumber;
    protected String cardCompGroupCode;

    /**
     * Gets the value of the cardAccessNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccessNumber() {
        return cardAccessNumber;
    }

    /**
     * Sets the value of the cardAccessNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccessNumber(String value) {
        this.cardAccessNumber = value;
    }

    /**
     * Gets the value of the cardCompGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCompGroupCode() {
        return cardCompGroupCode;
    }

    /**
     * Sets the value of the cardCompGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCompGroupCode(String value) {
        this.cardCompGroupCode = value;
    }

}
