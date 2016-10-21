
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfError;
import org.w3.namespace.SubscriberAddressInquiryReply;


/**
 * <p>Java class for SubscriberAddressInquiryProxyResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SubscriberAddressInquiryProxyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types/Response}AddressManagementResponse">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://geo.domain.as.ctl.com/Types}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="SubscriberAddressInquiryReply" type="{http://www.w3.org/namespace/}subscriberAddressInquiryReply" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAddressInquiryProxyResponse", propOrder = {
    "errors",
    "subscriberAddressInquiryReply"
})
public class SubscriberAddressInquiryProxyResponse
    extends AddressManagementResponse
{

    @XmlElementRef(name = "Errors", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfError> errors;
    @XmlElementRef(name = "SubscriberAddressInquiryReply", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<SubscriberAddressInquiryReply> subscriberAddressInquiryReply;

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
     * Gets the value of the subscriberAddressInquiryReply property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SubscriberAddressInquiryReply }{@code >}
     *
     */
    public JAXBElement<SubscriberAddressInquiryReply> getSubscriberAddressInquiryReply() {
        return subscriberAddressInquiryReply;
    }

    /**
     * Sets the value of the subscriberAddressInquiryReply property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SubscriberAddressInquiryReply }{@code >}
     *
     */
    public void setSubscriberAddressInquiryReply(JAXBElement<SubscriberAddressInquiryReply> value) {
        this.subscriberAddressInquiryReply = value;
    }

}
