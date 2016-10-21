
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneConnectionT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TelephoneConnectionT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressConnection" type="{http://www.qwest.com/XMLSchema}AddressConnectionT" minOccurs="0"/>
 *         &lt;element name="CTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassOfService" type="{http://www.qwest.com/XMLSchema}TelephoneConnectionTClassOfService" minOccurs="0"/>
 *         &lt;element name="ConnectionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtAdministeredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NonPublishedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PlugType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://www.qwest.com/XMLSchema}BaseTNType" minOccurs="0"/>
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
@XmlType(name = "TelephoneConnectionT", propOrder = {
    "adsr",
    "addressConnection",
    "ctid",
    "classOfService",
    "connectionStatus",
    "customerName",
    "extAdministeredInd",
    "nonPublishedInd",
    "plugType",
    "telephoneNumber",
    "usoc"
})
public class TelephoneConnectionT {

    @XmlElementRef(name = "ADSR", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adsr;
    @XmlElementRef(name = "AddressConnection", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressConnectionT> addressConnection;
    @XmlElementRef(name = "CTID", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ctid;
    @XmlElement(name = "ClassOfService")
    @XmlSchemaType(name = "string")
    protected TelephoneConnectionTClassOfService classOfService;
    @XmlElementRef(name = "ConnectionStatus", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> connectionStatus;
    @XmlElementRef(name = "CustomerName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerName;
    @XmlElement(name = "ExtAdministeredInd")
    protected Boolean extAdministeredInd;
    @XmlElement(name = "NonPublishedInd")
    protected Boolean nonPublishedInd;
    @XmlElementRef(name = "PlugType", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plugType;
    @XmlElementRef(name = "TelephoneNumber", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseTNType> telephoneNumber;
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
     * Gets the value of the addressConnection property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressConnectionT }{@code >}
     *
     */
    public JAXBElement<AddressConnectionT> getAddressConnection() {
        return addressConnection;
    }

    /**
     * Sets the value of the addressConnection property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressConnectionT }{@code >}
     *
     */
    public void setAddressConnection(JAXBElement<AddressConnectionT> value) {
        this.addressConnection = value;
    }

    /**
     * Gets the value of the ctid property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCTID() {
        return ctid;
    }

    /**
     * Sets the value of the ctid property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCTID(JAXBElement<String> value) {
        this.ctid = value;
    }

    /**
     * Gets the value of the classOfService property.
     *
     * @return
     *     possible object is
     *     {@link TelephoneConnectionTClassOfService }
     *
     */
    public TelephoneConnectionTClassOfService getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     *
     * @param value
     *     allowed object is
     *     {@link TelephoneConnectionTClassOfService }
     *
     */
    public void setClassOfService(TelephoneConnectionTClassOfService value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the connectionStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * Sets the value of the connectionStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setConnectionStatus(JAXBElement<String> value) {
        this.connectionStatus = value;
    }

    /**
     * Gets the value of the customerName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setCustomerName(JAXBElement<String> value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the extAdministeredInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isExtAdministeredInd() {
        return extAdministeredInd;
    }

    /**
     * Sets the value of the extAdministeredInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setExtAdministeredInd(Boolean value) {
        this.extAdministeredInd = value;
    }

    /**
     * Gets the value of the nonPublishedInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isNonPublishedInd() {
        return nonPublishedInd;
    }

    /**
     * Sets the value of the nonPublishedInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNonPublishedInd(Boolean value) {
        this.nonPublishedInd = value;
    }

    /**
     * Gets the value of the plugType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPlugType() {
        return plugType;
    }

    /**
     * Sets the value of the plugType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPlugType(JAXBElement<String> value) {
        this.plugType = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BaseTNType }{@code >}
     *
     */
    public JAXBElement<BaseTNType> getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BaseTNType }{@code >}
     *
     */
    public void setTelephoneNumber(JAXBElement<BaseTNType> value) {
        this.telephoneNumber = value;
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
