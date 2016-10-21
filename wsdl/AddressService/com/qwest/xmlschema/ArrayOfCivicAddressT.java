
package com.qwest.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCivicAddressT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCivicAddressT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CivicAddressT" type="{http://www.qwest.com/XMLSchema}CivicAddressT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCivicAddressT", propOrder = {
    "civicAddressT"
})
public class ArrayOfCivicAddressT {

    @XmlElement(name = "CivicAddressT", nillable = true)
    protected List<CivicAddressT> civicAddressT;

    /**
     * Gets the value of the civicAddressT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the civicAddressT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCivicAddressT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CivicAddressT }
     * 
     * 
     */
    public List<CivicAddressT> getCivicAddressT() {
        if (civicAddressT == null) {
            civicAddressT = new ArrayList<CivicAddressT>();
        }
        return this.civicAddressT;
    }

}
