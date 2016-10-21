
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ManagedHardware">
 *       &lt;sequence>
 *         &lt;element name="hotSwappable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="removable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="replaceable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalContainer", propOrder = {
    "hotSwappable",
    "removable",
    "replaceable"
})
@XmlSeeAlso({
    Equipment.class,
    EquipmentHolder.class
})
public class PhysicalContainer
    extends ManagedHardware
{

    protected Boolean hotSwappable;
    protected Boolean removable;
    protected Boolean replaceable;

    /**
     * Gets the value of the hotSwappable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotSwappable() {
        return hotSwappable;
    }

    /**
     * Sets the value of the hotSwappable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotSwappable(Boolean value) {
        this.hotSwappable = value;
    }

    /**
     * Gets the value of the removable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemovable() {
        return removable;
    }

    /**
     * Sets the value of the removable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemovable(Boolean value) {
        this.removable = value;
    }

    /**
     * Gets the value of the replaceable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceable() {
        return replaceable;
    }

    /**
     * Sets the value of the replaceable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceable(Boolean value) {
        this.replaceable = value;
    }

}
