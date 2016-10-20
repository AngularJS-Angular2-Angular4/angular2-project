
package com.ctl.ecaps.serviceobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDetailSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDetailSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterprise" type="{http://ecaps.ctl.com/serviceObject}EnterpriseSO" minOccurs="0"/>
 *         &lt;element name="groupNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "UserDetailSO", propOrder = {
    "enterprise",
    "groupNames",
    "user"
})
public class UserDetailSO {

    protected EnterpriseSO enterprise;
    @XmlElement(nillable = true)
    protected List<String> groupNames;
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
     * Gets the value of the groupNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new ArrayList<String>();
        }
        return this.groupNames;
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
