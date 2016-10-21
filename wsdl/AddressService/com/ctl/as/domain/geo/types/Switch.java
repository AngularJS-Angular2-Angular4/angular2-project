
package com.ctl.as.domain.geo.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Switch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Switch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClliCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Switch", propOrder = {
    "clliCode",
    "equipmentType"
})
public class Switch {

    @XmlElementRef(name = "ClliCode", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clliCode;
    @XmlElementRef(name = "EquipmentType", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentType;

    /**
     * Gets the value of the clliCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getClliCode() {
        return clliCode;
    }

    /**
     * Sets the value of the clliCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setClliCode(JAXBElement<String> value) {
        this.clliCode = value;
    }

    /**
     * Gets the value of the equipmentType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEquipmentType(JAXBElement<String> value) {
        this.equipmentType = value;
    }

}
