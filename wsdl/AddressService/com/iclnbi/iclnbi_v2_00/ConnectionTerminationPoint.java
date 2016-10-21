
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionTerminationPoint complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConnectionTerminationPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TerminationPoint">
 *       &lt;sequence>
 *         &lt;element name="ctpState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TerminationPointConnectionState" minOccurs="0"/>
 *         &lt;element name="MappingMode" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TerminationMode" minOccurs="0"/>
 *         &lt;element name="supportedConnectionRates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTPsInCTP" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ConnectionTerminationPoint" minOccurs="0"/>
 *         &lt;element name="ConnectionTerminationPointContains" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfConnectionTerminationPoint" minOccurs="0"/>
 *         &lt;element name="QoSBandwidth" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCoSBundle" minOccurs="0"/>
 *         &lt;element name="MaintenanceEndPoint" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}MaintenanceEndPoint" minOccurs="0"/>
 *         &lt;element name="FdfrHasAEndFps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomainFragment" minOccurs="0"/>
 *         &lt;element name="FdfrHasZEndFps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomainFragment" minOccurs="0"/>
 *         &lt;element name="MfdfrHasAEndFps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}MatrixFlowDomainFragment" minOccurs="0"/>
 *         &lt;element name="MfdfrHasZEndFps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}MatrixFlowDomainFragment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTerminationPoint", propOrder = {
    "ctpState",
    "mappingMode",
    "supportedConnectionRates",
    "ctPsInCTP",
    "connectionTerminationPointContains",
    "qoSBandwidth",
    "maintenanceEndPoint",
    "fdfrHasAEndFps",
    "fdfrHasZEndFps",
    "mfdfrHasAEndFps",
    "mfdfrHasZEndFps"
})
public class ConnectionTerminationPoint
    extends TerminationPoint
{

    @XmlSchemaType(name = "string")
    protected TerminationPointConnectionState ctpState;
    @XmlElement(name = "MappingMode")
    @XmlSchemaType(name = "string")
    protected TerminationMode mappingMode;
    @XmlElementRef(name = "supportedConnectionRates", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportedConnectionRates;
    @XmlElementRef(name = "CTPsInCTP", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ConnectionTerminationPoint> ctPsInCTP;
    @XmlElementRef(name = "ConnectionTerminationPointContains", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConnectionTerminationPoint> connectionTerminationPointContains;
    @XmlElementRef(name = "QoSBandwidth", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCoSBundle> qoSBandwidth;
    @XmlElementRef(name = "MaintenanceEndPoint", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MaintenanceEndPoint> maintenanceEndPoint;
    @XmlElementRef(name = "FdfrHasAEndFps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<FlowDomainFragment> fdfrHasAEndFps;
    @XmlElementRef(name = "FdfrHasZEndFps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<FlowDomainFragment> fdfrHasZEndFps;
    @XmlElementRef(name = "MfdfrHasAEndFps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MatrixFlowDomainFragment> mfdfrHasAEndFps;
    @XmlElementRef(name = "MfdfrHasZEndFps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MatrixFlowDomainFragment> mfdfrHasZEndFps;

    /**
     * Gets the value of the ctpState property.
     *
     * @return
     *     possible object is
     *     {@link TerminationPointConnectionState }
     *
     */
    public TerminationPointConnectionState getCtpState() {
        return ctpState;
    }

    /**
     * Sets the value of the ctpState property.
     *
     * @param value
     *     allowed object is
     *     {@link TerminationPointConnectionState }
     *
     */
    public void setCtpState(TerminationPointConnectionState value) {
        this.ctpState = value;
    }

    /**
     * Gets the value of the mappingMode property.
     *
     * @return
     *     possible object is
     *     {@link TerminationMode }
     *
     */
    public TerminationMode getMappingMode() {
        return mappingMode;
    }

    /**
     * Sets the value of the mappingMode property.
     *
     * @param value
     *     allowed object is
     *     {@link TerminationMode }
     *
     */
    public void setMappingMode(TerminationMode value) {
        this.mappingMode = value;
    }

    /**
     * Gets the value of the supportedConnectionRates property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSupportedConnectionRates() {
        return supportedConnectionRates;
    }

    /**
     * Sets the value of the supportedConnectionRates property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSupportedConnectionRates(JAXBElement<String> value) {
        this.supportedConnectionRates = value;
    }

    /**
     * Gets the value of the ctPsInCTP property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.iclnbi.iclnbi_v2_00.ConnectionTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ConnectionTerminationPoint> getCTPsInCTP() {
        return ctPsInCTP;
    }

    /**
     * Sets the value of the ctPsInCTP property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.iclnbi.iclnbi_v2_00.ConnectionTerminationPoint }{@code >}
     *
     */
    public void setCTPsInCTP(JAXBElement<ConnectionTerminationPoint> value) {
        this.ctPsInCTP = value;
    }

    /**
     * Gets the value of the connectionTerminationPointContains property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfConnectionTerminationPoint> getConnectionTerminationPointContains() {
        return connectionTerminationPointContains;
    }

    /**
     * Sets the value of the connectionTerminationPointContains property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public void setConnectionTerminationPointContains(JAXBElement<ArrayOfConnectionTerminationPoint> value) {
        this.connectionTerminationPointContains = value;
    }

    /**
     * Gets the value of the qoSBandwidth property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCoSBundle }{@code >}
     *
     */
    public JAXBElement<ArrayOfCoSBundle> getQoSBandwidth() {
        return qoSBandwidth;
    }

    /**
     * Sets the value of the qoSBandwidth property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCoSBundle }{@code >}
     *
     */
    public void setQoSBandwidth(JAXBElement<ArrayOfCoSBundle> value) {
        this.qoSBandwidth = value;
    }

    /**
     * Gets the value of the maintenanceEndPoint property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MaintenanceEndPoint }{@code >}
     *
     */
    public JAXBElement<MaintenanceEndPoint> getMaintenanceEndPoint() {
        return maintenanceEndPoint;
    }

    /**
     * Sets the value of the maintenanceEndPoint property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MaintenanceEndPoint }{@code >}
     *
     */
    public void setMaintenanceEndPoint(JAXBElement<MaintenanceEndPoint> value) {
        this.maintenanceEndPoint = value;
    }

    /**
     * Gets the value of the fdfrHasAEndFps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragment }{@code >}
     *
     */
    public JAXBElement<FlowDomainFragment> getFdfrHasAEndFps() {
        return fdfrHasAEndFps;
    }

    /**
     * Sets the value of the fdfrHasAEndFps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragment }{@code >}
     *
     */
    public void setFdfrHasAEndFps(JAXBElement<FlowDomainFragment> value) {
        this.fdfrHasAEndFps = value;
    }

    /**
     * Gets the value of the fdfrHasZEndFps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragment }{@code >}
     *
     */
    public JAXBElement<FlowDomainFragment> getFdfrHasZEndFps() {
        return fdfrHasZEndFps;
    }

    /**
     * Sets the value of the fdfrHasZEndFps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragment }{@code >}
     *
     */
    public void setFdfrHasZEndFps(JAXBElement<FlowDomainFragment> value) {
        this.fdfrHasZEndFps = value;
    }

    /**
     * Gets the value of the mfdfrHasAEndFps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MatrixFlowDomainFragment }{@code >}
     *
     */
    public JAXBElement<MatrixFlowDomainFragment> getMfdfrHasAEndFps() {
        return mfdfrHasAEndFps;
    }

    /**
     * Sets the value of the mfdfrHasAEndFps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MatrixFlowDomainFragment }{@code >}
     *
     */
    public void setMfdfrHasAEndFps(JAXBElement<MatrixFlowDomainFragment> value) {
        this.mfdfrHasAEndFps = value;
    }

    /**
     * Gets the value of the mfdfrHasZEndFps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MatrixFlowDomainFragment }{@code >}
     *
     */
    public JAXBElement<MatrixFlowDomainFragment> getMfdfrHasZEndFps() {
        return mfdfrHasZEndFps;
    }

    /**
     * Sets the value of the mfdfrHasZEndFps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MatrixFlowDomainFragment }{@code >}
     *
     */
    public void setMfdfrHasZEndFps(JAXBElement<MatrixFlowDomainFragment> value) {
        this.mfdfrHasZEndFps = value;
    }

}
