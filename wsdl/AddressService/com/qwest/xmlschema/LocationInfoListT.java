
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for LocationInfoListT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LocationInfoListT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AHNMatchList" type="{http://www.qwest.com/XMLSchema}ArrayOfAHNMatch" minOccurs="0"/>
 *         &lt;element name="AddressInfo" type="{http://www.qwest.com/XMLSchema}CivicAddressT" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.qwest.com/XMLSchema}AreaT" minOccurs="0"/>
 *         &lt;element name="AreaCommunityList" type="{http://www.qwest.com/XMLSchema}ArrayOfAreaCommunity" minOccurs="0"/>
 *         &lt;element name="CustomFieldList" type="{http://www.qwest.com/XMLSchema}ArrayOfCustomField" minOccurs="0"/>
 *         &lt;element name="DescriptiveNameCommunityMatchList" type="{http://www.qwest.com/XMLSchema}ArrayOfDescriptiveNameCommunityMatch" minOccurs="0"/>
 *         &lt;element name="DescriptiveNameMatchList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DescriptiveNamePNAMatchList" type="{http://www.qwest.com/XMLSchema}ArrayOfDescriptiveNamePNAMatch" minOccurs="0"/>
 *         &lt;element name="GSGMatchList" type="{http://www.qwest.com/XMLSchema}ArrayOfGSCMatch" minOccurs="0"/>
 *         &lt;element name="NeighborMatchList" type="{http://www.qwest.com/XMLSchema}ArrayOfNeighborMatchT" minOccurs="0"/>
 *         &lt;element name="QwestStreetNameList" type="{http://www.qwest.com/XMLSchema}ArrayOfQwestStreetInfoT" minOccurs="0"/>
 *         &lt;element name="RangeMatchList" type="{http://www.qwest.com/XMLSchema}ArrayOfRangeMatch" minOccurs="0"/>
 *         &lt;element name="SLOCMatchList" type="{http://www.qwest.com/XMLSchema}ArrayOfSLOCMatch" minOccurs="0"/>
 *         &lt;element name="StreetNameCommunityList" type="{http://www.qwest.com/XMLSchema}ArrayOfStreetNameCommunity" minOccurs="0"/>
 *         &lt;element name="StreetRangeMatch" type="{http://www.qwest.com/XMLSchema}ArrayOfStreetRangeMatchT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationInfoListT", propOrder = {
    "ahnMatchList",
    "addressInfo",
    "area",
    "areaCommunityList",
    "customFieldList",
    "descriptiveNameCommunityMatchList",
    "descriptiveNameMatchList",
    "descriptiveNamePNAMatchList",
    "gsgMatchList",
    "neighborMatchList",
    "qwestStreetNameList",
    "rangeMatchList",
    "slocMatchList",
    "streetNameCommunityList",
    "streetRangeMatch"
})
public class LocationInfoListT {

