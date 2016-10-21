
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicLocation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GeographicLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}GeographicPlace">
 *       &lt;sequence>
 *         &lt;element name="accuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geometry" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Geometry" minOccurs="0"/>
 *         &lt;element name="EllipticLocation" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Elliptic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicLocation", propOrder = {
    "accuracy",
    "geometry",
    "ellipticLocation"
})
@XmlSeeAlso({
    Country.class,
    ExchangeServiceArea.class
})
public class GeographicLocation
    extends GeographicPlace
{

    @XmlElementRef(name = "accuracy", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accuracy;
    @XmlElementRef(name = "geometry", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Geometry> geometry;
    @XmlElementRef(name = "EllipticLocation", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Elliptic> ellipticLocation;

    /**
     * Gets the value of the accuracy property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAccuracy(JAXBElement<String> value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the geometry property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Geometry }{@code >}
     *
     */
    public JAXBElement<Geometry> getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Geometry }{@code >}
     *
     */
    public void setGeometry(JAXBElement<Geometry> value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the ellipticLocation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Elliptic }{@code >}
     *
     */
    public JAXBElement<Elliptic> getEllipticLocation() {
        return ellipticLocation;
    }

    /**
     * Sets the value of the ellipticLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Elliptic }{@code >}
     *
     */
    public void setEllipticLocation(JAXBElement<Elliptic> value) {
        this.ellipticLocation = value;
    }

}
