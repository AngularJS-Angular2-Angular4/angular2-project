
package com.ctl.ecaps.service.useradmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ctl.ecaps.serviceobject.UserCheckRequestSO;


/**
 * <p>Java class for checkForUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkForUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userCheckRequest" type="{http://ecaps.ctl.com/serviceObject}UserCheckRequestSO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkForUser", propOrder = {
    "userCheckRequest"
})
public class CheckForUser {

    @XmlElement(required = true)
    protected UserCheckRequestSO userCheckRequest;

    /**
     * Gets the value of the userCheckRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UserCheckRequestSO }
     *     
     */
    public UserCheckRequestSO getUserCheckRequest() {
        return userCheckRequest;
    }

    /**
     * Sets the value of the userCheckRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCheckRequestSO }
     *     
     */
    public void setUserCheckRequest(UserCheckRequestSO value) {
        this.userCheckRequest = value;
    }

}
