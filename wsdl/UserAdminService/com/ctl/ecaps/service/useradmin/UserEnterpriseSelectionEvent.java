
package com.ctl.ecaps.service.useradmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userEnterpriseSelectionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userEnterpriseSelectionEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portalSiteId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origUserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fromEnterpriseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userEnterpriseSelectionEvent", propOrder = {
    "portalSiteId",
    "origUserId",
    "userId",
    "enterpriseId",
    "fromEnterpriseId"
})
public class UserEnterpriseSelectionEvent {

    @XmlElement(required = true)
    protected String portalSiteId;
    protected long origUserId;
    protected long userId;
    protected long enterpriseId;
    protected Long fromEnterpriseId;

    /**
     * Gets the value of the portalSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalSiteId() {
        return portalSiteId;
    }

    /**
     * Sets the value of the portalSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalSiteId(String value) {
        this.portalSiteId = value;
    }

    /**
     * Gets the value of the origUserId property.
     * 
     */
    public long getOrigUserId() {
        return origUserId;
    }

    /**
     * Sets the value of the origUserId property.
     * 
     */
    public void setOrigUserId(long value) {
        this.origUserId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

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
     * Gets the value of the fromEnterpriseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFromEnterpriseId() {
        return fromEnterpriseId;
    }

    /**
     * Sets the value of the fromEnterpriseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFromEnterpriseId(Long value) {
        this.fromEnterpriseId = value;
    }

}
