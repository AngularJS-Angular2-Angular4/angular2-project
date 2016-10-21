
package com.ctl.as.domain.geo.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WireCenter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="WireCenter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeoLocClli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClliCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryNpaNxx" type="{http://geo.domain.as.ctl.com/Types}NpaNxx" minOccurs="0"/>
 *         &lt;element name="Lata" type="{http://geo.domain.as.ctl.com/Types}Lata" minOccurs="0"/>
 *         &lt;element name="NpaNxxs" type="{http://geo.domain.as.ctl.com/Types}ArrayOfNpaNxx" minOccurs="0"/>
 *         &lt;element name="Switches" type="{http://geo.domain.as.ctl.com/Types}ArrayOfSwitch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireCenter", propOrder = {
    "geoLocClli",
    "clliCode",
    "code",
    "primaryNpaNxx",
    "lata",
    "npaNxxs",
    "switches"
})
public class WireCenter {

    @XmlElementRef(name = "GeoLocClli", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geoLocClli;
    @XmlElementRef(name = "ClliCode", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clliCode;
    @XmlElementRef(name = "Code", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "PrimaryNpaNxx", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<NpaNxx> primaryNpaNxx;
    @XmlElementRef(name = "Lata", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<Lata> lata;
    @XmlElementRef(name = "NpaNxxs", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNpaNxx> npaNxxs;
    @XmlElementRef(name = "Switches", namespace = "http://geo.domain.as.ctl.com/Types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSwitch> switches;

    /**
     * Gets the value of the geoLocClli property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getGeoLocClli() {
        return geoLocClli;
    }

    /**
     * Sets the value of the geoLocClli property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setGeoLocClli(JAXBElement<String> value) {
        this.geoLocClli = value;
    }

    /**
     * Gets the value of the clliCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getClliCode() {
        return clliCode;
    }

    /**
     * Sets the value of the clliCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setClliCode(JAXBElement<String> value) {
        this.clliCode = value;
    }

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * Gets the value of the primaryNpaNxx property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NpaNxx }{@code >}
     *
     */
    public JAXBElement<NpaNxx> getPrimaryNpaNxx() {
        return primaryNpaNxx;
    }

    /**
     * Sets the value of the primaryNpaNxx property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NpaNxx }{@code >}
     *
     */
    public void setPrimaryNpaNxx(JAXBElement<NpaNxx> value) {
        this.primaryNpaNxx = value;
    }

    /**
     * Gets the value of the lata property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Lata }{@code >}
     *
     */
    public JAXBElement<Lata> getLata() {
        return lata;
    }

    /**
     * Sets the value of the lata property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Lata }{@code >}
     *
     */
    public void setLata(JAXBElement<Lata> value) {
        this.lata = value;
    }

    /**
     * Gets the value of the npaNxxs property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfNpaNxx }{@code >}
     *
     */
    public JAXBElement<ArrayOfNpaNxx> getNpaNxxs() {
        return npaNxxs;
    }

    /**
     * Sets the value of the npaNxxs property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfNpaNxx }{@code >}
     *
     */
    public void setNpaNxxs(JAXBElement<ArrayOfNpaNxx> value) {
        this.npaNxxs = value;
    }

    /**
     * Gets the value of the switches property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSwitch }{@code >}
     *
     */
    public JAXBElement<ArrayOfSwitch> getSwitches() {
        return switches;
    }

    /**
     * Sets the value of the switches property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSwitch }{@code >}
     *
     */
    public void setSwitches(JAXBElement<ArrayOfSwitch> value) {
        this.switches = value;
    }

}
