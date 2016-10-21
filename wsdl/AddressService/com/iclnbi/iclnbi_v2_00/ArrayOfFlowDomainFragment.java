
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFlowDomainFragment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFlowDomainFragment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlowDomainFragment" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomainFragment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFlowDomainFragment", propOrder = {
    "flowDomainFragment"
})
public class ArrayOfFlowDomainFragment {

    @XmlElement(name = "FlowDomainFragment", nillable = true)
    protected List<FlowDomainFragment> flowDomainFragment;

    /**
     * Gets the value of the flowDomainFragment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowDomainFragment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowDomainFragment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowDomainFragment }
     * 
     * 
     */
    public List<FlowDomainFragment> getFlowDomainFragment() {
        if (flowDomainFragment == null) {
            flowDomainFragment = new ArrayList<FlowDomainFragment>();
        }
        return this.flowDomainFragment;
    }

}
