
package com.qwest.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAHNMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAHNMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AHNMatch" type="{http://www.qwest.com/XMLSchema}AHNMatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAHNMatch", propOrder = {
    "ahnMatch"
})
public class ArrayOfAHNMatch {

    @XmlElement(name = "AHNMatch", nillable = true)
    protected List<AHNMatch> ahnMatch;

    /**
     * Gets the value of the ahnMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ahnMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAHNMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AHNMatch }
     * 
     * 
     */
    public List<AHNMatch> getAHNMatch() {
        if (ahnMatch == null) {
            ahnMatch = new ArrayList<AHNMatch>();
        }
        return this.ahnMatch;
    }

}
