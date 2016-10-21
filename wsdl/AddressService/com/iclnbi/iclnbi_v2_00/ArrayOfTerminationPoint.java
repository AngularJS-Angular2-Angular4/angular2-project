
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTerminationPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTerminationPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TerminationPoint" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TerminationPoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTerminationPoint", propOrder = {
    "terminationPoint"
})
public class ArrayOfTerminationPoint {

    @XmlElement(name = "TerminationPoint", nillable = true)
    protected List<TerminationPoint> terminationPoint;

    /**
     * Gets the value of the terminationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminationPoint }
     * 
     * 
     */
    public List<TerminationPoint> getTerminationPoint() {
        if (terminationPoint == null) {
            terminationPoint = new ArrayList<TerminationPoint>();
        }
        return this.terminationPoint;
    }

}
