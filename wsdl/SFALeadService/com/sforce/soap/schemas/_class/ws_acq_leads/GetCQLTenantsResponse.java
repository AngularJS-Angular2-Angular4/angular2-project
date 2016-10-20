
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
 *         &lt;element name="result" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}CompanyQualifiedtntResponse"/>
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
@XmlRootElement(name = "GetCQLTenantsResponse")
public class GetCQLTenantsResponse {

    @XmlElement(required = true, nillable = true)
    protected CompanyQualifiedtntResponse result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyQualifiedtntResponse }
     *     
     */
    public CompanyQualifiedtntResponse getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyQualifiedtntResponse }
     *     
     */
    public void setResult(CompanyQualifiedtntResponse value) {
        this.result = value;
    }

}
