
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for RangeMatch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RangeMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AHNRange" type="{http://www.qwest.com/XMLSchema}RangeT" minOccurs="0"/>
 *         &lt;element name="AltStreetNameList" type="{http://www.qwest.com/XMLSchema}ArrayOfQwestStreetInfoT" minOccurs="0"/>
 *         &lt;element name="AlternateCommunity12" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Community" type="{http://www.qwest.com/XMLSchema}CommunityT" minOccurs="0"/>
 *         &lt;element name="HSERange" type="{http://www.qwest.com/XMLSchema}RangeT" minOccurs="0"/>
 *         &lt;element name="PostalCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetRangeRemarks" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WireCenter" type="{http://www.qwest.com/XMLSchema}WireCenterT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeMatch", propOrder = {
    "ahnRange",
    "altStreetNameList",
    "alternateCommunity12",
    "community",
    "hseRange",
    "postalCommunity",
    "streetRangeRemarks",
    "tta",
    "wireCenter"
})
public class RangeMatch {

    @XmlElementRef(name = "AHNRange", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<RangeT> ahnRange;
    @XmlElementRef(name = "AltStreetNameList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQwestStreetInfoT> altStreetNameList;
    @XmlElementRef(name = "AlternateCommunity12", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> alternateCommunity12;
    @XmlElementRef(name = "Community", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CommunityT> community;
    @XmlElementRef(name = "HSERange", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<RangeT> hseRange;
    @XmlElementRef(name = "PostalCommunity", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCommunity;
    @XmlElementRef(name = "StreetRangeRemarks", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> streetRangeRemarks;
    @XmlElementRef(name = "TTA", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tta;
    @XmlElementRef(name = "WireCenter", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<WireCenterT> wireCenter;

    /**
     * Gets the value of the ahnRange property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RangeT }{@code >}
     *
     */
    public JAXBElement<RangeT> getAHNRange() {
        return ahnRange;
    }

    /**
     * Sets the value of the ahnRange property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RangeT }{@code >}
     *
     */
    public void setAHNRange(JAXBElement<RangeT> value) {
        this.ahnRange = value;
    }

    /**
     * Gets the value of the altStreetNameList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfQwestStreetInfoT }{@code >}
     *
     */
    public JAXBElement<ArrayOfQwestStreetInfoT> getAltStreetNameList() {
        return altStreetNameList;
    }

    /**
     * Sets the value of the altStreetNameList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfQwestStreetInfoT }{@code >}
     *
     */
    public void setAltStreetNameList(JAXBElement<ArrayOfQwestStreetInfoT> value) {
        this.altStreetNameList = value;
    }

    /**
     * Gets the value of the alternateCommunity12 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getAlternateCommunity12() {
        return alternateCommunity12;
    }

    /**
     * Sets the value of the alternateCommunity12 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setAlternateCommunity12(JAXBElement<ArrayOfstring> value) {
        this.alternateCommunity12 = value;
    }

    /**
     * Gets the value of the community property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CommunityT }{@code >}
     *
     */
    public JAXBElement<CommunityT> getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CommunityT }{@code >}
     *
     */
    public void setCommunity(JAXBElement<CommunityT> value) {
        this.community = value;
    }

    /**
     * Gets the value of the hseRange property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RangeT }{@code >}
          *
     */
    public JAXBElement<RangeT> getHSERange() {
        return hseRange;
    }

    /**
     * Sets the value of the hseRange property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link RangeT }{@code >}
          *
          */
    public void setHSERange(JAXBElement<RangeT> value) {
        this.hseRange = value;
    }

    /**
     * Gets the value of the postalCommunity property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getPostalCommunity() {
        return postalCommunity;
    }

    /**
     * Sets the value of the postalCommunity property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setPostalCommunity(JAXBElement<String> value) {
        this.postalCommunity = value;
    }

    /**
     * Gets the value of the streetRangeRemarks property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
         public JAXBElement<ArrayOfstring> getStreetRangeRemarks() {
        return streetRangeRemarks;
    }

    /**
     * Sets the value of the streetRangeRemarks property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setStreetRangeRemarks(JAXBElement<ArrayOfstring> value) {
        this.streetRangeRemarks = value;
    }

    /**
     * Gets the value of the tta property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTTA() {
        return tta;
    }

    /**
     * Sets the value of the tta property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTTA(JAXBElement<String> value) {
        this.tta = value;
    }

    /**
     * Gets the value of the wireCenter property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link WireCenterT }{@code >}
     *
     */
    public JAXBElement<WireCenterT> getWireCenter() {
        return wireCenter;
    }

    /**
     * Sets the value of the wireCenter property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link WireCenterT }{@code >}
     *
     */
    public void setWireCenter(JAXBElement<WireCenterT> value) {
        this.wireCenter = value;
    }

}
