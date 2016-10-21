
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCalendarPartyRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCalendarPartyRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalendarPartyRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}CalendarPartyRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCalendarPartyRole", propOrder = {
    "calendarPartyRole"
})
public class ArrayOfCalendarPartyRole {

    @XmlElement(name = "CalendarPartyRole", nillable = true)
    protected List<CalendarPartyRole> calendarPartyRole;

    /**
     * Gets the value of the calendarPartyRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendarPartyRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendarPartyRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalendarPartyRole }
     * 
     * 
     */
    public List<CalendarPartyRole> getCalendarPartyRole() {
        if (calendarPartyRole == null) {
            calendarPartyRole = new ArrayList<CalendarPartyRole>();
        }
        return this.calendarPartyRole;
    }

}
