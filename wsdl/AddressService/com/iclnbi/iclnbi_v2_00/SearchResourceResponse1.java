
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResourceResponse1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SearchResourceResponse1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchResourceResponse" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}SearchResourceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResourceResponse1", propOrder = {
    "searchResourceResponse"
})
public class SearchResourceResponse1 {

    @XmlElementRef(name = "SearchResourceResponse", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchResourceResponse> searchResourceResponse;

    /**
     * Gets the value of the searchResourceResponse property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResourceResponse }{@code >}
     *
     */
    public JAXBElement<SearchResourceResponse> getSearchResourceResponse() {
        return searchResourceResponse;
    }

    /**
     * Sets the value of the searchResourceResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResourceResponse }{@code >}
     *
     */
    public void setSearchResourceResponse(JAXBElement<SearchResourceResponse> value) {
        this.searchResourceResponse = value;
    }

}
