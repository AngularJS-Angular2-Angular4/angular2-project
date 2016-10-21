
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for NeighborMatchT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NeighborMatchT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HouseNumberList" type="{http://www.qwest.com/XMLSchema}ArrayOfHouseNumber" minOccurs="0"/>
 *         &lt;element name="QwestHouseNumberList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ServiceLocationCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighborMatchT", propOrder = {
    "houseNumberList",
    "qwestHouseNumberList",
    "serviceLocationCount"
})
public class NeighborMatchT {

    @XmlElementRef(name = "HouseNumberList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHouseNumber> houseNumberList;
    @XmlElementRef(name = "QwestHouseNumberList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> qwestHouseNumberList;
    @XmlElementRef(name = "ServiceLocationCount", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationCount;

    /**
     * Gets the value of the houseNumberList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfHouseNumber }{@code >}
     *
     */
    public JAXBElement<ArrayOfHouseNumber> getHouseNumberList() {
        return houseNumberList;
    }

    /**
     * Sets the value of the houseNumberList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfHouseNumber }{@code >}
     *
     */
    public void setHouseNumberList(JAXBElement<ArrayOfHouseNumber> value) {
        this.houseNumberList = value;
    }

    /**
     * Gets the value of the qwestHouseNumberList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getQwestHouseNumberList() {
        return qwestHouseNumberList;
    }

    /**
     * Sets the value of the qwestHouseNumberList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setQwestHouseNumberList(JAXBElement<ArrayOfstring> value) {
        this.qwestHouseNumberList = value;
    }

    /**
     * Gets the value of the serviceLocationCount property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceLocationCount() {
        return serviceLocationCount;
    }

    /**
     * Sets the value of the serviceLocationCount property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceLocationCount(JAXBElement<String> value) {
        this.serviceLocationCount = value;
    }

}
