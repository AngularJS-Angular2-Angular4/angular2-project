
package com.ctl.ecaps.service.enterpriseadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ctl.ecaps.serviceobject.EnterpriseSO;


/**
 * <p>Java class for updateEnterprise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEnterprise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterprise" type="{http://ecaps.ctl.com/serviceObject}EnterpriseSO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEnterprise", propOrder = {
    "enterprise"
})
public class UpdateEnterprise {

    @XmlElement(required = true)
    protected EnterpriseSO enterprise;

    /**
     * Gets the value of the enterprise property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseSO }
     *     
     */
    public EnterpriseSO getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseSO }
     *     
     */
    public void setEnterprise(EnterpriseSO value) {
        this.enterprise = value;
    }

}
