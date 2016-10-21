
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.ArrayOfError;
import com.iclnbi.iclnbi_v2_00.SearchResourceResponse1;


/**
 * <p>Java class for ClcSearchResourceProxyResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ClcSearchResourceProxyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types/Response}AddressManagementResponse">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://geo.domain.as.ctl.com/Types}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="SearchResourceResponse" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}SearchResourceResponse1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClcSearchResourceProxyResponse", propOrder = {
    "errors",
    "searchResourceResponse"
})
public class ClcSearchResourceProxyResponse
    extends AddressManagementResponse
{

    @XmlElementRef(name = "Errors", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfError> errors;
    @XmlElementRef(name = "SearchResourceResponse", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchResourceResponse1> searchResourceResponse;

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
     * Gets the value of the searchResourceResponse property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResourceResponse1 }{@code >}
     *
     */
    public JAXBElement<SearchResourceResponse1> getSearchResourceResponse() {
        return searchResourceResponse;
    }

    /**
     * Sets the value of the searchResourceResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResourceResponse1 }{@code >}
     *
     */
    public void setSearchResourceResponse(JAXBElement<SearchResourceResponse1> value) {
        this.searchResourceResponse = value;
    }

}
