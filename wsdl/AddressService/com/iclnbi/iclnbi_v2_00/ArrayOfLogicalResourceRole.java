
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLogicalResourceRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLogicalResourceRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalResourceRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResourceRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLogicalResourceRole", propOrder = {
    "logicalResourceRole"
})
public class ArrayOfLogicalResourceRole {

    @XmlElement(name = "LogicalResourceRole", nillable = true)
    protected List<LogicalResourceRole> logicalResourceRole;

    /**
     * Gets the value of the logicalResourceRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalResourceRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalResourceRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalResourceRole }
     * 
     * 
     */
    public List<LogicalResourceRole> getLogicalResourceRole() {
        if (logicalResourceRole == null) {
            logicalResourceRole = new ArrayList<LogicalResourceRole>();
        }
        return this.logicalResourceRole;
    }

}
