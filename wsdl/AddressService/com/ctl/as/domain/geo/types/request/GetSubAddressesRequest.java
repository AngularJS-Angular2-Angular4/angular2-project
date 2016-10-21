
package com.ctl.as.domain.geo.types.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfSourceSystem;


/**
 * <p>Java class for GetSubAddressesRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetSubAddressesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/Types/Request}AddressManagementRequest">
 *       &lt;sequence>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sources" type="{http://geo.domain.as.ctl.com/Types}ArrayOfSourceSystem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubAddressesRequest", propOrder = {
    "addressId",
    "sources"
})
public class GetSubAddressesRequest
    extends AddressManagementRequest
{

    @XmlElementRef(name = "AddressId", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressId;
    @XmlElementRef(name = "Sources", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSourceSystem> sources;

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
     * Gets the value of the sources property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSourceSystem }{@code >}
     *
     */
    public JAXBElement<ArrayOfSourceSystem> getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSourceSystem }{@code >}
     *
     */
    public void setSources(JAXBElement<ArrayOfSourceSystem> value) {
        this.sources = value;
    }

}
