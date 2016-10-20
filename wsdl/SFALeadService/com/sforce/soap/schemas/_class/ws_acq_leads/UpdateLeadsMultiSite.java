
package com.sforce.soap.schemas._class.ws_acq_leads;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}UpdateLeadsRequestMultiSite"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "UpdateLeadsMultiSite")
public class UpdateLeadsMultiSite {

    @XmlElement(name = "Request", required = true, nillable = true)
    protected UpdateLeadsRequestMultiSite request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLeadsRequestMultiSite }
     *     
     */
    public UpdateLeadsRequestMultiSite getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLeadsRequestMultiSite }
     *     
     */
    public void setRequest(UpdateLeadsRequestMultiSite value) {
        this.request = value;
    }

}
