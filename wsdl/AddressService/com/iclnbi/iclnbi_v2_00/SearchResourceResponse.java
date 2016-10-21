
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResourceResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SearchResourceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}OperationResponse">
 *       &lt;sequence>
 *         &lt;element name="SearchResponseDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfSearchResponseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResourceResponse", propOrder = {
    "searchResponseDetails"
})
public class SearchResourceResponse
    extends OperationResponse
{

    @XmlElementRef(name = "SearchResponseDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSearchResponseDetails> searchResponseDetails;

    /**
     * Gets the value of the searchResponseDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSearchResponseDetails }{@code >}
     *
     */
    public JAXBElement<ArrayOfSearchResponseDetails> getSearchResponseDetails() {
        return searchResponseDetails;
    }

    /**
     * Sets the value of the searchResponseDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSearchResponseDetails }{@code >}
     *
     */
    public void setSearchResponseDetails(JAXBElement<ArrayOfSearchResponseDetails> value) {
        this.searchResponseDetails = value;
    }

}
