
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Place complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Place">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceLocatesResource" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Place", propOrder = {
    "id",
    "placeLocatesResource"
})
@XmlSeeAlso({
    LocalPlace.class,
    GeographicPlace.class
})
public class Place
    extends Entity
{

    @XmlElementRef(name = "id", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "PlaceLocatesResource", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResource> placeLocatesResource;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the placeLocatesResource property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResource }{@code >}
     *
     */
    public JAXBElement<ArrayOfResource> getPlaceLocatesResource() {
        return placeLocatesResource;
    }

    /**
     * Sets the value of the placeLocatesResource property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResource }{@code >}
     *
     */
    public void setPlaceLocatesResource(JAXBElement<ArrayOfResource> value) {
        this.placeLocatesResource = value;
    }

}
