
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adminRealm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearTrustToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origRealm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationSO", propOrder = {
    "adminRealm",
    "adminUsername",
    "authenticationMethod",
    "clearTrustToken",
    "origPassword",
    "origRealm",
    "origUsername"
})
public class AuthenticationSO {

    protected String adminRealm;
    protected String adminUsername;
    protected String authenticationMethod;
    protected String clearTrustToken;
    protected String origPassword;
    protected String origRealm;
    protected String origUsername;

    /**
     * Gets the value of the adminRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminRealm() {
        return adminRealm;
    }

    /**
     * Sets the value of the adminRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminRealm(String value) {
        this.adminRealm = value;
    }

    /**
     * Gets the value of the adminUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * Sets the value of the adminUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUsername(String value) {
        this.adminUsername = value;
    }

    /**
     * Gets the value of the authenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Sets the value of the authenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMethod(String value) {
        this.authenticationMethod = value;
    }

    /**
     * Gets the value of the clearTrustToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearTrustToken() {
        return clearTrustToken;
    }

    /**
     * Sets the value of the clearTrustToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearTrustToken(String value) {
        this.clearTrustToken = value;
    }

    /**
     * Gets the value of the origPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigPassword() {
        return origPassword;
    }

    /**
     * Sets the value of the origPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigPassword(String value) {
        this.origPassword = value;
    }

    /**
     * Gets the value of the origRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigRealm() {
        return origRealm;
    }

    /**
     * Sets the value of the origRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigRealm(String value) {
        this.origRealm = value;
    }

    /**
     * Gets the value of the origUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigUsername() {
        return origUsername;
    }

    /**
     * Sets the value of the origUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigUsername(String value) {
        this.origUsername = value;
    }

}
