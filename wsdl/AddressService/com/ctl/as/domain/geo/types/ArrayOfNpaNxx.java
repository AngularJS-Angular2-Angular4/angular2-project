
package com.ctl.as.domain.geo.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNpaNxx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNpaNxx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NpaNxx" type="{http://geo.domain.as.ctl.com/Types}NpaNxx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNpaNxx", propOrder = {
    "npaNxx"
})
public class ArrayOfNpaNxx {

    @XmlElement(name = "NpaNxx", nillable = true)
    protected List<NpaNxx> npaNxx;

    /**
     * Gets the value of the npaNxx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the npaNxx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNpaNxx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NpaNxx }
     * 
     * 
     */
    public List<NpaNxx> getNpaNxx() {
        if (npaNxx == null) {
            npaNxx = new ArrayList<NpaNxx>();
        }
        return this.npaNxx;
    }

}
