
package com.qwest.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDescriptiveNamePNAMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDescriptiveNamePNAMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescriptiveNamePNAMatch" type="{http://www.qwest.com/XMLSchema}DescriptiveNamePNAMatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDescriptiveNamePNAMatch", propOrder = {
    "descriptiveNamePNAMatch"
})
public class ArrayOfDescriptiveNamePNAMatch {

    @XmlElement(name = "DescriptiveNamePNAMatch", nillable = true)
    protected List<DescriptiveNamePNAMatch> descriptiveNamePNAMatch;

    /**
     * Gets the value of the descriptiveNamePNAMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptiveNamePNAMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptiveNamePNAMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptiveNamePNAMatch }
     * 
     * 
     */
    public List<DescriptiveNamePNAMatch> getDescriptiveNamePNAMatch() {
        if (descriptiveNamePNAMatch == null) {
            descriptiveNamePNAMatch = new ArrayList<DescriptiveNamePNAMatch>();
        }
        return this.descriptiveNamePNAMatch;
    }

}
