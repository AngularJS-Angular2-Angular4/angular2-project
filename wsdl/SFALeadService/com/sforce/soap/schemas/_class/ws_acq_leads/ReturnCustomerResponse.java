
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
 *         &lt;element name="result" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}ReturnCustomersResponse"/>
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
    "result"
})
@XmlRootElement(name = "ReturnCustomerResponse")
public class ReturnCustomerResponse {

    @XmlElement(required = true, nillable = true)
    protected ReturnCustomersResponse result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCustomersResponse }
     *     
     */
    public ReturnCustomersResponse getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCustomersResponse }
     *     
     */
    public void setResult(ReturnCustomersResponse value) {
        this.result = value;
    }

}
