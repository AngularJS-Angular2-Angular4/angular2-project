
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSearchResponseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchResponseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchResponseDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}SearchResponseDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchResponseDetails", propOrder = {
    "searchResponseDetails"
})
public class ArrayOfSearchResponseDetails {

    @XmlElement(name = "SearchResponseDetails", nillable = true)
    protected List<SearchResponseDetails> searchResponseDetails;

    /**
     * Gets the value of the searchResponseDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResponseDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResponseDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResponseDetails }
     * 
     * 
     */
    public List<SearchResponseDetails> getSearchResponseDetails() {
        if (searchResponseDetails == null) {
            searchResponseDetails = new ArrayList<SearchResponseDetails>();
        }
        return this.searchResponseDetails;
    }

}
