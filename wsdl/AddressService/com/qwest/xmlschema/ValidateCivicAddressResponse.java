
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ValidateCivicAddressResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ValidateCivicAddressResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ARTISInfoObject" type="{http://www.qwest.com/XMLSchema}ARTISInfoObject" minOccurs="0"/>
 *         &lt;element name="CompleteTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnDataSet" type="{http://www.qwest.com/XMLSchema}ValidateCivicAddressResponseDataT" minOccurs="0"/>
 *         &lt;element name="ServiceStatusObject" type="{http://www.qwest.com/XMLSchema}ServiceStatusObject" minOccurs="0"/>
 *         &lt;element name="TargetSchemaVersionUsed" type="{http://www.qwest.com/XMLSchema}SchemaVersionT" minOccurs="0"/>
 *         &lt;element name="WebServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCivicAddressResponse", propOrder = {
    "artisInfoObject",
    "completeTimeStamp",
    "requestId",
    "returnDataSet",
    "serviceStatusObject",
    "targetSchemaVersionUsed",
    "webServiceName"
})
public class ValidateCivicAddressResponse {

    @XmlElementRef(name = "ARTISInfoObject", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ARTISInfoObject> artisInfoObject;
    @XmlElement(name = "CompleteTimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completeTimeStamp;
    @XmlElementRef(name = "RequestId", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestId;
    @XmlElementRef(name = "ReturnDataSet", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ValidateCivicAddressResponseDataT> returnDataSet;
    @XmlElementRef(name = "ServiceStatusObject", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceStatusObject> serviceStatusObject;
    @XmlElementRef(name = "TargetSchemaVersionUsed", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<SchemaVersionT> targetSchemaVersionUsed;
    @XmlElementRef(name = "WebServiceName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webServiceName;

    /**
     * Gets the value of the artisInfoObject property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ARTISInfoObject }{@code >}
     *
     */
    public JAXBElement<ARTISInfoObject> getARTISInfoObject() {
        return artisInfoObject;
    }

    /**
     * Sets the value of the artisInfoObject property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ARTISInfoObject }{@code >}
     *
     */
    public void setARTISInfoObject(JAXBElement<ARTISInfoObject> value) {
        this.artisInfoObject = value;
    }

    /**
     * Gets the value of the completeTimeStamp property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCompleteTimeStamp() {
        return completeTimeStamp;
    }

    /**
     * Sets the value of the completeTimeStamp property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setCompleteTimeStamp(XMLGregorianCalendar value) {
        this.completeTimeStamp = value;
    }

    /**
     * Gets the value of the requestId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRequestId(JAXBElement<String> value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the returnDataSet property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ValidateCivicAddressResponseDataT }{@code >}
     *
     */
    public JAXBElement<ValidateCivicAddressResponseDataT> getReturnDataSet() {
        return returnDataSet;
    }

    /**
     * Sets the value of the returnDataSet property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ValidateCivicAddressResponseDataT }{@code >}
     *
     */
    public void setReturnDataSet(JAXBElement<ValidateCivicAddressResponseDataT> value) {
        this.returnDataSet = value;
    }

    /**
     * Gets the value of the serviceStatusObject property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ServiceStatusObject }{@code >}
     *
     */
    public JAXBElement<ServiceStatusObject> getServiceStatusObject() {
        return serviceStatusObject;
    }

    /**
     * Sets the value of the serviceStatusObject property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ServiceStatusObject }{@code >}
     *
     */
    public void setServiceStatusObject(JAXBElement<ServiceStatusObject> value) {
        this.serviceStatusObject = value;
    }

    /**
     * Gets the value of the targetSchemaVersionUsed property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SchemaVersionT }{@code >}
     *
     */
    public JAXBElement<SchemaVersionT> getTargetSchemaVersionUsed() {
        return targetSchemaVersionUsed;
    }

    /**
     * Sets the value of the targetSchemaVersionUsed property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SchemaVersionT }{@code >}
     *
     */
    public void setTargetSchemaVersionUsed(JAXBElement<SchemaVersionT> value) {
        this.targetSchemaVersionUsed = value;
    }

    /**
     * Gets the value of the webServiceName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getWebServiceName() {
        return webServiceName;
    }

    /**
     * Sets the value of the webServiceName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setWebServiceName(JAXBElement<String> value) {
        this.webServiceName = value;
    }

}
