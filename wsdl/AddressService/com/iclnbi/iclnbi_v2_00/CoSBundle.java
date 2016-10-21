
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoSBundle complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CoSBundle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ServiceBundle">
 *       &lt;sequence>
 *         &lt;element name="LOSName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CosID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CosValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileParameters" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfBandwidthProfile" minOccurs="0"/>
 *         &lt;element name="P1" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Priority" minOccurs="0"/>
 *         &lt;element name="P2" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Priority" minOccurs="0"/>
 *         &lt;element name="P3" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Priority" minOccurs="0"/>
 *         &lt;element name="P4" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Priority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoSBundle", propOrder = {
    "losName",
    "cosID",
    "cosValue",
    "profileParameters",
    "p1",
    "p2",
    "p3",
    "p4"
})
public class CoSBundle
    extends ServiceBundle
{

    @XmlElementRef(name = "LOSName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> losName;
    @XmlElementRef(name = "CosID", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cosID;
    @XmlElementRef(name = "CosValue", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cosValue;
    @XmlElementRef(name = "ProfileParameters", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBandwidthProfile> profileParameters;
    @XmlElementRef(name = "P1", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Priority> p1;
    @XmlElementRef(name = "P2", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Priority> p2;
    @XmlElementRef(name = "P3", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Priority> p3;
    @XmlElementRef(name = "P4", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Priority> p4;

    /**
     * Gets the value of the losName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLOSName() {
        return losName;
    }

    /**
     * Sets the value of the losName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLOSName(JAXBElement<String> value) {
        this.losName = value;
    }

    /**
     * Gets the value of the cosID property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCosID() {
        return cosID;
    }

    /**
     * Sets the value of the cosID property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCosID(JAXBElement<String> value) {
        this.cosID = value;
    }

    /**
     * Gets the value of the cosValue property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCosValue() {
        return cosValue;
    }

    /**
     * Sets the value of the cosValue property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCosValue(JAXBElement<String> value) {
        this.cosValue = value;
    }

    /**
     * Gets the value of the profileParameters property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfBandwidthProfile }{@code >}
     *
     */
    public JAXBElement<ArrayOfBandwidthProfile> getProfileParameters() {
        return profileParameters;
    }

    /**
     * Sets the value of the profileParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfBandwidthProfile }{@code >}
     *
     */
    public void setProfileParameters(JAXBElement<ArrayOfBandwidthProfile> value) {
        this.profileParameters = value;
    }

    /**
     * Gets the value of the p1 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Priority }{@code >}
          *
     */
    public JAXBElement<Priority> getP1() {
        return p1;
    }

    /**
     * Sets the value of the p1 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Priority }{@code >}
          *
          */
    public void setP1(JAXBElement<Priority> value) {
        this.p1 = value;
    }

    /**
     * Gets the value of the p2 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Priority }{@code >}
     *
          */
         public JAXBElement<Priority> getP2() {
        return p2;
    }

    /**
     * Sets the value of the p2 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Priority }{@code >}
     *
     */
         public void setP2(JAXBElement<Priority> value) {
        this.p2 = value;
    }

    /**
     * Gets the value of the p3 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Priority }{@code >}
     *
     */
         public JAXBElement<Priority> getP3() {
        return p3;
    }

    /**
     * Sets the value of the p3 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Priority }{@code >}
     *
     */
    public void setP3(JAXBElement<Priority> value) {
        this.p3 = value;
    }

    /**
     * Gets the value of the p4 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Priority }{@code >}
     *
     */
    public JAXBElement<Priority> getP4() {
        return p4;
    }

    /**
     * Sets the value of the p4 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Priority }{@code >}
     *
     */
    public void setP4(JAXBElement<Priority> value) {
        this.p4 = value;
    }

}
