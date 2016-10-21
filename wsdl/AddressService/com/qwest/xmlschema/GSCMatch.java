
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GSCMatch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GSCMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AHNRange" type="{http://www.qwest.com/XMLSchema}RangeT" minOccurs="0"/>
 *         &lt;element name="Community" type="{http://www.qwest.com/XMLSchema}CommunityT" minOccurs="0"/>
 *         &lt;element name="GeographicSegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAGInfo" type="{http://www.qwest.com/XMLSchema}SAGInfoT" minOccurs="0"/>
 *         &lt;element name="TTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GSCMatch", propOrder = {
    "ahnRange",
    "community",
    "geographicSegmentId",
    "sagInfo",
    "tta"
})
public class GSCMatch {

    @XmlElementRef(name = "AHNRange", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<RangeT> ahnRange;
    @XmlElementRef(name = "Community", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CommunityT> community;
    @XmlElementRef(name = "GeographicSegmentId", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geographicSegmentId;
    @XmlElementRef(name = "SAGInfo", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<SAGInfoT> sagInfo;
    @XmlElementRef(name = "TTA", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tta;

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
     * Gets the value of the geographicSegmentId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getGeographicSegmentId() {
        return geographicSegmentId;
    }

    /**
     * Sets the value of the geographicSegmentId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setGeographicSegmentId(JAXBElement<String> value) {
        this.geographicSegmentId = value;
    }

    /**
     * Gets the value of the sagInfo property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SAGInfoT }{@code >}
     *
     */
    public JAXBElement<SAGInfoT> getSAGInfo() {
        return sagInfo;
    }

    /**
     * Sets the value of the sagInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SAGInfoT }{@code >}
     *
     */
    public void setSAGInfo(JAXBElement<SAGInfoT> value) {
        this.sagInfo = value;
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

}
