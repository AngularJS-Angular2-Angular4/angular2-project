
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ServiceStatus;


/**
 * <p>Java class for AddressManagementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressManagementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceStatus" type="{http://geo.domain.as.ctl.com/Types}ServiceStatus"/>
 *         &lt;element name="TrackingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OverallDuration" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressManagementResponse", propOrder = {
    "version",
    "serviceStatus",
    "trackingId",
    "overallDuration"
})
@XmlSeeAlso({
    GetSubAddressesResponse.class,
    GetParsedAddressResponse.class,
    IsThisAddressServiceableResponse.class,
    ValidateCivicAddressProxyResponse.class,
    SubscriberAddressInquiryProxyResponse.class,
    CivicAddressValidationResponse.class,
    PostalAddressValidationResponse.class,
    GetServiceAddressLiveResponse.class,
    ClcSearchResourceProxyResponse.class,
    GetServiceAddressResponse.class
})
public class AddressManagementResponse {

    @XmlElement(name = "Version", required = true, nillable = true)
    protected String version;
    @XmlElement(name = "ServiceStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceStatus serviceStatus;
    @XmlElement(name = "TrackingId", required = true, nillable = true)
    protected String trackingId;
    @XmlElement(name = "OverallDuration")
    protected double overallDuration;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingId(String value) {
        this.trackingId = value;
    }

    /**
     * Gets the value of the overallDuration property.
     * 
     */
    public double getOverallDuration() {
        return overallDuration;
    }

    /**
     * Sets the value of the overallDuration property.
     * 
     */
    public void setOverallDuration(double value) {
        this.overallDuration = value;
    }

}
