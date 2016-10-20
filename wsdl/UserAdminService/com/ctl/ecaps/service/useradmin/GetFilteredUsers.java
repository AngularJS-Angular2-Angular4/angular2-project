
package com.ctl.ecaps.service.useradmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ctl.ecaps.serviceobject.UserFilterCriteriaSO;


/**
 * <p>Java class for getFilteredUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFilteredUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="filterCriteria" type="{http://ecaps.ctl.com/serviceObject}UserFilterCriteriaSO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFilteredUsers", propOrder = {
    "enterpriseId",
    "filterCriteria"
})
public class GetFilteredUsers {

    protected long enterpriseId;
    @XmlElement(required = true)
    protected UserFilterCriteriaSO filterCriteria;

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
     * Gets the value of the filterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link UserFilterCriteriaSO }
     *     
     */
    public UserFilterCriteriaSO getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Sets the value of the filterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFilterCriteriaSO }
     *     
     */
    public void setFilterCriteria(UserFilterCriteriaSO value) {
        this.filterCriteria = value;
    }

}
