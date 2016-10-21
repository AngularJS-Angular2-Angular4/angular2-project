
package com.ctl.as.domain.geo.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidateCivicAddressProxyResult" type="{http://geo.domain.as.ctl.com/v2/Types/Response}ValidateCivicAddressProxyResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validateCivicAddressProxyResult"
})
@XmlRootElement(name = "ValidateCivicAddressProxyResponse")
public class ValidateCivicAddressProxyResponse {

    @XmlElementRef(name = "ValidateCivicAddressProxyResult", namespace = "http://geo.domain.as.ctl.com/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse> validateCivicAddressProxyResult;

    /**
     * Gets the value of the validateCivicAddressProxyResult property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse }{@code >}
     *
     */
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse> getValidateCivicAddressProxyResult() {
        return validateCivicAddressProxyResult;
    }

    /**
     * Sets the value of the validateCivicAddressProxyResult property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse }{@code >}
     *
     */
    public void setValidateCivicAddressProxyResult(JAXBElement<com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse> value) {
        this.validateCivicAddressProxyResult = value;
    }

}
