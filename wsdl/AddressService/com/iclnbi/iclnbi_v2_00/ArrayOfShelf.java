
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfShelf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShelf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Shelf" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Shelf" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShelf", propOrder = {
    "shelf"
})
public class ArrayOfShelf {

    @XmlElement(name = "Shelf", nillable = true)
    protected List<Shelf> shelf;

    /**
     * Gets the value of the shelf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shelf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShelf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shelf }
     * 
     * 
     */
    public List<Shelf> getShelf() {
        if (shelf == null) {
            shelf = new ArrayList<Shelf>();
        }
        return this.shelf;
    }

}
