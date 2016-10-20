
package com.ctl.ecaps.service.enterpriseadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getChildEnterprises complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getChildEnterprises">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentEnterpriseId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChildEnterprises", propOrder = {
    "parentEnterpriseId"
})
public class GetChildEnterprises {

    protected long parentEnterpriseId;

    /**
     * Gets the value of the parentEnterpriseId property.
     * 
     */
    public long getParentEnterpriseId() {
        return parentEnterpriseId;
    }

    /**
     * Sets the value of the parentEnterpriseId property.
     * 
     */
    public void setParentEnterpriseId(long value) {
        this.parentEnterpriseId = value;
    }

}
