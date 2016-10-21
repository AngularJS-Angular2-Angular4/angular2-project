
package com.ctl.as.domain.geo.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.v2.types.GeoPointSource;


/**
 * <p>Java class for GeoPoint complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GeoPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://geo.domain.as.ctl.com/v2/Types}GeoPointSource" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CoordinateLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Elevation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Horizontal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Vertical" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoPoint", propOrder = {
    "source",
    "latitude",
    "longitude",
    "coordinateLevel",
    "accuracy",
    "elevation",
    "horizontal",
    "vertical"
})
public class GeoPoint {

    @XmlElement(name = "Source")
    @XmlSchemaType(name = "string")
    protected GeoPointSource source;
    @XmlElement(name = "Latitude")
    protected Double latitude;
    @XmlElement(name = "Longitude")
    protected Double longitude;
    @XmlElementRef(name = "CoordinateLevel", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coordinateLevel;
    @XmlElementRef(name = "Accuracy", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accuracy;
    @XmlElement(name = "Elevation")
    protected Double elevation;
    @XmlElement(name = "Horizontal")
    protected Double horizontal;
    @XmlElement(name = "Vertical")
    protected Double vertical;

    /**
     * Gets the value of the source property.
     *
     * @return
     *     possible object is
     *     {@link GeoPointSource }
     *
     */
    public GeoPointSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     *
     * @param value
     *     allowed object is
     *     {@link GeoPointSource }
     *
     */
    public void setSource(GeoPointSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the latitude property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the coordinateLevel property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCoordinateLevel() {
        return coordinateLevel;
    }

    /**
     * Sets the value of the coordinateLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCoordinateLevel(JAXBElement<String> value) {
        this.coordinateLevel = value;
    }

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
     * Gets the value of the elevation property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setElevation(Double value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the horizontal property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getHorizontal() {
        return horizontal;
    }

    /**
     * Sets the value of the horizontal property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setHorizontal(Double value) {
        this.horizontal = value;
    }

    /**
     * Gets the value of the vertical property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getVertical() {
        return vertical;
    }

    /**
     * Sets the value of the vertical property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setVertical(Double value) {
        this.vertical = value;
    }

}
