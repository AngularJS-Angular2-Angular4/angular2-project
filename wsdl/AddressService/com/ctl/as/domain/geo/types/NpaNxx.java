
package com.ctl.as.domain.geo.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NpaNxx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NpaNxx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Npa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nxx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NpaNxx", propOrder = {
    "npa",
    "nxx"
})
public class NpaNxx {

    @XmlElement(name = "Npa")
    protected Integer npa;
    @XmlElement(name = "Nxx")
    protected Integer nxx;

    /**
     * Gets the value of the npa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNpa() {
        return npa;
    }

    /**
     * Sets the value of the npa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNpa(Integer value) {
        this.npa = value;
    }

    /**
     * Gets the value of the nxx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNxx() {
        return nxx;
    }

    /**
     * Sets the value of the nxx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNxx(Integer value) {
        this.nxx = value;
    }

}
