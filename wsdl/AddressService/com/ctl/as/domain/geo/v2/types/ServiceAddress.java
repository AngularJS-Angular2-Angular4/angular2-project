
package com.ctl.as.domain.geo.v2.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.AddressAttributes;
import com.ctl.as.domain.geo.types.ArrayOfGeoPoint;
import com.ctl.as.domain.geo.types.ArrayOfSubAddressDesignator;
import com.ctl.as.domain.geo.types.SourceSystem;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for ServiceAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types}AmericanPropertyAddress">
 *       &lt;sequence>
 *         &lt;element name="SourceSystem" type="{http://geo.domain.as.ctl.com/Types}SourceSystem"/>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAddressFromLiveLookup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAddressDesignators" type="{http://geo.domain.as.ctl.com/Types}ArrayOfSubAddressDesignator" minOccurs="0"/>
 *         &lt;element name="DataMessages" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoPoints" type="{http://geo.domain.as.ctl.com/Types}ArrayOfGeoPoint" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://geo.domain.as.ctl.com/Types}AddressAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAddress", propOrder = {
    "sourceSystem",
    "addressId",
    "sourceSystemId",
    "isAddressFromLiveLookup",
    "subAddressId",
    "subAddress",
    "subAddressDesignators",
    "dataMessages",
    "name",
    "fullName",
    "geoPoints",
    "attributes"
})
public class ServiceAddress
    extends AmericanPropertyAddress
{

    @XmlElement(name = "SourceSystem", required = true)
    @XmlSchemaType(name = "string")
    protected SourceSystem sourceSystem;
    @XmlElementRef(name = "AddressId", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressId;
    @XmlElementRef(name = "SourceSystemId", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystemId;
    @XmlElementRef(name = "IsAddressFromLiveLookup", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAddressFromLiveLookup;
    @XmlElementRef(name = "SubAddressId", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subAddressId;
    @XmlElementRef(name = "SubAddress", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subAddress;
    @XmlElementRef(name = "SubAddressDesignators", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubAddressDesignator> subAddressDesignators;
    @XmlElementRef(name = "DataMessages", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> dataMessages;
    @XmlElementRef(name = "Name", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "FullName", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullName;
    @XmlElementRef(name = "GeoPoints", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGeoPoint> geoPoints;
    @XmlElementRef(name = "Attributes", namespace = "http://geo.domain.as.ctl.com/v2/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressAttributes> attributes;

    /**
     * Gets the value of the sourceSystem property.
     *
     * @return
     *     possible object is
     *     {@link SourceSystem }
     *
     */
    public SourceSystem getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     *
     * @param value
     *     allowed object is
     *     {@link SourceSystem }
     *
     */
    public void setSourceSystem(SourceSystem value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the addressId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAddressId(JAXBElement<String> value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the sourceSystemId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Sets the value of the sourceSystemId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSourceSystemId(JAXBElement<String> value) {
        this.sourceSystemId = value;
    }

    /**
     * Gets the value of the isAddressFromLiveLookup property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getIsAddressFromLiveLookup() {
        return isAddressFromLiveLookup;
    }

    /**
     * Sets the value of the isAddressFromLiveLookup property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setIsAddressFromLiveLookup(JAXBElement<Boolean> value) {
        this.isAddressFromLiveLookup = value;
    }

    /**
     * Gets the value of the subAddressId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSubAddressId() {
        return subAddressId;
    }

    /**
     * Sets the value of the subAddressId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSubAddressId(JAXBElement<String> value) {
        this.subAddressId = value;
    }

    /**
     * Gets the value of the subAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSubAddress() {
        return subAddress;
    }

    /**
     * Sets the value of the subAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSubAddress(JAXBElement<String> value) {
        this.subAddress = value;
    }

    /**
     * Gets the value of the subAddressDesignators property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddressDesignator }{@code >}
     *
     */
    public JAXBElement<ArrayOfSubAddressDesignator> getSubAddressDesignators() {
        return subAddressDesignators;
    }

    /**
     * Sets the value of the subAddressDesignators property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddressDesignator }{@code >}
     *
     */
    public void setSubAddressDesignators(JAXBElement<ArrayOfSubAddressDesignator> value) {
        this.subAddressDesignators = value;
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
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the fullName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFullName(JAXBElement<String> value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the geoPoints property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfGeoPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfGeoPoint> getGeoPoints() {
        return geoPoints;
    }

    /**
     * Sets the value of the geoPoints property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfGeoPoint }{@code >}
     *
     */
    public void setGeoPoints(JAXBElement<ArrayOfGeoPoint> value) {
        this.geoPoints = value;
    }

    /**
     * Gets the value of the attributes property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressAttributes }{@code >}
     *
     */
    public JAXBElement<AddressAttributes> getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressAttributes }{@code >}
     *
     */
    public void setAttributes(JAXBElement<AddressAttributes> value) {
        this.attributes = value;
    }

}
