
package com.ctl.as.domain.geo.types.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfSubAddressDesignator;
import com.ctl.as.domain.geo.types.ParsedStreetAddress;


/**
 * <p>Java class for ValidateCivicAddressProxyRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ValidateCivicAddressProxyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/Types/Request}AddressManagementRequest">
 *       &lt;sequence>
 *         &lt;element name="ParsedStreetAddress" type="{http://geo.domain.as.ctl.com/Types}ParsedStreetAddress" minOccurs="0"/>
 *         &lt;element name="ParsedSubAddress" type="{http://geo.domain.as.ctl.com/Types}ArrayOfSubAddressDesignator" minOccurs="0"/>
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCivicAddressProxyRequest", propOrder = {
    "parsedStreetAddress",
    "parsedSubAddress",
    "locality",
    "stateOrProvince",
    "postCode"
})
public class ValidateCivicAddressProxyRequest
    extends AddressManagementRequest
{

    @XmlElementRef(name = "ParsedStreetAddress", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ParsedStreetAddress> parsedStreetAddress;
    @XmlElementRef(name = "ParsedSubAddress", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubAddressDesignator> parsedSubAddress;
    @XmlElementRef(name = "Locality", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locality;
    @XmlElementRef(name = "StateOrProvince", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateOrProvince;
    @XmlElementRef(name = "PostCode", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;

    /**
     * Gets the value of the parsedStreetAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ParsedStreetAddress }{@code >}
     *
     */
    public JAXBElement<ParsedStreetAddress> getParsedStreetAddress() {
        return parsedStreetAddress;
    }

    /**
     * Sets the value of the parsedStreetAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ParsedStreetAddress }{@code >}
     *
     */
    public void setParsedStreetAddress(JAXBElement<ParsedStreetAddress> value) {
        this.parsedStreetAddress = value;
    }

    /**
     * Gets the value of the parsedSubAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddressDesignator }{@code >}
     *
     */
    public JAXBElement<ArrayOfSubAddressDesignator> getParsedSubAddress() {
        return parsedSubAddress;
    }

    /**
     * Sets the value of the parsedSubAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddressDesignator }{@code >}
     *
     */
    public void setParsedSubAddress(JAXBElement<ArrayOfSubAddressDesignator> value) {
        this.parsedSubAddress = value;
    }

    /**
     * Gets the value of the locality property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLocality(JAXBElement<String> value) {
        this.locality = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStateOrProvince(JAXBElement<String> value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the postCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = value;
    }

}
