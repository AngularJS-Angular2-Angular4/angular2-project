
package com.ctl.ecaps.service.enterpriseadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ctl.ecaps.serviceobject.EnterpriseSO;


/**
 * <p>Java class for getEnterpriseByAccountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEnterpriseByAccountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ecaps.ctl.com/serviceObject}EnterpriseSO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEnterpriseByAccountResponse", propOrder = {
    "_return"
})
public class GetEnterpriseByAccountResponse {

    @XmlElement(name = "return")
    protected EnterpriseSO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseSO }
     *     
     */
    public EnterpriseSO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseSO }
     *     
     */
    public void setReturn(EnterpriseSO value) {
        this._return = value;
    }

}
