
package com.sforce.soap.schemas._class.ws_acq_leads;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tnportableinfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tnportableinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BeginningTNRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndIngTNRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LosingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numberofdaysforportable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortableMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tnportableinfo", propOrder = {
    "beginningTNRange",
    "endIngTNRange",
    "losingCarrier",
    "numberofdaysforportable",
    "portableMessage"
})
public class Tnportableinfo {

    @XmlElementRef(name = "BeginningTNRange", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beginningTNRange;
    @XmlElementRef(name = "EndIngTNRange", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endIngTNRange;
    @XmlElementRef(name = "LosingCarrier", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> losingCarrier;
    @XmlElementRef(name = "Numberofdaysforportable", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberofdaysforportable;
    @XmlElementRef(name = "PortableMessage", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portableMessage;

    /**
     * Gets the value of the beginningTNRange property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBeginningTNRange() {
        return beginningTNRange;
    }

    /**
     * Sets the value of the beginningTNRange property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBeginningTNRange(JAXBElement<String> value) {
        this.beginningTNRange = value;
    }

    /**
     * Gets the value of the endIngTNRange property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEndIngTNRange() {
        return endIngTNRange;
    }

    /**
     * Sets the value of the endIngTNRange property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEndIngTNRange(JAXBElement<String> value) {
        this.endIngTNRange = value;
    }

    /**
     * Gets the value of the losingCarrier property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLosingCarrier() {
        return losingCarrier;
    }

    /**
     * Sets the value of the losingCarrier property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLosingCarrier(JAXBElement<String> value) {
        this.losingCarrier = value;
    }

    /**
     * Gets the value of the numberofdaysforportable property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNumberofdaysforportable() {
        return numberofdaysforportable;
    }

    /**
     * Sets the value of the numberofdaysforportable property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNumberofdaysforportable(JAXBElement<String> value) {
        this.numberofdaysforportable = value;
    }

    /**
     * Gets the value of the portableMessage property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPortableMessage() {
        return portableMessage;
    }

    /**
     * Sets the value of the portableMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPortableMessage(JAXBElement<String> value) {
        this.portableMessage = value;
    }

}
