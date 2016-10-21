
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfError;
import com.ctl.as.domain.geo.types.GeoPoint;
import com.ctl.as.domain.geo.types.ResultColor;
import com.ctl.as.domain.geo.v2.types.ArrayOfCivicAddress;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for CivicAddressValidationResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CivicAddressValidationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types/Response}AddressManagementResponse">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://geo.domain.as.ctl.com/Types}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="DataMessages" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://geo.domain.as.ctl.com/Types}ResultColor" minOccurs="0"/>
 *         &lt;element name="CensusMatchLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalDirectoryMatchLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryConfirmationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CivicAddresses" type="{http://geo.domain.as.ctl.com/v2/Types}ArrayOfCivicAddress" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetropolitanStatisticalArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CivicAddressValidationResponse", propOrder = {
    "errors",
    "dataMessages",
    "result",
    "censusMatchLevel",
    "postalDirectoryMatchLevel",
    "deliveryConfirmationCode",
    "civicAddresses",
    "county",
    "metropolitanStatisticalArea",
    "geoPoint"
})
public class CivicAddressValidationResponse
    extends AddressManagementResponse
{

    @XmlElementRef(name = "Errors", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfError> errors;
    @XmlElementRef(name = "DataMessages", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> dataMessages;
    @XmlElementRef(name = "Result", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ResultColor> result;
    @XmlElementRef(name = "CensusMatchLevel", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> censusMatchLevel;
    @XmlElementRef(name = "PostalDirectoryMatchLevel", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalDirectoryMatchLevel;
    @XmlElementRef(name = "DeliveryConfirmationCode", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryConfirmationCode;
    @XmlElementRef(name = "CivicAddresses", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCivicAddress> civicAddresses;
    @XmlElementRef(name = "County", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> county;
    @XmlElementRef(name = "MetropolitanStatisticalArea", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> metropolitanStatisticalArea;
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
     * Gets the value of the censusMatchLevel property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCensusMatchLevel() {
        return censusMatchLevel;
    }

    /**
     * Sets the value of the censusMatchLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCensusMatchLevel(JAXBElement<String> value) {
        this.censusMatchLevel = value;
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
     * Gets the value of the civicAddresses property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCivicAddress }{@code >}
     *
          */
         public JAXBElement<ArrayOfCivicAddress> getCivicAddresses() {
        return civicAddresses;
    }

    /**
     * Sets the value of the civicAddresses property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCivicAddress }{@code >}
     *
     */
         public void setCivicAddresses(JAXBElement<ArrayOfCivicAddress> value) {
        this.civicAddresses = value;
    }

    /**
     * Gets the value of the county property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCounty(JAXBElement<String> value) {
        this.county = value;
    }

    /**
     * Gets the value of the metropolitanStatisticalArea property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMetropolitanStatisticalArea() {
        return metropolitanStatisticalArea;
    }

    /**
     * Sets the value of the metropolitanStatisticalArea property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMetropolitanStatisticalArea(JAXBElement<String> value) {
        this.metropolitanStatisticalArea = value;
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
