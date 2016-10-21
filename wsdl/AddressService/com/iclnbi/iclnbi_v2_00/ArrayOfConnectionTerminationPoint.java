
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConnectionTerminationPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConnectionTerminationPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectionTerminationPoint" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ConnectionTerminationPoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConnectionTerminationPoint", propOrder = {
    "connectionTerminationPoint"
})
public class ArrayOfConnectionTerminationPoint {

    @XmlElement(name = "ConnectionTerminationPoint", nillable = true)
    protected List<ConnectionTerminationPoint> connectionTerminationPoint;

    /**
     * Gets the value of the connectionTerminationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionTerminationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionTerminationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionTerminationPoint }
     * 
     * 
     */
    public List<ConnectionTerminationPoint> getConnectionTerminationPoint() {
        if (connectionTerminationPoint == null) {
            connectionTerminationPoint = new ArrayList<ConnectionTerminationPoint>();
        }
        return this.connectionTerminationPoint;
    }

}
