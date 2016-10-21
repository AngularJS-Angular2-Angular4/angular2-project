
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rack complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Rack">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}SecureHolder">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heightInUs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="typeOfRack" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConsistsOfShelf" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfShelf" minOccurs="0"/>
 *         &lt;element name="AllowableShelf" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfShelf" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rack", propOrder = {
    "country",
    "heightInUs",
    "typeOfRack",
    "consistsOfShelf",
    "allowableShelf"
})
public class Rack
    extends SecureHolder
{

    @XmlElementRef(name = "country", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    protected Integer heightInUs;
    protected Integer typeOfRack;
    @XmlElementRef(name = "ConsistsOfShelf", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfShelf> consistsOfShelf;
    @XmlElementRef(name = "AllowableShelf", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfShelf> allowableShelf;

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the heightInUs property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getHeightInUs() {
        return heightInUs;
    }

    /**
     * Sets the value of the heightInUs property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setHeightInUs(Integer value) {
        this.heightInUs = value;
    }

    /**
     * Gets the value of the typeOfRack property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeOfRack() {
        return typeOfRack;
    }

    /**
     * Sets the value of the typeOfRack property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeOfRack(Integer value) {
        this.typeOfRack = value;
    }

    /**
     * Gets the value of the consistsOfShelf property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfShelf }{@code >}
     *
     */
    public JAXBElement<ArrayOfShelf> getConsistsOfShelf() {
        return consistsOfShelf;
    }

    /**
     * Sets the value of the consistsOfShelf property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfShelf }{@code >}
     *
     */
    public void setConsistsOfShelf(JAXBElement<ArrayOfShelf> value) {
        this.consistsOfShelf = value;
    }

    /**
     * Gets the value of the allowableShelf property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfShelf }{@code >}
     *
     */
    public JAXBElement<ArrayOfShelf> getAllowableShelf() {
        return allowableShelf;
    }

    /**
     * Sets the value of the allowableShelf property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfShelf }{@code >}
          *
     */
    public void setAllowableShelf(JAXBElement<ArrayOfShelf> value) {
        this.allowableShelf = value;
    }

}
