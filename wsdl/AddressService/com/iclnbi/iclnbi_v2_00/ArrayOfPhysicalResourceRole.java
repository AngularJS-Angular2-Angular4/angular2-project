
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPhysicalResourceRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPhysicalResourceRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhysicalResourceRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PhysicalResourceRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalResourceRole", propOrder = {
    "physicalResourceRole"
})
public class ArrayOfPhysicalResourceRole {

    @XmlElement(name = "PhysicalResourceRole", nillable = true)
    protected List<PhysicalResourceRole> physicalResourceRole;

    /**
     * Gets the value of the physicalResourceRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalResourceRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalResourceRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalResourceRole }
     * 
     * 
     */
    public List<PhysicalResourceRole> getPhysicalResourceRole() {
        if (physicalResourceRole == null) {
            physicalResourceRole = new ArrayList<PhysicalResourceRole>();
        }
        return this.physicalResourceRole;
    }

}
