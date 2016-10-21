
package com.qwest.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDescriptiveNameCommunityMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDescriptiveNameCommunityMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescriptiveNameCommunityMatch" type="{http://www.qwest.com/XMLSchema}DescriptiveNameCommunityMatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDescriptiveNameCommunityMatch", propOrder = {
    "descriptiveNameCommunityMatch"
})
public class ArrayOfDescriptiveNameCommunityMatch {

    @XmlElement(name = "DescriptiveNameCommunityMatch", nillable = true)
    protected List<DescriptiveNameCommunityMatch> descriptiveNameCommunityMatch;

    /**
     * Gets the value of the descriptiveNameCommunityMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptiveNameCommunityMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptiveNameCommunityMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptiveNameCommunityMatch }
     * 
     * 
     */
    public List<DescriptiveNameCommunityMatch> getDescriptiveNameCommunityMatch() {
        if (descriptiveNameCommunityMatch == null) {
            descriptiveNameCommunityMatch = new ArrayList<DescriptiveNameCommunityMatch>();
        }
        return this.descriptiveNameCommunityMatch;
    }

}
