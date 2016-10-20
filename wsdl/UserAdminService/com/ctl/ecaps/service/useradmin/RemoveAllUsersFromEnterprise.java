
package com.ctl.ecaps.service.useradmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeAllUsersFromEnterprise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeAllUsersFromEnterprise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeAllUsersFromEnterprise", propOrder = {
    "enterpriseId"
})
public class RemoveAllUsersFromEnterprise {

    protected long enterpriseId;

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

}
