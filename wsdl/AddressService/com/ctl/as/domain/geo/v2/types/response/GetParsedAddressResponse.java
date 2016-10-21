
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfError;
import com.ctl.as.domain.geo.v2.types.ParsedAddress;


/**
 * <p>Java class for GetParsedAddressResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetParsedAddressResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types/Response}AddressManagementResponse">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://geo.domain.as.ctl.com/Types}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="ParsedAddress" type="{http://geo.domain.as.ctl.com/v2/Types}ParsedAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetParsedAddressResponse", propOrder = {
    "errors",
    "parsedAddress"
})
public class GetParsedAddressResponse
    extends AddressManagementResponse
{

    @XmlElementRef(name = "Errors", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfError> errors;
    @XmlElementRef(name = "ParsedAddress", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ParsedAddress> parsedAddress;

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
     * Gets the value of the parsedAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ParsedAddress }{@code >}
     *
     */
    public JAXBElement<ParsedAddress> getParsedAddress() {
        return parsedAddress;
    }

    /**
     * Sets the value of the parsedAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ParsedAddress }{@code >}
     *
     */
    public void setParsedAddress(JAXBElement<ParsedAddress> value) {
        this.parsedAddress = value;
    }

}
