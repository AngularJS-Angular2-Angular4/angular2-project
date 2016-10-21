
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfError;
import com.ctl.as.domain.geo.types.ArrayOfSubAddress;
import com.ctl.as.domain.geo.types.SearchResult;


/**
 * <p>Java class for GetSubAddressesResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetSubAddressesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types/Response}AddressManagementResponse">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://geo.domain.as.ctl.com/Types}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://geo.domain.as.ctl.com/Types}SearchResult" minOccurs="0"/>
 *         &lt;element name="IsResponseFromCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubAddressCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubAddresses" type="{http://geo.domain.as.ctl.com/Types}ArrayOfSubAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubAddressesResponse", propOrder = {
    "errors",
    "result",
    "isResponseFromCache",
    "subAddressCount",
    "subAddresses"
})
public class GetSubAddressesResponse
    extends AddressManagementResponse
{

    @XmlElementRef(name = "Errors", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfError> errors;
    @XmlElementRef(name = "Result", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchResult> result;
    @XmlElement(name = "IsResponseFromCache")
    protected Boolean isResponseFromCache;
    @XmlElement(name = "SubAddressCount")
    protected Integer subAddressCount;
    @XmlElementRef(name = "SubAddresses", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubAddress> subAddresses;

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
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResult }{@code >}
     *
     */
    public JAXBElement<SearchResult> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResult }{@code >}
     *
     */
    public void setResult(JAXBElement<SearchResult> value) {
        this.result = value;
    }

    /**
     * Gets the value of the isResponseFromCache property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsResponseFromCache() {
        return isResponseFromCache;
    }

    /**
     * Sets the value of the isResponseFromCache property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsResponseFromCache(Boolean value) {
        this.isResponseFromCache = value;
    }

    /**
     * Gets the value of the subAddressCount property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSubAddressCount() {
        return subAddressCount;
    }

    /**
     * Sets the value of the subAddressCount property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSubAddressCount(Integer value) {
        this.subAddressCount = value;
    }

    /**
     * Gets the value of the subAddresses property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddress }{@code >}
     *
     */
    public JAXBElement<ArrayOfSubAddress> getSubAddresses() {
        return subAddresses;
    }

    /**
     * Sets the value of the subAddresses property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddress }{@code >}
          *
     */
    public void setSubAddresses(JAXBElement<ArrayOfSubAddress> value) {
        this.subAddresses = value;
    }

}
