
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplementalAddressT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SupplementalAddressT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Elevation" type="{http://www.qwest.com/XMLSchema}AddressDesignatorT" minOccurs="0"/>
 *         &lt;element name="Structure" type="{http://www.qwest.com/XMLSchema}AddressDesignatorT" minOccurs="0"/>
 *         &lt;element name="Unit" type="{http://www.qwest.com/XMLSchema}AddressDesignatorT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementalAddressT", propOrder = {
    "elevation",
    "structure",
    "unit"
})
public class SupplementalAddressT {

    @XmlElementRef(name = "Elevation", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressDesignatorT> elevation;
    @XmlElementRef(name = "Structure", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressDesignatorT> structure;
    @XmlElementRef(name = "Unit", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressDesignatorT> unit;

    /**
     * Gets the value of the elevation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressDesignatorT }{@code >}
     *
     */
    public JAXBElement<AddressDesignatorT> getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressDesignatorT }{@code >}
     *
     */
    public void setElevation(JAXBElement<AddressDesignatorT> value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the structure property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressDesignatorT }{@code >}
     *
     */
    public JAXBElement<AddressDesignatorT> getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressDesignatorT }{@code >}
     *
     */
    public void setStructure(JAXBElement<AddressDesignatorT> value) {
        this.structure = value;
    }

    /**
     * Gets the value of the unit property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressDesignatorT }{@code >}
     *
     */
    public JAXBElement<AddressDesignatorT> getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressDesignatorT }{@code >}
     *
     */
    public void setUnit(JAXBElement<AddressDesignatorT> value) {
        this.unit = value;
    }

}
