
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
 *         &lt;element name="CivicAddressValidationResult" type="{http://geo.domain.as.ctl.com/v2/Types/Response}CivicAddressValidationResponse" minOccurs="0"/>
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
    "civicAddressValidationResult"
})
@XmlRootElement(name = "CivicAddressValidationResponse")
public class CivicAddressValidationResponse {

    @XmlElementRef(name = "CivicAddressValidationResult", namespace = "http://geo.domain.as.ctl.com/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse> civicAddressValidationResult;

    /**
     * Gets the value of the civicAddressValidationResult property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse }{@code >}
     *
     */
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse> getCivicAddressValidationResult() {
        return civicAddressValidationResult;
    }

    /**
     * Sets the value of the civicAddressValidationResult property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse }{@code >}
     *
     */
    public void setCivicAddressValidationResult(JAXBElement<com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse> value) {
        this.civicAddressValidationResult = value;
    }

}
