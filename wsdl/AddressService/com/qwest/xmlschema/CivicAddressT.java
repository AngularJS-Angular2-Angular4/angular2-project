
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CivicAddressT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CivicAddressT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConcatenatedAddress" type="{http://www.qwest.com/XMLSchema}ConcatenatedAddressT" minOccurs="0"/>
 *         &lt;element name="DescriptiveAddress" type="{http://www.qwest.com/XMLSchema}UnnumberedAddressT" minOccurs="0"/>
 *         &lt;element name="NumberedAddress" type="{http://www.qwest.com/XMLSchema}NumberedAddressT" minOccurs="0"/>
 *         &lt;element name="QwestAddress" type="{http://www.qwest.com/XMLSchema}QwestAddressT" minOccurs="0"/>
 *         &lt;element name="UnnumberedAddress" type="{http://www.qwest.com/XMLSchema}UnnumberedAddressT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CivicAddressT", propOrder = {
    "concatenatedAddress",
    "descriptiveAddress",
    "numberedAddress",
    "qwestAddress",
    "unnumberedAddress"
})
public class CivicAddressT {

    @XmlElementRef(name = "ConcatenatedAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ConcatenatedAddressT> concatenatedAddress;
    @XmlElementRef(name = "DescriptiveAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<UnnumberedAddressT> descriptiveAddress;
    @XmlElementRef(name = "NumberedAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<NumberedAddressT> numberedAddress;
    @XmlElementRef(name = "QwestAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<QwestAddressT> qwestAddress;
    @XmlElementRef(name = "UnnumberedAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<UnnumberedAddressT> unnumberedAddress;

    /**
     * Gets the value of the concatenatedAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ConcatenatedAddressT }{@code >}
     *
     */
    public JAXBElement<ConcatenatedAddressT> getConcatenatedAddress() {
        return concatenatedAddress;
    }

    /**
     * Sets the value of the concatenatedAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ConcatenatedAddressT }{@code >}
     *
     */
    public void setConcatenatedAddress(JAXBElement<ConcatenatedAddressT> value) {
        this.concatenatedAddress = value;
    }

    /**
     * Gets the value of the descriptiveAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link UnnumberedAddressT }{@code >}
     *
     */
    public JAXBElement<UnnumberedAddressT> getDescriptiveAddress() {
        return descriptiveAddress;
    }

    /**
     * Sets the value of the descriptiveAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link UnnumberedAddressT }{@code >}
     *
     */
    public void setDescriptiveAddress(JAXBElement<UnnumberedAddressT> value) {
        this.descriptiveAddress = value;
    }

    /**
     * Gets the value of the numberedAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NumberedAddressT }{@code >}
     *
     */
    public JAXBElement<NumberedAddressT> getNumberedAddress() {
        return numberedAddress;
    }

    /**
     * Sets the value of the numberedAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NumberedAddressT }{@code >}
     *
     */
    public void setNumberedAddress(JAXBElement<NumberedAddressT> value) {
        this.numberedAddress = value;
    }

    /**
     * Gets the value of the qwestAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link QwestAddressT }{@code >}
     *
     */
    public JAXBElement<QwestAddressT> getQwestAddress() {
        return qwestAddress;
    }

    /**
     * Sets the value of the qwestAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link QwestAddressT }{@code >}
     *
     */
    public void setQwestAddress(JAXBElement<QwestAddressT> value) {
        this.qwestAddress = value;
    }

    /**
     * Gets the value of the unnumberedAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link UnnumberedAddressT }{@code >}
     *
     */
    public JAXBElement<UnnumberedAddressT> getUnnumberedAddress() {
        return unnumberedAddress;
    }

    /**
     * Sets the value of the unnumberedAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link UnnumberedAddressT }{@code >}
     *
     */
    public void setUnnumberedAddress(JAXBElement<UnnumberedAddressT> value) {
        this.unnumberedAddress = value;
    }

}
