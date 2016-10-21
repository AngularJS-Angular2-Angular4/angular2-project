
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoConnectionT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VideoConnectionT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressConnection" type="{http://www.qwest.com/XMLSchema}AddressConnectionT" minOccurs="0"/>
 *         &lt;element name="VideoPortId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoConnectionT", propOrder = {
    "addressConnection",
    "videoPortId"
})
public class VideoConnectionT {

    @XmlElementRef(name = "AddressConnection", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressConnectionT> addressConnection;
    @XmlElementRef(name = "VideoPortId", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> videoPortId;

    /**
     * Gets the value of the addressConnection property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressConnectionT }{@code >}
     *
     */
    public JAXBElement<AddressConnectionT> getAddressConnection() {
        return addressConnection;
    }

    /**
     * Sets the value of the addressConnection property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressConnectionT }{@code >}
     *
     */
    public void setAddressConnection(JAXBElement<AddressConnectionT> value) {
        this.addressConnection = value;
    }

    /**
     * Gets the value of the videoPortId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVideoPortId() {
        return videoPortId;
    }

    /**
     * Sets the value of the videoPortId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVideoPortId(JAXBElement<String> value) {
        this.videoPortId = value;
    }

}
