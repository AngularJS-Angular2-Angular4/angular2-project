
package com.qwest.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExtPendingServiceRequestT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExtPendingServiceRequestT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtPendingServiceRequestT" type="{http://www.qwest.com/XMLSchema}ExtPendingServiceRequestT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtPendingServiceRequestT", propOrder = {
    "extPendingServiceRequestT"
})
public class ArrayOfExtPendingServiceRequestT {

    @XmlElement(name = "ExtPendingServiceRequestT", nillable = true)
    protected List<ExtPendingServiceRequestT> extPendingServiceRequestT;

    /**
     * Gets the value of the extPendingServiceRequestT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extPendingServiceRequestT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtPendingServiceRequestT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtPendingServiceRequestT }
     * 
     * 
     */
    public List<ExtPendingServiceRequestT> getExtPendingServiceRequestT() {
        if (extPendingServiceRequestT == null) {
            extPendingServiceRequestT = new ArrayList<ExtPendingServiceRequestT>();
        }
        return this.extPendingServiceRequestT;
    }

}
