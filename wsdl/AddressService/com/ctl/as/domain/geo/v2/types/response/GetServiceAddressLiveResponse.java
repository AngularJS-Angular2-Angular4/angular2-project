
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfError;
import com.ctl.as.domain.geo.types.SearchResult;
import com.ctl.as.domain.geo.v2.types.ArrayOfServiceAddress;


/**
 * <p>Java class for GetServiceAddressLiveResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetServiceAddressLiveResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types/Response}AddressManagementResponse">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://geo.domain.as.ctl.com/Types}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://geo.domain.as.ctl.com/Types}SearchResult" minOccurs="0"/>
 *         &lt;element name="ServiceAddresses" type="{http://geo.domain.as.ctl.com/v2/Types}ArrayOfServiceAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceAddressLiveResponse", propOrder = {
    "errors",
    "result",
    "serviceAddresses"
})
public class GetServiceAddressLiveResponse
    extends AddressManagementResponse
{

    @XmlElementRef(name = "Errors", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfError> errors;
    @XmlElementRef(name = "Result", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchResult> result;
    @XmlElementRef(name = "ServiceAddresses", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceAddress> serviceAddresses;

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
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResult }{@code >}
     *
     */
    public JAXBElement<SearchResult> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResult }{@code >}
     *
     */
    public void setResult(JAXBElement<SearchResult> value) {
        this.result = value;
    }

    /**
     * Gets the value of the serviceAddresses property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceAddress }{@code >}
     *
     */
    public JAXBElement<ArrayOfServiceAddress> getServiceAddresses() {
        return serviceAddresses;
    }

    /**
     * Sets the value of the serviceAddresses property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceAddress }{@code >}
     *
     */
    public void setServiceAddresses(JAXBElement<ArrayOfServiceAddress> value) {
        this.serviceAddresses = value;
    }

}
