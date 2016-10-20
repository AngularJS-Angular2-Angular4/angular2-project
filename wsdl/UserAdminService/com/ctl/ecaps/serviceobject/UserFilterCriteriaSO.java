
package com.ctl.ecaps.serviceobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserFilterCriteriaSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserFilterCriteriaSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="csaRole" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="oaRole" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserFilterCriteriaSO", propOrder = {
    "csaRole",
    "oaRole",
    "roleName"
})
public class UserFilterCriteriaSO {

    protected boolean csaRole;
    protected boolean oaRole;
    @XmlElement(nillable = true)
    protected List<String> roleName;

    /**
     * Gets the value of the csaRole property.
     * 
     */
    public boolean isCsaRole() {
        return csaRole;
    }

    /**
     * Sets the value of the csaRole property.
     * 
     */
    public void setCsaRole(boolean value) {
        this.csaRole = value;
    }

    /**
     * Gets the value of the oaRole property.
     * 
     */
    public boolean isOaRole() {
        return oaRole;
    }

    /**
     * Sets the value of the oaRole property.
     * 
     */
    public void setOaRole(boolean value) {
        this.oaRole = value;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleName() {
        if (roleName == null) {
            roleName = new ArrayList<String>();
        }
        return this.roleName;
    }

}
