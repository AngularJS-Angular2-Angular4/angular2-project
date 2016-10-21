
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreetRangeMatchT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StreetRangeMatchT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RangeMatchList" type="{http://www.qwest.com/XMLSchema}ArrayOfRangeMatch" minOccurs="0"/>
 *         &lt;element name="StreetCommunityList" type="{http://www.qwest.com/XMLSchema}ArrayOfStreetCommunity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreetRangeMatchT", propOrder = {
    "rangeMatchList",
    "streetCommunityList"
})
public class StreetRangeMatchT {

    @XmlElementRef(name = "RangeMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRangeMatch> rangeMatchList;
    @XmlElementRef(name = "StreetCommunityList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStreetCommunity> streetCommunityList;

    /**
     * Gets the value of the rangeMatchList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRangeMatch }{@code >}
     *
     */
    public JAXBElement<ArrayOfRangeMatch> getRangeMatchList() {
        return rangeMatchList;
    }

    /**
     * Sets the value of the rangeMatchList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRangeMatch }{@code >}
     *
     */
    public void setRangeMatchList(JAXBElement<ArrayOfRangeMatch> value) {
        this.rangeMatchList = value;
    }

    /**
     * Gets the value of the streetCommunityList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfStreetCommunity }{@code >}
     *
     */
    public JAXBElement<ArrayOfStreetCommunity> getStreetCommunityList() {
        return streetCommunityList;
    }

    /**
     * Sets the value of the streetCommunityList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfStreetCommunity }{@code >}
     *
     */
    public void setStreetCommunityList(JAXBElement<ArrayOfStreetCommunity> value) {
        this.streetCommunityList = value;
    }

}
