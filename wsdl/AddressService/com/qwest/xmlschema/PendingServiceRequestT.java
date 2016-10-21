
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingServiceRequestT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PendingServiceRequestT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.qwest.com/XMLSchema}PendingServiceRequestTActivity" minOccurs="0"/>
 *         &lt;element name="CustomerOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PendingStatus" type="{http://www.qwest.com/XMLSchema}ServiceRequestStatusT" minOccurs="0"/>
 *         &lt;element name="ServiceRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingServiceRequestT", propOrder = {
    "adsr",
    "activity",
    "customerOrderId",
    "dueDate",
    "pendingStatus",
    "serviceRequestId",
    "usoc"
})
public class PendingServiceRequestT {

    @XmlElementRef(name = "ADSR", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adsr;
    @XmlElement(name = "Activity")
    @XmlSchemaType(name = "string")
    protected PendingServiceRequestTActivity activity;
    @XmlElementRef(name = "CustomerOrderId", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerOrderId;
    @XmlElementRef(name = "DueDate", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dueDate;
    @XmlElement(name = "PendingStatus")
    @XmlSchemaType(name = "string")
    protected ServiceRequestStatusT pendingStatus;
    @XmlElementRef(name = "ServiceRequestId", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceRequestId;
    @XmlElementRef(name = "USOC", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usoc;

    /**
     * Gets the value of the adsr property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getADSR() {
        return adsr;
    }

    /**
     * Sets the value of the adsr property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setADSR(JAXBElement<String> value) {
        this.adsr = value;
    }

    /**
     * Gets the value of the activity property.
     *
     * @return
     *     possible object is
     *     {@link PendingServiceRequestTActivity }
     *
     */
    public PendingServiceRequestTActivity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     *
     * @param value
     *     allowed object is
     *     {@link PendingServiceRequestTActivity }
     *
     */
    public void setActivity(PendingServiceRequestTActivity value) {
        this.activity = value;
    }

    /**
     * Gets the value of the customerOrderId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCustomerOrderId() {
        return customerOrderId;
    }

    /**
     * Sets the value of the customerOrderId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCustomerOrderId(JAXBElement<String> value) {
        this.customerOrderId = value;
    }

    /**
     * Gets the value of the dueDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDueDate(JAXBElement<String> value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the pendingStatus property.
     *
     * @return
     *     possible object is
     *     {@link ServiceRequestStatusT }
     *
     */
    public ServiceRequestStatusT getPendingStatus() {
        return pendingStatus;
    }

    /**
     * Sets the value of the pendingStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceRequestStatusT }
     *
     */
    public void setPendingStatus(ServiceRequestStatusT value) {
        this.pendingStatus = value;
    }

    /**
     * Gets the value of the serviceRequestId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getServiceRequestId() {
        return serviceRequestId;
    }

    /**
     * Sets the value of the serviceRequestId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setServiceRequestId(JAXBElement<String> value) {
        this.serviceRequestId = value;
    }

    /**
     * Gets the value of the usoc property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getUSOC() {
        return usoc;
    }

    /**
     * Sets the value of the usoc property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setUSOC(JAXBElement<String> value) {
        this.usoc = value;
    }

}
