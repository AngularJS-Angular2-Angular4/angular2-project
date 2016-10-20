
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserEnterpriseDataSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserEnterpriseDataSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterprise" type="{http://ecaps.ctl.com/serviceObject}EnterpriseSO" minOccurs="0"/>
 *         &lt;element name="enterpriseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user" type="{http://ecaps.ctl.com/serviceObject}UserSO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserEnterpriseDataSO", propOrder = {
    "enterprise",
    "enterpriseCount",
    "user"
})
public class UserEnterpriseDataSO {

    protected EnterpriseSO enterprise;
    protected int enterpriseCount;
    protected UserSO user;

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

    /**
     * Gets the value of the enterpriseCount property.
     * 
     */
    public int getEnterpriseCount() {
        return enterpriseCount;
    }

    /**
     * Sets the value of the enterpriseCount property.
     * 
     */
    public void setEnterpriseCount(int value) {
        this.enterpriseCount = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserSO }
     *     
     */
    public UserSO getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSO }
     *     
     */
    public void setUser(UserSO value) {
        this.user = value;
    }

}
