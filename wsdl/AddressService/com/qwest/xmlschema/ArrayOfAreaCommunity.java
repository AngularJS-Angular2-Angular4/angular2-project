
package com.qwest.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAreaCommunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAreaCommunity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaCommunity" type="{http://www.qwest.com/XMLSchema}AreaCommunity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAreaCommunity", propOrder = {
    "areaCommunity"
})
public class ArrayOfAreaCommunity {

    @XmlElement(name = "AreaCommunity", nillable = true)
    protected List<AreaCommunity> areaCommunity;

    /**
     * Gets the value of the areaCommunity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCommunity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCommunity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaCommunity }
     * 
     * 
     */
    public List<AreaCommunity> getAreaCommunity() {
        if (areaCommunity == null) {
            areaCommunity = new ArrayList<AreaCommunity>();
        }
        return this.areaCommunity;
    }

}
