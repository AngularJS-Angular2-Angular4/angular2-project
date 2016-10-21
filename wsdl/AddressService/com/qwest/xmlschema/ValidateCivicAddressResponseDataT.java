
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateCivicAddressResponseDataT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ValidateCivicAddressResponseDataT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInfo" type="{http://www.qwest.com/XMLSchema}CustomerInfoT" minOccurs="0"/>
 *         &lt;element name="EchoRequest" type="{http://www.qwest.com/XMLSchema}EchoRequestT" minOccurs="0"/>
 *         &lt;element name="ExactMatch" type="{http://www.qwest.com/XMLSchema}ExactMatchT" minOccurs="0"/>
 *         &lt;element name="LocationInfoList" type="{http://www.qwest.com/XMLSchema}LocationInfoListT" minOccurs="0"/>
 *         &lt;element name="StatusResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCivicAddressResponseDataT", propOrder = {
    "customerInfo",
    "echoRequest",
    "exactMatch",
    "locationInfoList",
    "statusResult"
})
public class ValidateCivicAddressResponseDataT {

    @XmlElementRef(name = "CustomerInfo", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerInfoT> customerInfo;
    @XmlElementRef(name = "EchoRequest", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<EchoRequestT> echoRequest;
    @XmlElementRef(name = "ExactMatch", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ExactMatchT> exactMatch;
    @XmlElementRef(name = "LocationInfoList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationInfoListT> locationInfoList;
    @XmlElementRef(name = "StatusResult", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusResult;

    /**
     * Gets the value of the customerInfo property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CustomerInfoT }{@code >}
     *
     */
    public JAXBElement<CustomerInfoT> getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CustomerInfoT }{@code >}
     *
     */
    public void setCustomerInfo(JAXBElement<CustomerInfoT> value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the echoRequest property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link EchoRequestT }{@code >}
     *
     */
    public JAXBElement<EchoRequestT> getEchoRequest() {
        return echoRequest;
    }

    /**
     * Sets the value of the echoRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link EchoRequestT }{@code >}
     *
     */
    public void setEchoRequest(JAXBElement<EchoRequestT> value) {
        this.echoRequest = value;
    }

    /**
     * Gets the value of the exactMatch property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ExactMatchT }{@code >}
     *
     */
    public JAXBElement<ExactMatchT> getExactMatch() {
        return exactMatch;
    }

    /**
     * Sets the value of the exactMatch property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ExactMatchT }{@code >}
     *
     */
    public void setExactMatch(JAXBElement<ExactMatchT> value) {
        this.exactMatch = value;
    }

    /**
     * Gets the value of the locationInfoList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LocationInfoListT }{@code >}
     *
     */
    public JAXBElement<LocationInfoListT> getLocationInfoList() {
        return locationInfoList;
    }

    /**
     * Sets the value of the locationInfoList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LocationInfoListT }{@code >}
     *
     */
    public void setLocationInfoList(JAXBElement<LocationInfoListT> value) {
        this.locationInfoList = value;
    }

    /**
     * Gets the value of the statusResult property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStatusResult() {
        return statusResult;
    }

    /**
     * Sets the value of the statusResult property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStatusResult(JAXBElement<String> value) {
        this.statusResult = value;
    }

}
