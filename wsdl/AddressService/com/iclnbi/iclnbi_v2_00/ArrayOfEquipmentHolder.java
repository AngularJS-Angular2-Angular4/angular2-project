
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEquipmentHolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEquipmentHolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentHolder" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}EquipmentHolder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEquipmentHolder", propOrder = {
    "equipmentHolder"
})
public class ArrayOfEquipmentHolder {

    @XmlElement(name = "EquipmentHolder", nillable = true)
    protected List<EquipmentHolder> equipmentHolder;

    /**
     * Gets the value of the equipmentHolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentHolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentHolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentHolder }
     * 
     * 
     */
    public List<EquipmentHolder> getEquipmentHolder() {
        if (equipmentHolder == null) {
            equipmentHolder = new ArrayList<EquipmentHolder>();
        }
        return this.equipmentHolder;
    }

}
