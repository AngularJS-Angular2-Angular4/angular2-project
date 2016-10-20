
package com.ctl.ecaps.service.enterpriseadmin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getActiveEnterprisesByName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getActiveEnterprisesByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterpriseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enterpriseChannels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getActiveEnterprisesByName", propOrder = {
    "enterpriseName",
    "enterpriseChannels"
})
public class GetActiveEnterprisesByName {

    @XmlElement(required = true)
    protected String enterpriseName;
    protected List<String> enterpriseChannels;

    /**
     * Gets the value of the enterpriseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * Sets the value of the enterpriseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseName(String value) {
        this.enterpriseName = value;
    }

    /**
     * Gets the value of the enterpriseChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enterpriseChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnterpriseChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnterpriseChannels() {
        if (enterpriseChannels == null) {
            enterpriseChannels = new ArrayList<String>();
        }
        return this.enterpriseChannels;
    }

}
