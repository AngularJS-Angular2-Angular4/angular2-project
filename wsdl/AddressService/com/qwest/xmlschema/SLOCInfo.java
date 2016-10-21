
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for SLOCInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SLOCInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressData" type="{http://www.qwest.com/XMLSchema}SLOCAddressDataT" minOccurs="0"/>
 *         &lt;element name="ExtPendingServiceRequest" type="{http://www.qwest.com/XMLSchema}ArrayOfExtPendingServiceRequestT" minOccurs="0"/>
 *         &lt;element name="LastCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastTN" type="{http://www.qwest.com/XMLSchema}BaseTNType" minOccurs="0"/>
 *         &lt;element name="LastTNDisconnectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastVideoDisconnectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MorePendingServiceRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MoreTNConnectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NetworkCapabilities" type="{http://www.qwest.com/XMLSchema}NetworkCapabilitiesT" minOccurs="0"/>
 *         &lt;element name="NumCF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumSpCoaxDrops" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumSpCopperDrops" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlugTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceLocationRemarks" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TelephoneConnection" type="{http://www.qwest.com/XMLSchema}ArrayOfTelephoneConnectionT" minOccurs="0"/>
 *         &lt;element name="VideoConnection" type="{http://www.qwest.com/XMLSchema}ArrayOfVideoConnectionT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLOCInfo", propOrder = {
    "addressData",
    "extPendingServiceRequest",
    "lastCustomerName",
    "lastTN",
    "lastTNDisconnectReason",
    "lastVideoDisconnectReason",
    "morePendingServiceRequest",
    "moreTNConnectionInd",
    "networkCapabilities",
    "numCF",
    "numCT",
    "numSpCoaxDrops",
    "numSpCopperDrops",
    "plugTypes",
    "serviceLocationRemarks",
    "telephoneConnection",
    "videoConnection"
})
public class SLOCInfo {

    @XmlElementRef(name = "AddressData", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<SLOCAddressDataT> addressData;
    @XmlElementRef(name = "ExtPendingServiceRequest", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtPendingServiceRequestT> extPendingServiceRequest;
    @XmlElementRef(name = "LastCustomerName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastCustomerName;
    @XmlElementRef(name = "LastTN", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseTNType> lastTN;
    @XmlElementRef(name = "LastTNDisconnectReason", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastTNDisconnectReason;
    @XmlElementRef(name = "LastVideoDisconnectReason", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastVideoDisconnectReason;
    @XmlElement(name = "MorePendingServiceRequest")
    protected Boolean morePendingServiceRequest;
    @XmlElement(name = "MoreTNConnectionInd")
    protected Boolean moreTNConnectionInd;
    @XmlElementRef(name = "NetworkCapabilities", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkCapabilitiesT> networkCapabilities;
    @XmlElementRef(name = "NumCF", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numCF;
    @XmlElementRef(name = "NumCT", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numCT;
    @XmlElementRef(name = "NumSpCoaxDrops", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numSpCoaxDrops;
    @XmlElementRef(name = "NumSpCopperDrops", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numSpCopperDrops;
    @XmlElementRef(name = "PlugTypes", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plugTypes;
    @XmlElementRef(name = "ServiceLocationRemarks", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> serviceLocationRemarks;
    @XmlElementRef(name = "TelephoneConnection", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTelephoneConnectionT> telephoneConnection;
    @XmlElementRef(name = "VideoConnection", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVideoConnectionT> videoConnection;

    /**
     * Gets the value of the addressData property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SLOCAddressDataT }{@code >}
     *
     */
    public JAXBElement<SLOCAddressDataT> getAddressData() {
        return addressData;
    }

    /**
     * Sets the value of the addressData property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SLOCAddressDataT }{@code >}
     *
     */
    public void setAddressData(JAXBElement<SLOCAddressDataT> value) {
        this.addressData = value;
    }

    /**
     * Gets the value of the extPendingServiceRequest property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfExtPendingServiceRequestT }{@code >}
     *
     */
    public JAXBElement<ArrayOfExtPendingServiceRequestT> getExtPendingServiceRequest() {
        return extPendingServiceRequest;
    }

    /**
     * Sets the value of the extPendingServiceRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfExtPendingServiceRequestT }{@code >}
     *
     */
    public void setExtPendingServiceRequest(JAXBElement<ArrayOfExtPendingServiceRequestT> value) {
        this.extPendingServiceRequest = value;
    }

    /**
     * Gets the value of the lastCustomerName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLastCustomerName() {
        return lastCustomerName;
    }

    /**
     * Sets the value of the lastCustomerName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLastCustomerName(JAXBElement<String> value) {
        this.lastCustomerName = value;
    }

    /**
     * Gets the value of the lastTN property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BaseTNType }{@code >}
     *
     */
    public JAXBElement<BaseTNType> getLastTN() {
        return lastTN;
    }

    /**
     * Sets the value of the lastTN property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BaseTNType }{@code >}
     *
     */
    public void setLastTN(JAXBElement<BaseTNType> value) {
        this.lastTN = value;
    }

    /**
     * Gets the value of the lastTNDisconnectReason property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getLastTNDisconnectReason() {
        return lastTNDisconnectReason;
    }

    /**
     * Sets the value of the lastTNDisconnectReason property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setLastTNDisconnectReason(JAXBElement<String> value) {
        this.lastTNDisconnectReason = value;
    }

    /**
     * Gets the value of the lastVideoDisconnectReason property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getLastVideoDisconnectReason() {
        return lastVideoDisconnectReason;
    }

    /**
     * Sets the value of the lastVideoDisconnectReason property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setLastVideoDisconnectReason(JAXBElement<String> value) {
        this.lastVideoDisconnectReason = value;
    }

    /**
     * Gets the value of the morePendingServiceRequest property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMorePendingServiceRequest() {
        return morePendingServiceRequest;
    }

    /**
     * Sets the value of the morePendingServiceRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMorePendingServiceRequest(Boolean value) {
        this.morePendingServiceRequest = value;
    }

    /**
     * Gets the value of the moreTNConnectionInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMoreTNConnectionInd() {
        return moreTNConnectionInd;
    }

    /**
     * Sets the value of the moreTNConnectionInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMoreTNConnectionInd(Boolean value) {
        this.moreTNConnectionInd = value;
    }

    /**
     * Gets the value of the networkCapabilities property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NetworkCapabilitiesT }{@code >}
     *
     */
    public JAXBElement<NetworkCapabilitiesT> getNetworkCapabilities() {
        return networkCapabilities;
    }

    /**
     * Sets the value of the networkCapabilities property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NetworkCapabilitiesT }{@code >}
     *
     */
    public void setNetworkCapabilities(JAXBElement<NetworkCapabilitiesT> value) {
        this.networkCapabilities = value;
    }

    /**
     * Gets the value of the numCF property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNumCF() {
            return numCF;
    }

    /**
     * Sets the value of the numCF property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNumCF(JAXBElement<String> value) {
            this.numCF = value;
    }

    /**
     * Gets the value of the numCT property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNumCT() {
        return numCT;
    }

    /**
     * Sets the value of the numCT property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNumCT(JAXBElement<String> value) {
        this.numCT = value;
    }

    /**
     * Gets the value of the numSpCoaxDrops property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNumSpCoaxDrops() {
        return numSpCoaxDrops;
    }

    /**
     * Sets the value of the numSpCoaxDrops property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNumSpCoaxDrops(JAXBElement<String> value) {
        this.numSpCoaxDrops = value;
    }

    /**
     * Gets the value of the numSpCopperDrops property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNumSpCopperDrops() {
        return numSpCopperDrops;
    }

    /**
     * Sets the value of the numSpCopperDrops property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNumSpCopperDrops(JAXBElement<String> value) {
        this.numSpCopperDrops = value;
    }

    /**
     * Gets the value of the plugTypes property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPlugTypes() {
        return plugTypes;
    }

    /**
         * Sets the value of the plugTypes property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPlugTypes(JAXBElement<String> value) {
        this.plugTypes = value;
    }

        /**
     * Gets the value of the serviceLocationRemarks property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getServiceLocationRemarks() {
        return serviceLocationRemarks;
    }

    /**
     * Sets the value of the serviceLocationRemarks property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setServiceLocationRemarks(JAXBElement<ArrayOfstring> value) {
        this.serviceLocationRemarks = value;
    }

    /**
     * Gets the value of the telephoneConnection property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTelephoneConnectionT }{@code >}
     *
     */
    public JAXBElement<ArrayOfTelephoneConnectionT> getTelephoneConnection() {
        return telephoneConnection;
    }

    /**
     * Sets the value of the telephoneConnection property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTelephoneConnectionT }{@code >}
     *
     */
    public void setTelephoneConnection(JAXBElement<ArrayOfTelephoneConnectionT> value) {
        this.telephoneConnection = value;
    }

    /**
     * Gets the value of the videoConnection property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfVideoConnectionT }{@code >}
     *
     */
    public JAXBElement<ArrayOfVideoConnectionT> getVideoConnection() {
        return videoConnection;
    }

        /**
     * Sets the value of the videoConnection property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfVideoConnectionT }{@code >}
     *
     */
    public void setVideoConnection(JAXBElement<ArrayOfVideoConnectionT> value) {
        this.videoConnection = value;
            }

}
