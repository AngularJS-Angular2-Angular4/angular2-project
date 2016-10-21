
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExactMatchT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExactMatchT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AliasCommunityList" type="{http://www.qwest.com/XMLSchema}ArrayOfAliasCommunityListT" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.qwest.com/XMLSchema}AreaT" minOccurs="0"/>
 *         &lt;element name="CivicAddress" type="{http://www.qwest.com/XMLSchema}CivicAddressT" minOccurs="0"/>
 *         &lt;element name="CustomFieldList" type="{http://www.qwest.com/XMLSchema}ArrayOfCustomField" minOccurs="0"/>
 *         &lt;element name="DispatchInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LineInfoList" type="{http://www.qwest.com/XMLSchema}ArrayOfLineInfo" minOccurs="0"/>
 *         &lt;element name="NoSupplyBuildInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PNAInfo" type="{http://www.qwest.com/XMLSchema}PNAInfoT" minOccurs="0"/>
 *         &lt;element name="SAGInfo" type="{http://www.qwest.com/XMLSchema}SAGInfoT" minOccurs="0"/>
 *         &lt;element name="SLOCInfoList" type="{http://www.qwest.com/XMLSchema}ArrayOfSLOCInfo" minOccurs="0"/>
 *         &lt;element name="SLOCMatchList" type="{http://www.qwest.com/XMLSchema}ArrayOfSLOCMatch" minOccurs="0"/>
 *         &lt;element name="TTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WireCenter" type="{http://www.qwest.com/XMLSchema}WireCenterT" minOccurs="0"/>
 *         &lt;element name="WkgSvcOnPremInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExactMatchT", propOrder = {
    "aliasCommunityList",
    "area",
    "civicAddress",
    "customFieldList",
    "dispatchInd",
    "lineInfoList",
    "noSupplyBuildInd",
    "pnaInfo",
    "sagInfo",
    "slocInfoList",
    "slocMatchList",
    "tta",
    "wireCenter",
    "wkgSvcOnPremInd"
})
public class ExactMatchT {

    @XmlElementRef(name = "AliasCommunityList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAliasCommunityListT> aliasCommunityList;
    @XmlElement(name = "Area")
    @XmlSchemaType(name = "string")
    protected AreaT area;
    @XmlElementRef(name = "CivicAddress", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<CivicAddressT> civicAddress;
    @XmlElementRef(name = "CustomFieldList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomField> customFieldList;
    @XmlElement(name = "DispatchInd")
    protected Boolean dispatchInd;
    @XmlElementRef(name = "LineInfoList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineInfo> lineInfoList;
    @XmlElement(name = "NoSupplyBuildInd")
    protected Boolean noSupplyBuildInd;
    @XmlElementRef(name = "PNAInfo", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<PNAInfoT> pnaInfo;
    @XmlElementRef(name = "SAGInfo", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<SAGInfoT> sagInfo;
    @XmlElementRef(name = "SLOCInfoList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSLOCInfo> slocInfoList;
    @XmlElementRef(name = "SLOCMatchList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSLOCMatch> slocMatchList;
    @XmlElementRef(name = "TTA", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tta;
    @XmlElementRef(name = "WireCenter", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<WireCenterT> wireCenter;
    @XmlElement(name = "WkgSvcOnPremInd")
    protected Boolean wkgSvcOnPremInd;

    /**
     * Gets the value of the aliasCommunityList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAliasCommunityListT }{@code >}
     *
     */
    public JAXBElement<ArrayOfAliasCommunityListT> getAliasCommunityList() {
        return aliasCommunityList;
    }

    /**
     * Sets the value of the aliasCommunityList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAliasCommunityListT }{@code >}
     *
     */
    public void setAliasCommunityList(JAXBElement<ArrayOfAliasCommunityListT> value) {
        this.aliasCommunityList = value;
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
     * Gets the value of the civicAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressT }{@code >}
     *
     */
    public JAXBElement<CivicAddressT> getCivicAddress() {
        return civicAddress;
    }

    /**
     * Sets the value of the civicAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressT }{@code >}
     *
     */
    public void setCivicAddress(JAXBElement<CivicAddressT> value) {
        this.civicAddress = value;
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
     * Gets the value of the dispatchInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDispatchInd() {
        return dispatchInd;
    }

    /**
     * Sets the value of the dispatchInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDispatchInd(Boolean value) {
        this.dispatchInd = value;
    }

    /**
     * Gets the value of the lineInfoList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLineInfo }{@code >}
     *
     */
    public JAXBElement<ArrayOfLineInfo> getLineInfoList() {
        return lineInfoList;
    }

    /**
     * Sets the value of the lineInfoList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLineInfo }{@code >}
     *
     */
    public void setLineInfoList(JAXBElement<ArrayOfLineInfo> value) {
        this.lineInfoList = value;
    }

    /**
     * Gets the value of the noSupplyBuildInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isNoSupplyBuildInd() {
        return noSupplyBuildInd;
    }

    /**
     * Sets the value of the noSupplyBuildInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNoSupplyBuildInd(Boolean value) {
        this.noSupplyBuildInd = value;
    }

    /**
     * Gets the value of the pnaInfo property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PNAInfoT }{@code >}
     *
     */
    public JAXBElement<PNAInfoT> getPNAInfo() {
        return pnaInfo;
    }

    /**
     * Sets the value of the pnaInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PNAInfoT }{@code >}
     *
     */
    public void setPNAInfo(JAXBElement<PNAInfoT> value) {
        this.pnaInfo = value;
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
     * Gets the value of the slocInfoList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSLOCInfo }{@code >}
     *
     */
    public JAXBElement<ArrayOfSLOCInfo> getSLOCInfoList() {
        return slocInfoList;
    }

    /**
     * Sets the value of the slocInfoList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSLOCInfo }{@code >}
     *
     */
    public void setSLOCInfoList(JAXBElement<ArrayOfSLOCInfo> value) {
        this.slocInfoList = value;
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

    /**
     * Gets the value of the wkgSvcOnPremInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isWkgSvcOnPremInd() {
        return wkgSvcOnPremInd;
    }

    /**
     * Sets the value of the wkgSvcOnPremInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setWkgSvcOnPremInd(Boolean value) {
        this.wkgSvcOnPremInd = value;
    }

}
