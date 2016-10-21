
package com.ctl.as.domain.geo.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSubAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubAddress" type="{http://geo.domain.as.ctl.com/Types}SubAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubAddress", propOrder = {
    "subAddress"
})
public class ArrayOfSubAddress {

    @XmlElement(name = "SubAddress", nillable = true)
    protected List<SubAddress> subAddress;

    /**
     * Gets the value of the subAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAddress }
     * 
     * 
     */
    public List<SubAddress> getSubAddress() {
        if (subAddress == null) {
            subAddress = new ArrayList<SubAddress>();
        }
        return this.subAddress;
    }

}
