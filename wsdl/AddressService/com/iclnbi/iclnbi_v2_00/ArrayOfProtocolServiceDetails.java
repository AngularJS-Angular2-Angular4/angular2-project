
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProtocolServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProtocolServiceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProtocolServiceDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ProtocolServiceDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProtocolServiceDetails", propOrder = {
    "protocolServiceDetails"
})
public class ArrayOfProtocolServiceDetails {

    @XmlElement(name = "ProtocolServiceDetails", nillable = true)
    protected List<ProtocolServiceDetails> protocolServiceDetails;

    /**
     * Gets the value of the protocolServiceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocolServiceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocolServiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtocolServiceDetails }
     * 
     * 
     */
    public List<ProtocolServiceDetails> getProtocolServiceDetails() {
        if (protocolServiceDetails == null) {
            protocolServiceDetails = new ArrayList<ProtocolServiceDetails>();
        }
        return this.protocolServiceDetails;
    }

}
