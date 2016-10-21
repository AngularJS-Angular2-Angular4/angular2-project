
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfManagementDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfManagementDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManagementDomain" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ManagementDomain" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManagementDomain", propOrder = {
    "managementDomain"
})
public class ArrayOfManagementDomain {

    @XmlElement(name = "ManagementDomain", nillable = true)
    protected List<ManagementDomain> managementDomain;

    /**
     * Gets the value of the managementDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managementDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagementDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagementDomain }
     * 
     * 
     */
    public List<ManagementDomain> getManagementDomain() {
        if (managementDomain == null) {
            managementDomain = new ArrayList<ManagementDomain>();
        }
        return this.managementDomain;
    }

}
