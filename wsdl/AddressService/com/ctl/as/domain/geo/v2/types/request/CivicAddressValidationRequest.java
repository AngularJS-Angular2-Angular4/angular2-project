
package com.ctl.as.domain.geo.v2.types.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.request.AddressManagementRequest;


/**
 * <p>Java class for CivicAddressValidationRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CivicAddressValidationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/Types/Request}AddressManagementRequest">
 *       &lt;sequence>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CivicAddressValidationRequest", propOrder = {
    "addressLine1",
    "locality",
    "stateOrProvince",
    "postCode"
})
public class CivicAddressValidationRequest
    extends AddressManagementRequest
{

    @XmlElementRef(name = "AddressLine1", namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "Locality", namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locality;
    @XmlElementRef(name = "StateOrProvince", namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateOrProvince;
    @XmlElementRef(name = "PostCode", namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;

    /**
     * Gets the value of the addressLine1 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = value;
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
