
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Point2PointCircuit complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Point2PointCircuit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TopologicalLink">
 *       &lt;sequence>
 *         &lt;element name="transportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point2PointCircuit", propOrder = {
    "transportType",
    "cdd"
})
public class Point2PointCircuit
    extends TopologicalLink
{

    @XmlElementRef(name = "transportType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportType;
    @XmlElementRef(name = "CDD", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cdd;

    /**
     * Gets the value of the transportType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTransportType(JAXBElement<String> value) {
        this.transportType = value;
    }

    /**
     * Gets the value of the cdd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCDD() {
        return cdd;
    }

    /**
     * Sets the value of the cdd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCDD(JAXBElement<String> value) {
        this.cdd = value;
    }

}
