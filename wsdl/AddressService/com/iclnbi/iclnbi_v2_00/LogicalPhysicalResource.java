
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicalPhysicalResource complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LogicalPhysicalResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="typeOfLPDependency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PhysicalResource" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PhysicalResource" minOccurs="0"/>
 *         &lt;element name="PhysicalDevice" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PhysicalDevice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalPhysicalResource", propOrder = {
    "typeOfLPDependency",
    "physicalResource",
    "physicalDevice"
})
public class LogicalPhysicalResource
    extends Entity
{

    protected Integer typeOfLPDependency;
    @XmlElementRef(name = "PhysicalResource", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PhysicalResource> physicalResource;
    @XmlElementRef(name = "PhysicalDevice", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PhysicalDevice> physicalDevice;

    /**
     * Gets the value of the typeOfLPDependency property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeOfLPDependency() {
        return typeOfLPDependency;
    }

    /**
     * Sets the value of the typeOfLPDependency property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeOfLPDependency(Integer value) {
        this.typeOfLPDependency = value;
    }

    /**
     * Gets the value of the physicalResource property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PhysicalResource }{@code >}
     *
     */
    public JAXBElement<PhysicalResource> getPhysicalResource() {
        return physicalResource;
    }

    /**
     * Sets the value of the physicalResource property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PhysicalResource }{@code >}
     *
     */
    public void setPhysicalResource(JAXBElement<PhysicalResource> value) {
        this.physicalResource = value;
    }

    /**
     * Gets the value of the physicalDevice property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PhysicalDevice }{@code >}
     *
     */
    public JAXBElement<PhysicalDevice> getPhysicalDevice() {
        return physicalDevice;
    }

    /**
     * Sets the value of the physicalDevice property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PhysicalDevice }{@code >}
     *
     */
    public void setPhysicalDevice(JAXBElement<PhysicalDevice> value) {
        this.physicalDevice = value;
    }

}
