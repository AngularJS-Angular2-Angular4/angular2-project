
package com.ctl.as.domain.geo.types.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfSubAddressDesignator;
import com.ctl.as.domain.geo.types.SourceSystem;


/**
 * <p>Java class for GetServiceAddressRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetServiceAddressRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/Types/Request}AddressManagementRequest">
 *       &lt;sequence>
 *         &lt;element name="SourceSystem" type="{http://geo.domain.as.ctl.com/Types}SourceSystem" minOccurs="0"/>
 *         &lt;element name="SourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParsedSubAddress" type="{http://geo.domain.as.ctl.com/Types}ArrayOfSubAddressDesignator" minOccurs="0"/>
 *         &lt;element name="SubAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchRelated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceAddressRequest", propOrder = {
    "sourceSystem",
    "sourceSystemId",
    "addressId",
    "subAddressId",
    "parsedSubAddress",
    "subAddress",
    "searchRelated"
})
public class GetServiceAddressRequest
    extends AddressManagementRequest
{

    @XmlElement(name = "SourceSystem")
    @XmlSchemaType(name = "string")
    protected SourceSystem sourceSystem;
    @XmlElementRef(name = "SourceSystemId", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystemId;
    @XmlElementRef(name = "AddressId", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressId;
    @XmlElementRef(name = "SubAddressId", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subAddressId;
    @XmlElementRef(name = "ParsedSubAddress", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubAddressDesignator> parsedSubAddress;
    @XmlElementRef(name = "SubAddress", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subAddress;
    @XmlElement(name = "SearchRelated")
    protected Boolean searchRelated;

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
     * Gets the value of the parsedSubAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddressDesignator }{@code >}
     *
     */
    public JAXBElement<ArrayOfSubAddressDesignator> getParsedSubAddress() {
        return parsedSubAddress;
    }

    /**
     * Sets the value of the parsedSubAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddressDesignator }{@code >}
     *
     */
    public void setParsedSubAddress(JAXBElement<ArrayOfSubAddressDesignator> value) {
        this.parsedSubAddress = value;
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
     * Gets the value of the searchRelated property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSearchRelated() {
        return searchRelated;
    }

    /**
     * Sets the value of the searchRelated property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSearchRelated(Boolean value) {
        this.searchRelated = value;
    }

}
