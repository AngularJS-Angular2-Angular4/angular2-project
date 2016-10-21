
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HolderAtomic complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HolderAtomic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}EquipmentHolder">
 *       &lt;sequence>
 *         &lt;element name="physicalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uniquePhysical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HolderAtomic", propOrder = {
    "physicalDescription",
    "uniquePhysical"
})
@XmlSeeAlso({
    Slot.class
})
public class HolderAtomic
    extends EquipmentHolder
{

    @XmlElementRef(name = "physicalDescription", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> physicalDescription;
    protected Boolean uniquePhysical;

    /**
     * Gets the value of the physicalDescription property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPhysicalDescription() {
        return physicalDescription;
    }

    /**
     * Sets the value of the physicalDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPhysicalDescription(JAXBElement<String> value) {
        this.physicalDescription = value;
    }

    /**
     * Gets the value of the uniquePhysical property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isUniquePhysical() {
        return uniquePhysical;
    }

    /**
     * Sets the value of the uniquePhysical property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setUniquePhysical(Boolean value) {
        this.uniquePhysical = value;
    }

}
