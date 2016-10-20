
package com.sforce.soap.schemas._class.ws_acq_leads;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLeadsRequestMultiSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLeadsRequestMultiSite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACQMultiSiteLead" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}ACQLeadMultiSite" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLeadsRequestMultiSite", propOrder = {
    "acqMultiSiteLead"
})
public class UpdateLeadsRequestMultiSite {

    @XmlElement(name = "ACQMultiSiteLead", nillable = true)
    protected List<ACQLeadMultiSite> acqMultiSiteLead;

    /**
     * Gets the value of the acqMultiSiteLead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acqMultiSiteLead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACQMultiSiteLead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACQLeadMultiSite }
     * 
     * 
     */
    public List<ACQLeadMultiSite> getACQMultiSiteLead() {
        if (acqMultiSiteLead == null) {
            acqMultiSiteLead = new ArrayList<ACQLeadMultiSite>();
        }
        return this.acqMultiSiteLead;
    }

}
