
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hardware complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Hardware">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PhysicalResource">
 *       &lt;sequence>
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurementUnits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weightUnits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContainsHardware" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfHardware" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hardware", propOrder = {
    "depth",
    "height",
    "measurementUnits",
    "weight",
    "weightUnits",
    "width",
    "containsHardware"
})
@XmlSeeAlso({
    ManagedHardware.class
})
public class Hardware
    extends PhysicalResource
{

    @XmlElementRef(name = "depth", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depth;
    @XmlElementRef(name = "height", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> height;
    protected Integer measurementUnits;
    @XmlElementRef(name = "weight", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> weight;
    protected Integer weightUnits;
    @XmlElementRef(name = "width", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> width;
    @XmlElementRef(name = "ContainsHardware", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHardware> containsHardware;

    /**
     * Gets the value of the depth property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDepth(JAXBElement<String> value) {
        this.depth = value;
    }

    /**
     * Gets the value of the height property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setHeight(JAXBElement<String> value) {
        this.height = value;
    }

    /**
     * Gets the value of the measurementUnits property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMeasurementUnits() {
        return measurementUnits;
    }

    /**
     * Sets the value of the measurementUnits property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMeasurementUnits(Integer value) {
        this.measurementUnits = value;
    }

    /**
     * Gets the value of the weight property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setWeight(JAXBElement<String> value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightUnits property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getWeightUnits() {
        return weightUnits;
    }

    /**
     * Sets the value of the weightUnits property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setWeightUnits(Integer value) {
        this.weightUnits = value;
    }

    /**
     * Gets the value of the width property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setWidth(JAXBElement<String> value) {
        this.width = value;
    }

    /**
     * Gets the value of the containsHardware property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfHardware }{@code >}
     *
     */
         public JAXBElement<ArrayOfHardware> getContainsHardware() {
        return containsHardware;
    }

    /**
     * Sets the value of the containsHardware property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfHardware }{@code >}
     *
     */
         public void setContainsHardware(JAXBElement<ArrayOfHardware> value) {
        this.containsHardware = value;
    }

}
