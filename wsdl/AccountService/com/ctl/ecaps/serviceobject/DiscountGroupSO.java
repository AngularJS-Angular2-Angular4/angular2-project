
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountGroupSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountGroupSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountGroupSO", propOrder = {
    "discountGroupId",
    "discountGroupType"
})
public class DiscountGroupSO {

    protected String discountGroupId;
    protected String discountGroupType;

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
     * Gets the value of the discountGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountGroupType() {
        return discountGroupType;
    }

    /**
     * Sets the value of the discountGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountGroupType(String value) {
        this.discountGroupType = value;
    }

}
