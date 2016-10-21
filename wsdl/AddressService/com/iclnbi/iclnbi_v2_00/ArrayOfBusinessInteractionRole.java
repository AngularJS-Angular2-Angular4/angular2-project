
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBusinessInteractionRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBusinessInteractionRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessInteractionRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}BusinessInteractionRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBusinessInteractionRole", propOrder = {
    "businessInteractionRole"
})
public class ArrayOfBusinessInteractionRole {

    @XmlElement(name = "BusinessInteractionRole", nillable = true)
    protected List<BusinessInteractionRole> businessInteractionRole;

    /**
     * Gets the value of the businessInteractionRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessInteractionRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessInteractionRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessInteractionRole }
     * 
     * 
     */
    public List<BusinessInteractionRole> getBusinessInteractionRole() {
        if (businessInteractionRole == null) {
            businessInteractionRole = new ArrayList<BusinessInteractionRole>();
        }
        return this.businessInteractionRole;
    }

}
