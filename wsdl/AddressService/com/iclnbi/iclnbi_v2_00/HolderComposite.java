
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HolderComposite complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HolderComposite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}EquipmentHolder">
 *       &lt;sequence>
 *         &lt;element name="cableManagementStrategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mountingOptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceApproach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasHolders" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEquipmentHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HolderComposite", propOrder = {
    "cableManagementStrategy",
    "mountingOptions",
    "serviceApproach",
    "hasHolders"
})
@XmlSeeAlso({
    Shelf.class,
    SecureHolder.class
})
public class HolderComposite
    extends EquipmentHolder
{

    @XmlElementRef(name = "cableManagementStrategy", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cableManagementStrategy;
    protected Integer mountingOptions;
    @XmlElementRef(name = "serviceApproach", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceApproach;
    @XmlElementRef(name = "HasHolders", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentHolder> hasHolders;

    /**
     * Gets the value of the cableManagementStrategy property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCableManagementStrategy() {
        return cableManagementStrategy;
    }

    /**
     * Sets the value of the cableManagementStrategy property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCableManagementStrategy(JAXBElement<String> value) {
        this.cableManagementStrategy = value;
    }

    /**
     * Gets the value of the mountingOptions property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMountingOptions() {
        return mountingOptions;
    }

    /**
     * Sets the value of the mountingOptions property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMountingOptions(Integer value) {
        this.mountingOptions = value;
    }

    /**
     * Gets the value of the serviceApproach property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceApproach() {
        return serviceApproach;
    }

    /**
     * Sets the value of the serviceApproach property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceApproach(JAXBElement<String> value) {
        this.serviceApproach = value;
    }

    /**
     * Gets the value of the hasHolders property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEquipmentHolder }{@code >}
     *
     */
    public JAXBElement<ArrayOfEquipmentHolder> getHasHolders() {
        return hasHolders;
    }

    /**
     * Sets the value of the hasHolders property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEquipmentHolder }{@code >}
     *
     */
    public void setHasHolders(JAXBElement<ArrayOfEquipmentHolder> value) {
        this.hasHolders = value;
    }

}
