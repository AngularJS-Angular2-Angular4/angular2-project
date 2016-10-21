
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessParamsT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AccessParamsT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AhnListInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GsgReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UnNumberedSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessParamsT", propOrder = {
    "ahnListInd",
    "gsgReqInd",
    "unNumberedSS"
})
public class AccessParamsT {

    @XmlElement(name = "AhnListInd")
    protected Boolean ahnListInd;
    @XmlElement(name = "GsgReqInd")
    protected Boolean gsgReqInd;
    @XmlElementRef(name = "UnNumberedSS", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unNumberedSS;

    /**
     * Gets the value of the ahnListInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAhnListInd() {
        return ahnListInd;
    }

    /**
     * Sets the value of the ahnListInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAhnListInd(Boolean value) {
        this.ahnListInd = value;
    }

    /**
     * Gets the value of the gsgReqInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isGsgReqInd() {
        return gsgReqInd;
    }

    /**
     * Sets the value of the gsgReqInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setGsgReqInd(Boolean value) {
        this.gsgReqInd = value;
    }

    /**
     * Gets the value of the unNumberedSS property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getUnNumberedSS() {
        return unNumberedSS;
    }

    /**
     * Sets the value of the unNumberedSS property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setUnNumberedSS(JAXBElement<String> value) {
        this.unNumberedSS = value;
    }

}
