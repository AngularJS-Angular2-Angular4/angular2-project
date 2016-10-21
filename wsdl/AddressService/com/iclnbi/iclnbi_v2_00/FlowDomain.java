
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for FlowDomain complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FlowDomain">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="connectivityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomainType" minOccurs="0"/>
 *         &lt;element name="FlowDomainContainedIn" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ManagementDomain" minOccurs="0"/>
 *         &lt;element name="ituArcStateAndStatusList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmissionParameterList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="FlowDomainFlow" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfMatrixFlowDomain" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDomain", propOrder = {
    "connectivityState",
    "type",
    "flowDomainContainedIn",
    "ituArcStateAndStatusList",
    "transmissionParameterList",
    "flowDomainFlow"
})
public class FlowDomain
    extends LogicalResource
{

    @XmlElementRef(name = "connectivityState", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> connectivityState;
    @XmlSchemaType(name = "string")
    protected FlowDomainType type;
    @XmlElementRef(name = "FlowDomainContainedIn", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ManagementDomain> flowDomainContainedIn;
    @XmlElementRef(name = "ituArcStateAndStatusList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ituArcStateAndStatusList;
    @XmlElementRef(name = "transmissionParameterList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> transmissionParameterList;
    @XmlElementRef(name = "FlowDomainFlow", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMatrixFlowDomain> flowDomainFlow;

    /**
     * Gets the value of the connectivityState property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getConnectivityState() {
        return connectivityState;
    }

    /**
     * Sets the value of the connectivityState property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setConnectivityState(JAXBElement<String> value) {
        this.connectivityState = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link FlowDomainType }
     *
     */
    public FlowDomainType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link FlowDomainType }
     *
     */
    public void setType(FlowDomainType value) {
        this.type = value;
    }

    /**
     * Gets the value of the flowDomainContainedIn property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ManagementDomain }{@code >}
     *
     */
    public JAXBElement<ManagementDomain> getFlowDomainContainedIn() {
        return flowDomainContainedIn;
    }

    /**
     * Sets the value of the flowDomainContainedIn property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ManagementDomain }{@code >}
     *
     */
    public void setFlowDomainContainedIn(JAXBElement<ManagementDomain> value) {
        this.flowDomainContainedIn = value;
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
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getTransmissionParameterList() {
        return transmissionParameterList;
    }

    /**
     * Sets the value of the transmissionParameterList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setTransmissionParameterList(JAXBElement<ArrayOfstring> value) {
        this.transmissionParameterList = value;
    }

    /**
     * Gets the value of the flowDomainFlow property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfMatrixFlowDomain }{@code >}
     *
     */
    public JAXBElement<ArrayOfMatrixFlowDomain> getFlowDomainFlow() {
        return flowDomainFlow;
    }

    /**
     * Sets the value of the flowDomainFlow property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfMatrixFlowDomain }{@code >}
     *
     */
    public void setFlowDomainFlow(JAXBElement<ArrayOfMatrixFlowDomain> value) {
        this.flowDomainFlow = value;
    }

}
