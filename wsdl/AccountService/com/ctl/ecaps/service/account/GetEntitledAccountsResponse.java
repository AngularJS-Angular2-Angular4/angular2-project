
package com.ctl.ecaps.service.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ctl.ecaps.serviceobject.EntitledAccountResponseSO;


/**
 * <p>Java class for getEntitledAccountsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEntitledAccountsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ecaps.ctl.com/serviceObject}EntitledAccountResponseSO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntitledAccountsResponse", propOrder = {
    "_return"
})
public class GetEntitledAccountsResponse {

    @XmlElement(name = "return")
    protected EntitledAccountResponseSO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link EntitledAccountResponseSO }
     *     
     */
    public EntitledAccountResponseSO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitledAccountResponseSO }
     *     
     */
    public void setReturn(EntitledAccountResponseSO value) {
        this._return = value;
    }

}
