
package com.ctl.ecaps.service.enterpriseadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRespOrgIdsByRmcId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRespOrgIdsByRmcId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rmcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRespOrgIdsByRmcId", propOrder = {
    "rmcId"
})
public class GetRespOrgIdsByRmcId {

    @XmlElement(required = true)
    protected String rmcId;

    /**
     * Gets the value of the rmcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmcId() {
        return rmcId;
    }

    /**
     * Sets the value of the rmcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmcId(String value) {
        this.rmcId = value;
    }

}
