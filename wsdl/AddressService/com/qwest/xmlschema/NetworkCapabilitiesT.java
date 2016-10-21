
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkCapabilitiesT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NetworkCapabilitiesT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EffectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneVideoInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCapabilitiesT", propOrder = {
    "effectDate",
    "networkStatus",
    "telephoneVideoInd"
})
public class NetworkCapabilitiesT {

    @XmlElementRef(name = "EffectDate", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> effectDate;
    @XmlElementRef(name = "NetworkStatus", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkStatus;
    @XmlElementRef(name = "TelephoneVideoInd", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telephoneVideoInd;

    /**
     * Gets the value of the effectDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEffectDate() {
        return effectDate;
    }

    /**
     * Sets the value of the effectDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEffectDate(JAXBElement<String> value) {
        this.effectDate = value;
    }

    /**
     * Gets the value of the networkStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNetworkStatus() {
        return networkStatus;
    }

    /**
     * Sets the value of the networkStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNetworkStatus(JAXBElement<String> value) {
        this.networkStatus = value;
    }

    /**
     * Gets the value of the telephoneVideoInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTelephoneVideoInd() {
        return telephoneVideoInd;
    }

    /**
     * Sets the value of the telephoneVideoInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTelephoneVideoInd(JAXBElement<String> value) {
        this.telephoneVideoInd = value;
    }

}
