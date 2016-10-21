
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPhysicalDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPhysicalDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhysicalDevice" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PhysicalDevice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalDevice", propOrder = {
    "physicalDevice"
})
public class ArrayOfPhysicalDevice {

    @XmlElement(name = "PhysicalDevice", nillable = true)
    protected List<PhysicalDevice> physicalDevice;

    /**
     * Gets the value of the physicalDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalDevice }
     * 
     * 
     */
    public List<PhysicalDevice> getPhysicalDevice() {
        if (physicalDevice == null) {
            physicalDevice = new ArrayList<PhysicalDevice>();
        }
        return this.physicalDevice;
    }

}
