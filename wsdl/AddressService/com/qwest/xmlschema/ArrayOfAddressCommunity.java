
package com.qwest.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAddressCommunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddressCommunity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressCommunity" type="{http://www.qwest.com/XMLSchema}AddressCommunity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddressCommunity", propOrder = {
    "addressCommunity"
})
public class ArrayOfAddressCommunity {

    @XmlElement(name = "AddressCommunity", nillable = true)
    protected List<AddressCommunity> addressCommunity;

    /**
     * Gets the value of the addressCommunity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressCommunity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressCommunity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressCommunity }
     * 
     * 
     */
    public List<AddressCommunity> getAddressCommunity() {
        if (addressCommunity == null) {
            addressCommunity = new ArrayList<AddressCommunity>();
        }
        return this.addressCommunity;
    }

}
