
package com.sforce.soap.schemas._class.ws_acq_leads;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLeadsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLeadsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACQLeads" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}ACQLead" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLeadsRequest", propOrder = {
    "acqLeads"
})
public class UpdateLeadsRequest {

    @XmlElement(name = "ACQLeads", nillable = true)
    protected List<ACQLead> acqLeads;

    /**
     * Gets the value of the acqLeads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acqLeads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACQLeads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACQLead }
     * 
     * 
     */
    public List<ACQLead> getACQLeads() {
        if (acqLeads == null) {
            acqLeads = new ArrayList<ACQLead>();
        }
        return this.acqLeads;
    }

}
