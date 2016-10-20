
package com.sforce.soap.schemas._class.ws_acq_leads;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConvertLeadRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConvertLeadRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LeadId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertLeadRequest", propOrder = {
    "leadId"
})
public class ConvertLeadRequest {

    @XmlElementRef(name = "LeadId", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leadId;

    /**
     * Gets the value of the leadId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLeadId() {
        return leadId;
    }

    /**
     * Sets the value of the leadId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLeadId(JAXBElement<String> value) {
        this.leadId = value;
    }

}
