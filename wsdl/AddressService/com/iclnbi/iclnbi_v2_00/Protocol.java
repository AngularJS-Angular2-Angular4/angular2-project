
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Protocol complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Protocol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="currentPortNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isEphemeral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocolDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portRangeStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portRangeEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolServiceDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfProtocolServiceDetails" minOccurs="0"/>
 *         &lt;element name="ProtocolDeviceInterfaceDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfProtocolDeviceInterfaceDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Protocol", propOrder = {
    "currentPortNumber",
    "isEphemeral",
    "protocolDirection",
    "portRangeStart",
    "portRangeEnd",
    "protocolServiceDetails",
    "protocolDeviceInterfaceDetails"
})
public class Protocol
    extends LogicalResource
{

    @XmlElementRef(name = "currentPortNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentPortNumber;
    @XmlElementRef(name = "isEphemeral", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isEphemeral;
    @XmlElementRef(name = "protocolDirection", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocolDirection;
    @XmlElementRef(name = "portRangeStart", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portRangeStart;
    @XmlElementRef(name = "portRangeEnd", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portRangeEnd;
    @XmlElementRef(name = "ProtocolServiceDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProtocolServiceDetails> protocolServiceDetails;
    @XmlElementRef(name = "ProtocolDeviceInterfaceDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProtocolDeviceInterfaceDetails> protocolDeviceInterfaceDetails;

    /**
     * Gets the value of the currentPortNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCurrentPortNumber() {
        return currentPortNumber;
    }

    /**
     * Sets the value of the currentPortNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCurrentPortNumber(JAXBElement<String> value) {
        this.currentPortNumber = value;
    }

    /**
     * Gets the value of the isEphemeral property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getIsEphemeral() {
        return isEphemeral;
    }

    /**
     * Sets the value of the isEphemeral property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setIsEphemeral(JAXBElement<String> value) {
        this.isEphemeral = value;
    }

    /**
     * Gets the value of the protocolDirection property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getProtocolDirection() {
        return protocolDirection;
    }

    /**
     * Sets the value of the protocolDirection property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setProtocolDirection(JAXBElement<String> value) {
        this.protocolDirection = value;
    }

    /**
     * Gets the value of the portRangeStart property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPortRangeStart() {
        return portRangeStart;
    }

    /**
     * Sets the value of the portRangeStart property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPortRangeStart(JAXBElement<String> value) {
        this.portRangeStart = value;
    }

    /**
     * Gets the value of the portRangeEnd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPortRangeEnd() {
        return portRangeEnd;
    }

    /**
     * Sets the value of the portRangeEnd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPortRangeEnd(JAXBElement<String> value) {
        this.portRangeEnd = value;
    }

    /**
     * Gets the value of the protocolServiceDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfProtocolServiceDetails }{@code >}
     *
     */
    public JAXBElement<ArrayOfProtocolServiceDetails> getProtocolServiceDetails() {
        return protocolServiceDetails;
    }

    /**
     * Sets the value of the protocolServiceDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfProtocolServiceDetails }{@code >}
     *
     */
    public void setProtocolServiceDetails(JAXBElement<ArrayOfProtocolServiceDetails> value) {
        this.protocolServiceDetails = value;
    }

    /**
     * Gets the value of the protocolDeviceInterfaceDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfProtocolDeviceInterfaceDetails }{@code >}
     *
     */
    public JAXBElement<ArrayOfProtocolDeviceInterfaceDetails> getProtocolDeviceInterfaceDetails() {
        return protocolDeviceInterfaceDetails;
    }

    /**
     * Sets the value of the protocolDeviceInterfaceDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfProtocolDeviceInterfaceDetails }{@code >}
     *
     */
    public void setProtocolDeviceInterfaceDetails(JAXBElement<ArrayOfProtocolDeviceInterfaceDetails> value) {
        this.protocolDeviceInterfaceDetails = value;
    }

}
