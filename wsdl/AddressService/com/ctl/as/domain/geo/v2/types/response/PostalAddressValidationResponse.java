
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfError;
import com.ctl.as.domain.geo.types.GeoPoint;
import com.ctl.as.domain.geo.types.ResultColor;
import com.ctl.as.domain.geo.v2.types.ArrayOfPostalAddress;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for PostalAddressValidationResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PostalAddressValidationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types/Response}AddressManagementResponse">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://geo.domain.as.ctl.com/Types}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="DataMessages" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://geo.domain.as.ctl.com/Types}ResultColor" minOccurs="0"/>
 *         &lt;element name="PostalDirectoryMatchLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryConfirmationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalAddresses" type="{http://geo.domain.as.ctl.com/v2/Types}ArrayOfPostalAddress" minOccurs="0"/>
 *         &lt;element name="PostalRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCommercialMailReceivingAgency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNoStat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsVacant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMilitaryAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUniqueZipCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GeoPoint" type="{http://geo.domain.as.ctl.com/Types}GeoPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressValidationResponse", propOrder = {
    "errors",
    "dataMessages",
    "result",
    "postalDirectoryMatchLevel",
    "deliveryConfirmationCode",
    "postalAddresses",
    "postalRecordType",
    "isCommercialMailReceivingAgency",
    "isNoStat",
    "isVacant",
    "isMilitaryAddress",
    "isUniqueZipCode",
    "geoPoint"
})
public class PostalAddressValidationResponse
    extends AddressManagementResponse
{

    @XmlElementRef(name = "Errors", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfError> errors;
    @XmlElementRef(name = "DataMessages", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> dataMessages;
    @XmlElementRef(name = "Result", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ResultColor> result;
    @XmlElementRef(name = "PostalDirectoryMatchLevel", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalDirectoryMatchLevel;
    @XmlElementRef(name = "DeliveryConfirmationCode", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryConfirmationCode;
    @XmlElementRef(name = "PostalAddresses", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostalAddress> postalAddresses;
    @XmlElementRef(name = "PostalRecordType", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalRecordType;
    @XmlElement(name = "IsCommercialMailReceivingAgency")
    protected Boolean isCommercialMailReceivingAgency;
    @XmlElement(name = "IsNoStat")
    protected Boolean isNoStat;
    @XmlElement(name = "IsVacant")
    protected Boolean isVacant;
    @XmlElement(name = "IsMilitaryAddress")
    protected Boolean isMilitaryAddress;
    @XmlElement(name = "IsUniqueZipCode")
    protected Boolean isUniqueZipCode;
    @XmlElementRef(name = "GeoPoint", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoPoint> geoPoint;

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
     * Gets the value of the dataMessages property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getDataMessages() {
        return dataMessages;
    }

    /**
     * Sets the value of the dataMessages property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setDataMessages(JAXBElement<ArrayOfstring> value) {
        this.dataMessages = value;
    }

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ResultColor }{@code >}
     *
     */
    public JAXBElement<ResultColor> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ResultColor }{@code >}
     *
     */
    public void setResult(JAXBElement<ResultColor> value) {
        this.result = value;
    }

    /**
     * Gets the value of the postalDirectoryMatchLevel property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPostalDirectoryMatchLevel() {
        return postalDirectoryMatchLevel;
    }

    /**
     * Sets the value of the postalDirectoryMatchLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPostalDirectoryMatchLevel(JAXBElement<String> value) {
        this.postalDirectoryMatchLevel = value;
    }

    /**
     * Gets the value of the deliveryConfirmationCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getDeliveryConfirmationCode() {
        return deliveryConfirmationCode;
    }

    /**
     * Sets the value of the deliveryConfirmationCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setDeliveryConfirmationCode(JAXBElement<String> value) {
        this.deliveryConfirmationCode = value;
    }

    /**
     * Gets the value of the postalAddresses property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPostalAddress }{@code >}
          *
     */
    public JAXBElement<ArrayOfPostalAddress> getPostalAddresses() {
        return postalAddresses;
    }

    /**
     * Sets the value of the postalAddresses property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPostalAddress }{@code >}
          *
          */
    public void setPostalAddresses(JAXBElement<ArrayOfPostalAddress> value) {
        this.postalAddresses = value;
    }

    /**
     * Gets the value of the postalRecordType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPostalRecordType() {
        return postalRecordType;
    }

    /**
     * Sets the value of the postalRecordType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPostalRecordType(JAXBElement<String> value) {
        this.postalRecordType = value;
    }

    /**
     * Gets the value of the isCommercialMailReceivingAgency property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsCommercialMailReceivingAgency() {
        return isCommercialMailReceivingAgency;
    }

    /**
     * Sets the value of the isCommercialMailReceivingAgency property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsCommercialMailReceivingAgency(Boolean value) {
        this.isCommercialMailReceivingAgency = value;
    }

    /**
     * Gets the value of the isNoStat property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsNoStat() {
        return isNoStat;
    }

    /**
     * Sets the value of the isNoStat property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsNoStat(Boolean value) {
        this.isNoStat = value;
    }

    /**
     * Gets the value of the isVacant property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsVacant() {
        return isVacant;
    }

    /**
     * Sets the value of the isVacant property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsVacant(Boolean value) {
        this.isVacant = value;
    }

    /**
     * Gets the value of the isMilitaryAddress property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsMilitaryAddress() {
        return isMilitaryAddress;
    }

    /**
     * Sets the value of the isMilitaryAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsMilitaryAddress(Boolean value) {
        this.isMilitaryAddress = value;
    }

    /**
     * Gets the value of the isUniqueZipCode property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsUniqueZipCode() {
        return isUniqueZipCode;
    }

    /**
     * Sets the value of the isUniqueZipCode property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsUniqueZipCode(Boolean value) {
        this.isUniqueZipCode = value;
    }

    /**
     * Gets the value of the geoPoint property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *
     */
    public JAXBElement<GeoPoint> getGeoPoint() {
        return geoPoint;
            }

            /**
     * Sets the value of the geoPoint property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *
     */
    public void setGeoPoint(JAXBElement<GeoPoint> value) {
        this.geoPoint = value;
            }

}
