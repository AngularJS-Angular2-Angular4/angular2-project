
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDomainFragment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FlowDomainFragment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="administrativeState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ControlState" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ConnectionDirection" minOccurs="0"/>
 *         &lt;element name="isFlexible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}SubnetworkConnectionState" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomainFragmentType" minOccurs="0"/>
 *         &lt;element name="aEndTpDataList" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTerminationPoint" minOccurs="0"/>
 *         &lt;element name="FdfrIsCharacterisedByFdfrRoute" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomainFragmentRoute" minOccurs="0"/>
 *         &lt;element name="FlowDomainFragmentContainedIn" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomain" minOccurs="0"/>
 *         &lt;element name="ituArcStateAndStatusList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmissionParameterList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zEndTpDataList" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTerminationPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDomainFragment", propOrder = {
    "administrativeState",
    "direction",
    "isFlexible",
    "state",
    "type",
    "aEndTpDataList",
    "fdfrIsCharacterisedByFdfrRoute",
    "flowDomainFragmentContainedIn",
    "ituArcStateAndStatusList",
    "transmissionParameterList",
    "zEndTpDataList"
})
public class FlowDomainFragment
    extends LogicalResource
{

    @XmlSchemaType(name = "string")
    protected ControlState administrativeState;
    @XmlSchemaType(name = "string")
    protected ConnectionDirection direction;
    protected Boolean isFlexible;
    @XmlSchemaType(name = "string")
    protected SubnetworkConnectionState state;
    @XmlSchemaType(name = "string")
    protected FlowDomainFragmentType type;
    @XmlElementRef(name = "aEndTpDataList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerminationPoint> aEndTpDataList;
    @XmlElementRef(name = "FdfrIsCharacterisedByFdfrRoute", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<FlowDomainFragmentRoute> fdfrIsCharacterisedByFdfrRoute;
    @XmlElementRef(name = "FlowDomainFragmentContainedIn", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<FlowDomain> flowDomainFragmentContainedIn;
    @XmlElementRef(name = "ituArcStateAndStatusList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ituArcStateAndStatusList;
    @XmlElementRef(name = "transmissionParameterList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionParameterList;
    @XmlElementRef(name = "zEndTpDataList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerminationPoint> zEndTpDataList;

    /**
     * Gets the value of the administrativeState property.
     *
     * @return
     *     possible object is
     *     {@link ControlState }
     *
     */
    public ControlState getAdministrativeState() {
        return administrativeState;
    }

    /**
     * Sets the value of the administrativeState property.
     *
     * @param value
     *     allowed object is
     *     {@link ControlState }
     *
     */
    public void setAdministrativeState(ControlState value) {
        this.administrativeState = value;
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
     * Gets the value of the isFlexible property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsFlexible() {
        return isFlexible;
    }

    /**
     * Sets the value of the isFlexible property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsFlexible(Boolean value) {
        this.isFlexible = value;
    }

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
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link FlowDomainFragmentType }
     *
     */
    public FlowDomainFragmentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link FlowDomainFragmentType }
     *
     */
    public void setType(FlowDomainFragmentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the aEndTpDataList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
          *
     */
    public JAXBElement<ArrayOfTerminationPoint> getAEndTpDataList() {
        return aEndTpDataList;
    }

    /**
     * Sets the value of the aEndTpDataList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
          *
     */
    public void setAEndTpDataList(JAXBElement<ArrayOfTerminationPoint> value) {
        this.aEndTpDataList = value;
    }

    /**
     * Gets the value of the fdfrIsCharacterisedByFdfrRoute property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragmentRoute }{@code >}
          *
          */
    public JAXBElement<FlowDomainFragmentRoute> getFdfrIsCharacterisedByFdfrRoute() {
        return fdfrIsCharacterisedByFdfrRoute;
    }

    /**
     * Sets the value of the fdfrIsCharacterisedByFdfrRoute property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragmentRoute }{@code >}
     *
          */
         public void setFdfrIsCharacterisedByFdfrRoute(JAXBElement<FlowDomainFragmentRoute> value) {
        this.fdfrIsCharacterisedByFdfrRoute = value;
    }

    /**
     * Gets the value of the flowDomainFragmentContainedIn property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomain }{@code >}
     *
     */
    public JAXBElement<FlowDomain> getFlowDomainFragmentContainedIn() {
        return flowDomainFragmentContainedIn;
    }

    /**
     * Sets the value of the flowDomainFragmentContainedIn property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomain }{@code >}
     *
     */
    public void setFlowDomainFragmentContainedIn(JAXBElement<FlowDomain> value) {
        this.flowDomainFragmentContainedIn = value;
    }

    /**
     * Gets the value of the ituArcStateAndStatusList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getItuArcStateAndStatusList() {
        return ituArcStateAndStatusList;
    }

    /**
     * Sets the value of the ituArcStateAndStatusList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setItuArcStateAndStatusList(JAXBElement<String> value) {
        this.ituArcStateAndStatusList = value;
    }

    /**
     * Gets the value of the transmissionParameterList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTransmissionParameterList() {
        return transmissionParameterList;
    }

    /**
     * Sets the value of the transmissionParameterList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTransmissionParameterList(JAXBElement<String> value) {
        this.transmissionParameterList = value;
    }

    /**
     * Gets the value of the zEndTpDataList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfTerminationPoint> getZEndTpDataList() {
        return zEndTpDataList;
    }

    /**
     * Sets the value of the zEndTpDataList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public void setZEndTpDataList(JAXBElement<ArrayOfTerminationPoint> value) {
        this.zEndTpDataList = value;
    }

}
