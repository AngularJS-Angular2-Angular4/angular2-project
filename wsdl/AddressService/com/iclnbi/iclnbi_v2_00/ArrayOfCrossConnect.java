
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrossConnect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrossConnect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrossConnect" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}CrossConnect" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrossConnect", propOrder = {
    "crossConnect"
})
public class ArrayOfCrossConnect {

    @XmlElement(name = "CrossConnect", nillable = true)
    protected List<CrossConnect> crossConnect;

    /**
     * Gets the value of the crossConnect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossConnect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossConnect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossConnect }
     * 
     * 
     */
    public List<CrossConnect> getCrossConnect() {
        if (crossConnect == null) {
            crossConnect = new ArrayList<CrossConnect>();
        }
        return this.crossConnect;
    }

}
