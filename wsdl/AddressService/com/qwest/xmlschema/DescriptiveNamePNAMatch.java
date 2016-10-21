
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for DescriptiveNamePNAMatch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DescriptiveNamePNAMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressCommunityList" type="{http://www.qwest.com/XMLSchema}ArrayOfAddressCommunity" minOccurs="0"/>
 *         &lt;element name="DescriptiveCommunityMatch" type="{http://www.qwest.com/XMLSchema}DescriptiveNameCommunityMatch" minOccurs="0"/>
 *         &lt;element name="PNARemarksList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptiveNamePNAMatch", propOrder = {
    "addressCommunityList",
    "descriptiveCommunityMatch",
    "pnaRemarksList"
})
public class DescriptiveNamePNAMatch {

    @XmlElementRef(name = "AddressCommunityList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddressCommunity> addressCommunityList;
    @XmlElementRef(name = "DescriptiveCommunityMatch", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<DescriptiveNameCommunityMatch> descriptiveCommunityMatch;
    @XmlElementRef(name = "PNARemarksList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> pnaRemarksList;

    /**
     * Gets the value of the addressCommunityList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAddressCommunity }{@code >}
     *
     */
    public JAXBElement<ArrayOfAddressCommunity> getAddressCommunityList() {
        return addressCommunityList;
    }

    /**
     * Sets the value of the addressCommunityList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAddressCommunity }{@code >}
     *
     */
    public void setAddressCommunityList(JAXBElement<ArrayOfAddressCommunity> value) {
        this.addressCommunityList = value;
    }

    /**
     * Gets the value of the descriptiveCommunityMatch property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DescriptiveNameCommunityMatch }{@code >}
     *
     */
    public JAXBElement<DescriptiveNameCommunityMatch> getDescriptiveCommunityMatch() {
        return descriptiveCommunityMatch;
    }

    /**
     * Sets the value of the descriptiveCommunityMatch property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DescriptiveNameCommunityMatch }{@code >}
     *
     */
    public void setDescriptiveCommunityMatch(JAXBElement<DescriptiveNameCommunityMatch> value) {
        this.descriptiveCommunityMatch = value;
    }

    /**
     * Gets the value of the pnaRemarksList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getPNARemarksList() {
        return pnaRemarksList;
    }

    /**
     * Sets the value of the pnaRemarksList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setPNARemarksList(JAXBElement<ArrayOfstring> value) {
        this.pnaRemarksList = value;
    }

}
