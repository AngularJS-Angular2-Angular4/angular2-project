
package com.ctl.as.domain.geo.types.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.v2.types.request.CivicAddressValidationRequest;
import com.ctl.as.domain.geo.v2.types.request.PostalAddressValidationRequest;


/**
 * <p>Java class for AddressManagementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressManagementRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressManagementRequest", propOrder = {
    "clientId"
})
@XmlSeeAlso({
    ClcSearchResourceProxyRequest.class,
    IsThisAddressServiceableRequest.class,
    GetServiceAddressRequest.class,
    CivicAddressValidationRequest.class,
    PostalAddressValidationRequest.class,
    GetServiceAddressLiveRequest.class,
    SubscriberAddressInquiryProxyRequest.class,
    GetParsedAddressRequest.class,
    GetSubAddressesRequest.class,
    ValidateCivicAddressProxyRequest.class
})
public class AddressManagementRequest {

    @XmlElement(name = "ClientId", required = true, nillable = true)
    protected String clientId;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

}
