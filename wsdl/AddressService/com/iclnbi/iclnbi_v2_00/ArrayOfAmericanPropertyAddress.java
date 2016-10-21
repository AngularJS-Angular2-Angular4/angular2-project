
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAmericanPropertyAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAmericanPropertyAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmericanPropertyAddress" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}AmericanPropertyAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAmericanPropertyAddress", propOrder = {
    "americanPropertyAddress"
})
public class ArrayOfAmericanPropertyAddress {

    @XmlElement(name = "AmericanPropertyAddress", nillable = true)
    protected List<AmericanPropertyAddress> americanPropertyAddress;

    /**
     * Gets the value of the americanPropertyAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the americanPropertyAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmericanPropertyAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmericanPropertyAddress }
     * 
     * 
     */
    public List<AmericanPropertyAddress> getAmericanPropertyAddress() {
        if (americanPropertyAddress == null) {
            americanPropertyAddress = new ArrayList<AmericanPropertyAddress>();
        }
        return this.americanPropertyAddress;
    }

}
