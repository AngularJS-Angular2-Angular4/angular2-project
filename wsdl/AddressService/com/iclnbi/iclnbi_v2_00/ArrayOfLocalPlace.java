
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLocalPlace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLocalPlace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalPlace" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LocalPlace" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocalPlace", propOrder = {
    "localPlace"
})
public class ArrayOfLocalPlace {

    @XmlElement(name = "LocalPlace", nillable = true)
    protected List<LocalPlace> localPlace;

    /**
     * Gets the value of the localPlace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localPlace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalPlace }
     * 
     * 
     */
    public List<LocalPlace> getLocalPlace() {
        if (localPlace == null) {
            localPlace = new ArrayList<LocalPlace>();
        }
        return this.localPlace;
    }

}
