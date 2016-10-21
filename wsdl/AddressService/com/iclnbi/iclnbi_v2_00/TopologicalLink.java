
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopologicalLink complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TopologicalLink">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ConnectionDirection" minOccurs="0"/>
 *         &lt;element name="isReportingAlarms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZEndTps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfConnectionTerminationPoint" minOccurs="0"/>
 *         &lt;element name="AEndTps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfConnectionTerminationPoint" minOccurs="0"/>
 *         &lt;element name="TlIsTerminatedByAEndTps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTerminationPoint" minOccurs="0"/>
 *         &lt;element name="TlIsTerminatedByZEndTps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTerminationPoint" minOccurs="0"/>
 *         &lt;element name="TransportTypes" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TransportType" minOccurs="0"/>
 *         &lt;element name="TransmissionType" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TransmissionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopologicalLink", propOrder = {
    "direction",
    "isReportingAlarms",
    "bandwidth",
    "zEndTps",
    "aEndTps",
    "tlIsTerminatedByAEndTps",
    "tlIsTerminatedByZEndTps",
    "transportTypes",
    "transmissionType"
})
@XmlSeeAlso({
    Point2PointCircuit.class
})
public class TopologicalLink
    extends LogicalResource
{

    @XmlSchemaType(name = "string")
    protected ConnectionDirection direction;
    protected Boolean isReportingAlarms;
    @XmlElementRef(name = "bandwidth", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bandwidth;
    @XmlElementRef(name = "ZEndTps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConnectionTerminationPoint> zEndTps;
    @XmlElementRef(name = "AEndTps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConnectionTerminationPoint> aEndTps;
    @XmlElementRef(name = "TlIsTerminatedByAEndTps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerminationPoint> tlIsTerminatedByAEndTps;
    @XmlElementRef(name = "TlIsTerminatedByZEndTps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerminationPoint> tlIsTerminatedByZEndTps;
    @XmlElementRef(name = "TransportTypes", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TransportType> transportTypes;
    @XmlElementRef(name = "TransmissionType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TransmissionType> transmissionType;

    /**
     * Gets the value of the direction property.
     *
     * @return
     *     possible object is
     *     {@link ConnectionDirection }
     *
     */
    public ConnectionDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value
     *     allowed object is
     *     {@link ConnectionDirection }
     *
     */
    public void setDirection(ConnectionDirection value) {
        this.direction = value;
    }

    /**
     * Gets the value of the isReportingAlarms property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsReportingAlarms() {
        return isReportingAlarms;
    }

    /**
     * Sets the value of the isReportingAlarms property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsReportingAlarms(Boolean value) {
        this.isReportingAlarms = value;
    }

    /**
     * Gets the value of the bandwidth property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBandwidth(JAXBElement<String> value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the zEndTps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfConnectionTerminationPoint> getZEndTps() {
        return zEndTps;
    }

    /**
     * Sets the value of the zEndTps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public void setZEndTps(JAXBElement<ArrayOfConnectionTerminationPoint> value) {
        this.zEndTps = value;
    }

    /**
     * Gets the value of the aEndTps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfConnectionTerminationPoint> getAEndTps() {
        return aEndTps;
    }

    /**
     * Sets the value of the aEndTps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public void setAEndTps(JAXBElement<ArrayOfConnectionTerminationPoint> value) {
        this.aEndTps = value;
    }

    /**
     * Gets the value of the tlIsTerminatedByAEndTps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
          *
     */
    public JAXBElement<ArrayOfTerminationPoint> getTlIsTerminatedByAEndTps() {
        return tlIsTerminatedByAEndTps;
    }

    /**
     * Sets the value of the tlIsTerminatedByAEndTps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
          *
     */
    public void setTlIsTerminatedByAEndTps(JAXBElement<ArrayOfTerminationPoint> value) {
        this.tlIsTerminatedByAEndTps = value;
    }

    /**
     * Gets the value of the tlIsTerminatedByZEndTps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
          *
          */
    public JAXBElement<ArrayOfTerminationPoint> getTlIsTerminatedByZEndTps() {
        return tlIsTerminatedByZEndTps;
    }

    /**
     * Sets the value of the tlIsTerminatedByZEndTps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
          */
         public void setTlIsTerminatedByZEndTps(JAXBElement<ArrayOfTerminationPoint> value) {
        this.tlIsTerminatedByZEndTps = value;
    }

    /**
     * Gets the value of the transportTypes property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransportType }{@code >}
     *
     */
    public JAXBElement<TransportType> getTransportTypes() {
        return transportTypes;
    }

    /**
     * Sets the value of the transportTypes property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransportType }{@code >}
     *
     */
    public void setTransportTypes(JAXBElement<TransportType> value) {
        this.transportTypes = value;
    }

    /**
     * Gets the value of the transmissionType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransmissionType }{@code >}
     *
     */
    public JAXBElement<TransmissionType> getTransmissionType() {
        return transmissionType;
    }

    /**
     * Sets the value of the transmissionType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransmissionType }{@code >}
     *
     */
    public void setTransmissionType(JAXBElement<TransmissionType> value) {
        this.transmissionType = value;
    }

}
