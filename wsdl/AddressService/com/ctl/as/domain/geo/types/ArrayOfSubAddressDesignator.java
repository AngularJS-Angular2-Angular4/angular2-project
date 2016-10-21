
package com.ctl.as.domain.geo.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSubAddressDesignator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubAddressDesignator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubAddressDesignator" type="{http://geo.domain.as.ctl.com/Types}SubAddressDesignator" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubAddressDesignator", propOrder = {
    "subAddressDesignator"
})
public class ArrayOfSubAddressDesignator {

    @XmlElement(name = "SubAddressDesignator", nillable = true)
    protected List<SubAddressDesignator> subAddressDesignator;

    /**
     * Gets the value of the subAddressDesignator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAddressDesignator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAddressDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAddressDesignator }
     * 
     * 
     */
    public List<SubAddressDesignator> getSubAddressDesignator() {
        if (subAddressDesignator == null) {
            subAddressDesignator = new ArrayList<SubAddressDesignator>();
        }
        return this.subAddressDesignator;
    }

}
