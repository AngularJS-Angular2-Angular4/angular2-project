
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubNetworkConnection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SubNetworkConnection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}SubnetworkConnectionState" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ConnectionDirection" minOccurs="0"/>
 *         &lt;element name="staticProtectionLevel" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}StaticProtectionLevel" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}SubnetworkConnectionType" minOccurs="0"/>
 *         &lt;element name="rerouteAllowed" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}RerouteAllowed" minOccurs="0"/>
 *         &lt;element name="networkRouted" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}NetworkRouted" minOccurs="0"/>
 *         &lt;element name="networkReroute" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Reroute" minOccurs="0"/>
 *         &lt;element name="revertive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isReportingAlarms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="correlationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBundledSnc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mustRemoveGtps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isFixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mustRetainOldSnc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="routeGroupLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Route" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfRoute" minOccurs="0"/>
 *         &lt;element name="SncHasAEndTps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTerminationPoint" minOccurs="0"/>
 *         &lt;element name="SncHasZEndTps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTerminationPoint" minOccurs="0"/>
 *         &lt;element name="AddressDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfAmericanPropertyAddress" minOccurs="0"/>
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
@XmlType(name = "SubNetworkConnection", propOrder = {
    "state",
    "direction",
    "staticProtectionLevel",
    "type",
    "rerouteAllowed",
    "networkRouted",
    "networkReroute",
    "revertive",
    "isReportingAlarms",
    "correlationIdentifier",
    "isBundledSnc",
    "mustRemoveGtps",
    "isFixed",
    "mustRetainOldSnc",
    "priority",
    "routeGroupLabel",
    "bandwidth",
    "route",
    "sncHasAEndTps",
    "sncHasZEndTps",
    "addressDetails",
    "transportTypes",
    "transmissionType"
})
public class SubNetworkConnection
    extends LogicalResource
{

    @XmlSchemaType(name = "string")
    protected SubnetworkConnectionState state;
    @XmlSchemaType(name = "string")
    protected ConnectionDirection direction;
    @XmlSchemaType(name = "string")
    protected StaticProtectionLevel staticProtectionLevel;
    @XmlSchemaType(name = "string")
    protected SubnetworkConnectionType type;
    @XmlSchemaType(name = "string")
    protected RerouteAllowed rerouteAllowed;
    @XmlSchemaType(name = "string")
    protected NetworkRouted networkRouted;
    @XmlSchemaType(name = "string")
    protected Reroute networkReroute;
    protected Boolean revertive;
    protected Boolean isReportingAlarms;
    @XmlElementRef(name = "correlationIdentifier", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correlationIdentifier;
    protected Boolean isBundledSnc;
    protected Boolean mustRemoveGtps;
    protected Boolean isFixed;
    protected Boolean mustRetainOldSnc;
    protected Integer priority;
    @XmlElementRef(name = "routeGroupLabel", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeGroupLabel;
    @XmlElementRef(name = "bandwidth", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bandwidth;
    @XmlElementRef(name = "Route", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoute> route;
    @XmlElementRef(name = "SncHasAEndTps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerminationPoint> sncHasAEndTps;
    @XmlElementRef(name = "SncHasZEndTps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerminationPoint> sncHasZEndTps;
    @XmlElementRef(name = "AddressDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAmericanPropertyAddress> addressDetails;
    @XmlElementRef(name = "TransportTypes", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TransportType> transportTypes;
    @XmlElementRef(name = "TransmissionType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TransmissionType> transmissionType;

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link SubnetworkConnectionState }
     *
     */
    public SubnetworkConnectionState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link SubnetworkConnectionState }
     *
     */
    public void setState(SubnetworkConnectionState value) {
        this.state = value;
    }

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
     * Gets the value of the staticProtectionLevel property.
     *
     * @return
     *     possible object is
     *     {@link StaticProtectionLevel }
     *
     */
    public StaticProtectionLevel getStaticProtectionLevel() {
        return staticProtectionLevel;
    }

    /**
     * Sets the value of the staticProtectionLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link StaticProtectionLevel }
     *
     */
    public void setStaticProtectionLevel(StaticProtectionLevel value) {
        this.staticProtectionLevel = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link SubnetworkConnectionType }
     *
     */
    public SubnetworkConnectionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link SubnetworkConnectionType }
     *
     */
    public void setType(SubnetworkConnectionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the rerouteAllowed property.
     *
     * @return
     *     possible object is
     *     {@link RerouteAllowed }
     *
     */
    public RerouteAllowed getRerouteAllowed() {
        return rerouteAllowed;
    }

    /**
     * Sets the value of the rerouteAllowed property.
     *
     * @param value
     *     allowed object is
     *     {@link RerouteAllowed }
     *
     */
    public void setRerouteAllowed(RerouteAllowed value) {
        this.rerouteAllowed = value;
    }

    /**
     * Gets the value of the networkRouted property.
     *
     * @return
     *     possible object is
     *     {@link NetworkRouted }
     *
     */
    public NetworkRouted getNetworkRouted() {
        return networkRouted;
    }

    /**
     * Sets the value of the networkRouted property.
     *
     * @param value
     *     allowed object is
     *     {@link NetworkRouted }
     *
     */
    public void setNetworkRouted(NetworkRouted value) {
        this.networkRouted = value;
    }

    /**
     * Gets the value of the networkReroute property.
     *
     * @return
     *     possible object is
     *     {@link Reroute }
     *
     */
    public Reroute getNetworkReroute() {
        return networkReroute;
    }

    /**
     * Sets the value of the networkReroute property.
     *
     * @param value
     *     allowed object is
     *     {@link Reroute }
     *
     */
    public void setNetworkReroute(Reroute value) {
        this.networkReroute = value;
    }

    /**
     * Gets the value of the revertive property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRevertive() {
        return revertive;
    }

    /**
     * Sets the value of the revertive property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRevertive(Boolean value) {
        this.revertive = value;
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
     * Gets the value of the correlationIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCorrelationIdentifier() {
        return correlationIdentifier;
    }

    /**
     * Sets the value of the correlationIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCorrelationIdentifier(JAXBElement<String> value) {
        this.correlationIdentifier = value;
    }

    /**
     * Gets the value of the isBundledSnc property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsBundledSnc() {
        return isBundledSnc;
    }

    /**
     * Sets the value of the isBundledSnc property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsBundledSnc(Boolean value) {
        this.isBundledSnc = value;
    }

    /**
     * Gets the value of the mustRemoveGtps property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMustRemoveGtps() {
        return mustRemoveGtps;
    }

    /**
     * Sets the value of the mustRemoveGtps property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMustRemoveGtps(Boolean value) {
        this.mustRemoveGtps = value;
    }

    /**
     * Gets the value of the isFixed property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsFixed() {
        return isFixed;
    }

    /**
     * Sets the value of the isFixed property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsFixed(Boolean value) {
        this.isFixed = value;
    }

    /**
     * Gets the value of the mustRetainOldSnc property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMustRetainOldSnc() {
        return mustRetainOldSnc;
    }

    /**
     * Sets the value of the mustRetainOldSnc property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMustRetainOldSnc(Boolean value) {
        this.mustRetainOldSnc = value;
    }

    /**
     * Gets the value of the priority property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the routeGroupLabel property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRouteGroupLabel() {
        return routeGroupLabel;
    }

    /**
     * Sets the value of the routeGroupLabel property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRouteGroupLabel(JAXBElement<String> value) {
        this.routeGroupLabel = value;
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
     * Gets the value of the route property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     *
     */
    public JAXBElement<ArrayOfRoute> getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     *
     */
    public void setRoute(JAXBElement<ArrayOfRoute> value) {
        this.route = value;
    }

    /**
     * Gets the value of the sncHasAEndTps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfTerminationPoint> getSncHasAEndTps() {
        return sncHasAEndTps;
    }

    /**
     * Sets the value of the sncHasAEndTps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public void setSncHasAEndTps(JAXBElement<ArrayOfTerminationPoint> value) {
        this.sncHasAEndTps = value;
    }

    /**
     * Gets the value of the sncHasZEndTps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfTerminationPoint> getSncHasZEndTps() {
        return sncHasZEndTps;
    }

    /**
     * Sets the value of the sncHasZEndTps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public void setSncHasZEndTps(JAXBElement<ArrayOfTerminationPoint> value) {
        this.sncHasZEndTps = value;
    }

    /**
     * Gets the value of the addressDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAmericanPropertyAddress }{@code >}
     *
     */
    public JAXBElement<ArrayOfAmericanPropertyAddress> getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAmericanPropertyAddress }{@code >}
     *
     */
    public void setAddressDetails(JAXBElement<ArrayOfAmericanPropertyAddress> value) {
        this.addressDetails = value;
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
