
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfError;
import com.qwest.xmlschema.ValidateCivicAddressResponse;


/**
 * <p>Java class for ValidateCivicAddressProxyResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ValidateCivicAddressProxyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types/Response}AddressManagementResponse">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://geo.domain.as.ctl.com/Types}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="ValidateCivicAddressResponse" type="{http://www.qwest.com/XMLSchema}ValidateCivicAddressResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCivicAddressProxyResponse", propOrder = {
    "errors",
    "validateCivicAddressResponse"
})
public class ValidateCivicAddressProxyResponse
    extends AddressManagementResponse
{

    @XmlElementRef(name = "Errors", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfError> errors;
    @XmlElementRef(name = "ValidateCivicAddressResponse", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ValidateCivicAddressResponse> validateCivicAddressResponse;

    /**
     * Gets the value of the errors property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}
     *
     */
    public JAXBElement<ArrayOfError> getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}
     *
     */
    public void setErrors(JAXBElement<ArrayOfError> value) {
        this.errors = value;
    }

    /**
     * Gets the value of the validateCivicAddressResponse property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ValidateCivicAddressResponse }{@code >}
     *
     */
    public JAXBElement<ValidateCivicAddressResponse> getValidateCivicAddressResponse() {
        return validateCivicAddressResponse;
    }

    /**
     * Sets the value of the validateCivicAddressResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ValidateCivicAddressResponse }{@code >}
     *
     */
    public void setValidateCivicAddressResponse(JAXBElement<ValidateCivicAddressResponse> value) {
        this.validateCivicAddressResponse = value;
    }

}
