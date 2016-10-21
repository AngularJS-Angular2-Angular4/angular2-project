
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SLOCMatch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SLOCMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplementalAddress" type="{http://www.qwest.com/XMLSchema}SupplementalAddressT" minOccurs="0"/>
 *         &lt;element name="TNSummaryList" type="{http://www.qwest.com/XMLSchema}ArrayOfTNSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLOCMatch", propOrder = {
    "supplementalAddress",
    "tnSummaryList"
})
public class SLOCMatch {

    @XmlElementRef(name = "SupplementalAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<SupplementalAddressT> supplementalAddress;
    @XmlElementRef(name = "TNSummaryList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTNSummary> tnSummaryList;

    /**
     * Gets the value of the supplementalAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SupplementalAddressT }{@code >}
     *
     */
    public JAXBElement<SupplementalAddressT> getSupplementalAddress() {
        return supplementalAddress;
    }

    /**
     * Sets the value of the supplementalAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SupplementalAddressT }{@code >}
     *
     */
    public void setSupplementalAddress(JAXBElement<SupplementalAddressT> value) {
        this.supplementalAddress = value;
    }

    /**
     * Gets the value of the tnSummaryList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTNSummary }{@code >}
     *
     */
    public JAXBElement<ArrayOfTNSummary> getTNSummaryList() {
        return tnSummaryList;
    }

    /**
     * Sets the value of the tnSummaryList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTNSummary }{@code >}
     *
     */
    public void setTNSummaryList(JAXBElement<ArrayOfTNSummary> value) {
        this.tnSummaryList = value;
    }

}
