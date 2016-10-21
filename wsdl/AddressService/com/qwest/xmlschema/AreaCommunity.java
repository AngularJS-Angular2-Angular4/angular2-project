
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaCommunity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AreaCommunity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Area" type="{http://www.qwest.com/XMLSchema}AreaT" minOccurs="0"/>
 *         &lt;element name="Community" type="{http://www.qwest.com/XMLSchema}CommunityT" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.qwest.com/XMLSchema}QwestStreetInfoT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaCommunity", propOrder = {
    "area",
    "community",
    "street"
})
public class AreaCommunity {

    @XmlElement(name = "Area")
    @XmlSchemaType(name = "string")
    protected AreaT area;
    @XmlElementRef(name = "Community", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CommunityT> community;
    @XmlElementRef(name = "Street", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<QwestStreetInfoT> street;

    /**
     * Gets the value of the area property.
     *
     * @return
     *     possible object is
     *     {@link AreaT }
     *
     */
    public AreaT getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value
     *     allowed object is
     *     {@link AreaT }
     *
     */
    public void setArea(AreaT value) {
        this.area = value;
    }

    /**
     * Gets the value of the community property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CommunityT }{@code >}
     *
     */
    public JAXBElement<CommunityT> getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CommunityT }{@code >}
     *
     */
    public void setCommunity(JAXBElement<CommunityT> value) {
        this.community = value;
    }

    /**
     * Gets the value of the street property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link QwestStreetInfoT }{@code >}
     *
     */
    public JAXBElement<QwestStreetInfoT> getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link QwestStreetInfoT }{@code >}
     *
     */
    public void setStreet(JAXBElement<QwestStreetInfoT> value) {
        this.street = value;
    }

}
