
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shelf complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Shelf">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}HolderComposite">
 *       &lt;sequence>
 *         &lt;element name="relayRackID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsistsOfSlot" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfSlot" minOccurs="0"/>
 *         &lt;element name="AllowableSlot" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfSlot" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shelf", propOrder = {
    "relayRackID",
    "bayName",
    "consistsOfSlot",
    "allowableSlot"
})
public class Shelf
    extends HolderComposite
{

    @XmlElementRef(name = "relayRackID", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relayRackID;
    @XmlElementRef(name = "bayName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bayName;
    @XmlElementRef(name = "ConsistsOfSlot", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSlot> consistsOfSlot;
    @XmlElementRef(name = "AllowableSlot", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSlot> allowableSlot;

    /**
     * Gets the value of the relayRackID property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRelayRackID() {
        return relayRackID;
    }

    /**
     * Sets the value of the relayRackID property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRelayRackID(JAXBElement<String> value) {
        this.relayRackID = value;
    }

    /**
     * Gets the value of the bayName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBayName() {
        return bayName;
    }

    /**
     * Sets the value of the bayName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBayName(JAXBElement<String> value) {
        this.bayName = value;
    }

    /**
     * Gets the value of the consistsOfSlot property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSlot }{@code >}
     *
     */
    public JAXBElement<ArrayOfSlot> getConsistsOfSlot() {
        return consistsOfSlot;
    }

    /**
     * Sets the value of the consistsOfSlot property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSlot }{@code >}
     *
     */
    public void setConsistsOfSlot(JAXBElement<ArrayOfSlot> value) {
        this.consistsOfSlot = value;
    }

    /**
     * Gets the value of the allowableSlot property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSlot }{@code >}
     *
     */
    public JAXBElement<ArrayOfSlot> getAllowableSlot() {
        return allowableSlot;
    }

    /**
     * Sets the value of the allowableSlot property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSlot }{@code >}
     *
     */
    public void setAllowableSlot(JAXBElement<ArrayOfSlot> value) {
        this.allowableSlot = value;
    }

}