    @XmlElementRef(name = "AHNMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAHNMatch> ahnMatchList;
    @XmlElementRef(name = "AddressInfo", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CivicAddressT> addressInfo;
    @XmlElement(name = "Area")
    @XmlSchemaType(name = "string")
    protected AreaT area;
    @XmlElementRef(name = "AreaCommunityList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAreaCommunity> areaCommunityList;
    @XmlElementRef(name = "CustomFieldList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomField> customFieldList;
    @XmlElementRef(name = "DescriptiveNameCommunityMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDescriptiveNameCommunityMatch> descriptiveNameCommunityMatchList;
    @XmlElementRef(name = "DescriptiveNameMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> descriptiveNameMatchList;
    @XmlElementRef(name = "DescriptiveNamePNAMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDescriptiveNamePNAMatch> descriptiveNamePNAMatchList;
    @XmlElementRef(name = "GSGMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGSCMatch> gsgMatchList;
    @XmlElementRef(name = "NeighborMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNeighborMatchT> neighborMatchList;
    @XmlElementRef(name = "QwestStreetNameList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQwestStreetInfoT> qwestStreetNameList;
    @XmlElementRef(name = "RangeMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRangeMatch> rangeMatchList;
    @XmlElementRef(name = "SLOCMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSLOCMatch> slocMatchList;
    @XmlElementRef(name = "StreetNameCommunityList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStreetNameCommunity> streetNameCommunityList;
    @XmlElementRef(name = "StreetRangeMatch", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStreetRangeMatchT> streetRangeMatch;

    /**
     * Gets the value of the ahnMatchList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAHNMatch }{@code >}
     *
     */
    public JAXBElement<ArrayOfAHNMatch> getAHNMatchList() {
        return ahnMatchList;
    }

    /**
     * Sets the value of the ahnMatchList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAHNMatch }{@code >}
     *
     */
    public void setAHNMatchList(JAXBElement<ArrayOfAHNMatch> value) {
        this.ahnMatchList = value;
    }

    /**
     * Gets the value of the addressInfo property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressT }{@code >}
     *
     */
    public JAXBElement<CivicAddressT> getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressT }{@code >}
     *
     */
    public void setAddressInfo(JAXBElement<CivicAddressT> value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the area property.
     *
     * @return
     *     possible object is
     *     {@link AreaT }
     *
     */
    public AreaT getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value
     *     allowed object is
     *     {@link AreaT }
     *
     */
    public void setArea(AreaT value) {
        this.area = value;
    }

    /**
     * Gets the value of the areaCommunityList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAreaCommunity }{@code >}
     *
     */
    public JAXBElement<ArrayOfAreaCommunity> getAreaCommunityList() {
        return areaCommunityList;
    }

    /**
     * Sets the value of the areaCommunityList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAreaCommunity }{@code >}
     *
     */
    public void setAreaCommunityList(JAXBElement<ArrayOfAreaCommunity> value) {
        this.areaCommunityList = value;
    }

    /**
     * Gets the value of the customFieldList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomField }{@code >}
     *
     */
    public JAXBElement<ArrayOfCustomField> getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomField }{@code >}
     *
     */
    public void setCustomFieldList(JAXBElement<ArrayOfCustomField> value) {
        this.customFieldList = value;
    }

    /**
     * Gets the value of the descriptiveNameCommunityMatchList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfDescriptiveNameCommunityMatch }{@code >}
     *
     */
    public JAXBElement<ArrayOfDescriptiveNameCommunityMatch> getDescriptiveNameCommunityMatchList() {
        return descriptiveNameCommunityMatchList;
    }

    /**
     * Sets the value of the descriptiveNameCommunityMatchList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfDescriptiveNameCommunityMatch }{@code >}
     *
     */
    public void setDescriptiveNameCommunityMatchList(JAXBElement<ArrayOfDescriptiveNameCommunityMatch> value) {
        this.descriptiveNameCommunityMatchList = value;
    }

    /**
     * Gets the value of the descriptiveNameMatchList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
         public JAXBElement<ArrayOfstring> getDescriptiveNameMatchList() {
        return descriptiveNameMatchList;
    }

    /**
     * Sets the value of the descriptiveNameMatchList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setDescriptiveNameMatchList(JAXBElement<ArrayOfstring> value) {
        this.descriptiveNameMatchList = value;
    }

    /**
     * Gets the value of the descriptiveNamePNAMatchList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfDescriptiveNamePNAMatch }{@code >}
     *
          */
         public JAXBElement<ArrayOfDescriptiveNamePNAMatch> getDescriptiveNamePNAMatchList() {
        return descriptiveNamePNAMatchList;
    }

    /**
     * Sets the value of the descriptiveNamePNAMatchList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfDescriptiveNamePNAMatch }{@code >}
     *
     */
         public void setDescriptiveNamePNAMatchList(JAXBElement<ArrayOfDescriptiveNamePNAMatch> value) {
        this.descriptiveNamePNAMatchList = value;
    }

    /**
     * Gets the value of the gsgMatchList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfGSCMatch }{@code >}
     *
     */
    public JAXBElement<ArrayOfGSCMatch> getGSGMatchList() {
        return gsgMatchList;
    }

    /**
     * Sets the value of the gsgMatchList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfGSCMatch }{@code >}
     *
     */
    public void setGSGMatchList(JAXBElement<ArrayOfGSCMatch> value) {
        this.gsgMatchList = value;
    }

    /**
     * Gets the value of the neighborMatchList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfNeighborMatchT }{@code >}
     *
     */
    public JAXBElement<ArrayOfNeighborMatchT> getNeighborMatchList() {
        return neighborMatchList;
    }

    /**
     * Sets the value of the neighborMatchList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfNeighborMatchT }{@code >}
     *
     */
    public void setNeighborMatchList(JAXBElement<ArrayOfNeighborMatchT> value) {
        this.neighborMatchList = value;
    }

    /**
     * Gets the value of the qwestStreetNameList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfQwestStreetInfoT }{@code >}
     *
     */
    public JAXBElement<ArrayOfQwestStreetInfoT> getQwestStreetNameList() {
        return qwestStreetNameList;
    }

    /**
     * Sets the value of the qwestStreetNameList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfQwestStreetInfoT }{@code >}
     *
     */
    public void setQwestStreetNameList(JAXBElement<ArrayOfQwestStreetInfoT> value) {
        this.qwestStreetNameList = value;
    }

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
     * Gets the value of the slocMatchList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSLOCMatch }{@code >}
     *
     */
    public JAXBElement<ArrayOfSLOCMatch> getSLOCMatchList() {
        return slocMatchList;
    }

    /**
     * Sets the value of the slocMatchList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSLOCMatch }{@code >}
     *
     */
    public void setSLOCMatchList(JAXBElement<ArrayOfSLOCMatch> value) {
            this.slocMatchList = value;
    }

    /**
     * Gets the value of the streetNameCommunityList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfStreetNameCommunity }{@code >}
     *
     */
    public JAXBElement<ArrayOfStreetNameCommunity> getStreetNameCommunityList() {
        return streetNameCommunityList;
    }

    /**
     * Sets the value of the streetNameCommunityList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfStreetNameCommunity }{@code >}
     *
     */
    public void setStreetNameCommunityList(JAXBElement<ArrayOfStreetNameCommunity> value) {
        this.streetNameCommunityList = value;
    }

    /**
     * Gets the value of the streetRangeMatch property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfStreetRangeMatchT }{@code >}
     *
     */
    public JAXBElement<ArrayOfStreetRangeMatchT> getStreetRangeMatch() {
        return streetRangeMatch;
    }

    /**
     * Sets the value of the streetRangeMatch property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfStreetRangeMatchT }{@code >}
     *
     */
    public void setStreetRangeMatch(JAXBElement<ArrayOfStreetRangeMatchT> value) {
        this.streetRangeMatch = value;
    }

}
