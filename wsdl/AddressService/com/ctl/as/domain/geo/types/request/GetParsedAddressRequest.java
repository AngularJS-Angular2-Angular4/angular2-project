
package com.ctl.as.domain.geo.types.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetParsedAddressRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetParsedAddressRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/Types/Request}AddressManagementRequest">
 *       &lt;sequence>
 *         &lt;element name="BaseAddressString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardizeElements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetParsedAddressRequest", propOrder = {
    "baseAddressString",
    "standardizeElements"
})
public class GetParsedAddressRequest
    extends AddressManagementRequest
{

    @XmlElementRef(name = "BaseAddressString", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseAddressString;
    @XmlElement(name = "StandardizeElements")
    protected Boolean standardizeElements;

    /**
     * Gets the value of the baseAddressString property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBaseAddressString() {
        return baseAddressString;
    }

    /**
     * Sets the value of the baseAddressString property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBaseAddressString(JAXBElement<String> value) {
        this.baseAddressString = value;
    }

    /**
     * Gets the value of the standardizeElements property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isStandardizeElements() {
        return standardizeElements;
    }

    /**
     * Sets the value of the standardizeElements property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setStandardizeElements(Boolean value) {
        this.standardizeElements = value;
    }

}
