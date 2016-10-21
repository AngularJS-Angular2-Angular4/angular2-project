
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceRelationship complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResourceRelationship">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="typeOfRDependency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfIPAddress" minOccurs="0"/>
 *         &lt;element name="TerminationPoint" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTerminationPoint" minOccurs="0"/>
 *         &lt;element name="CTP" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfConnectionTerminationPoint" minOccurs="0"/>
 *         &lt;element name="PTP" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPhysicalPort" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PhysicalDevice" minOccurs="0"/>
 *         &lt;element name="Circuit" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Point2PointCircuit" minOccurs="0"/>
 *         &lt;element name="Protocol" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfProtocol" minOccurs="0"/>
 *         &lt;element name="Resource" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResource" minOccurs="0"/>
 *         &lt;element name="AddressDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfAmericanPropertyAddress" minOccurs="0"/>
 *         &lt;element name="FlowPoint" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTerminationPoint" minOccurs="0"/>
 *         &lt;element name="LinkFlow" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfFlowDomainFragment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceRelationship", propOrder = {
    "typeOfRDependency",
    "ipAddress",
    "terminationPoint",
    "ctp",
    "ptp",
    "device",
    "circuit",
    "protocol",
    "resource",
    "addressDetails",
    "flowPoint",
    "linkFlow"
})
public class ResourceRelationship
    extends Entity
{

    @XmlElementRef(name = "typeOfRDependency", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeOfRDependency;
    @XmlElementRef(name = "IPAddress", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfIPAddress> ipAddress;
    @XmlElementRef(name = "TerminationPoint", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerminationPoint> terminationPoint;
    @XmlElementRef(name = "CTP", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConnectionTerminationPoint> ctp;
    @XmlElementRef(name = "PTP", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhysicalPort> ptp;
    @XmlElementRef(name = "Device", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PhysicalDevice> device;
    @XmlElementRef(name = "Circuit", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Point2PointCircuit> circuit;
    @XmlElementRef(name = "Protocol", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProtocol> protocol;
    @XmlElementRef(name = "Resource", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResource> resource;
    @XmlElementRef(name = "AddressDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAmericanPropertyAddress> addressDetails;
    @XmlElementRef(name = "FlowPoint", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerminationPoint> flowPoint;
    @XmlElementRef(name = "LinkFlow", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlowDomainFragment> linkFlow;

    /**
     * Gets the value of the typeOfRDependency property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTypeOfRDependency() {
        return typeOfRDependency;
    }

    /**
     * Sets the value of the typeOfRDependency property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTypeOfRDependency(JAXBElement<String> value) {
        this.typeOfRDependency = value;
    }

    /**
     * Gets the value of the ipAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfIPAddress }{@code >}
     *
     */
    public JAXBElement<ArrayOfIPAddress> getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfIPAddress }{@code >}
     *
     */
    public void setIPAddress(JAXBElement<ArrayOfIPAddress> value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the terminationPoint property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfTerminationPoint> getTerminationPoint() {
        return terminationPoint;
    }

    /**
     * Sets the value of the terminationPoint property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public void setTerminationPoint(JAXBElement<ArrayOfTerminationPoint> value) {
        this.terminationPoint = value;
    }

    /**
     * Gets the value of the ctp property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfConnectionTerminationPoint> getCTP() {
        return ctp;
    }

    /**
     * Sets the value of the ctp property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public void setCTP(JAXBElement<ArrayOfConnectionTerminationPoint> value) {
        this.ctp = value;
    }

    /**
     * Gets the value of the ptp property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalPort }{@code >}
     *
     */
    public JAXBElement<ArrayOfPhysicalPort> getPTP() {
        return ptp;
    }

    /**
     * Sets the value of the ptp property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalPort }{@code >}
     *
     */
    public void setPTP(JAXBElement<ArrayOfPhysicalPort> value) {
        this.ptp = value;
    }

    /**
     * Gets the value of the device property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PhysicalDevice }{@code >}
     *
     */
    public JAXBElement<PhysicalDevice> getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PhysicalDevice }{@code >}
     *
     */
    public void setDevice(JAXBElement<PhysicalDevice> value) {
        this.device = value;
    }

    /**
     * Gets the value of the circuit property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Point2PointCircuit }{@code >}
     *
     */
    public JAXBElement<Point2PointCircuit> getCircuit() {
        return circuit;
    }

    /**
     * Sets the value of the circuit property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Point2PointCircuit }{@code >}
     *
     */
    public void setCircuit(JAXBElement<Point2PointCircuit> value) {
        this.circuit = value;
    }

    /**
     * Gets the value of the protocol property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfProtocol }{@code >}
     *
     */
    public JAXBElement<ArrayOfProtocol> getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfProtocol }{@code >}
     *
     */
    public void setProtocol(JAXBElement<ArrayOfProtocol> value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the resource property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResource }{@code >}
     *
     */
    public JAXBElement<ArrayOfResource> getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResource }{@code >}
     *
     */
    public void setResource(JAXBElement<ArrayOfResource> value) {
        this.resource = value;
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
     * Gets the value of the flowPoint property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfTerminationPoint> getFlowPoint() {
        return flowPoint;
    }

    /**
     * Sets the value of the flowPoint property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTerminationPoint }{@code >}
     *
     */
    public void setFlowPoint(JAXBElement<ArrayOfTerminationPoint> value) {
        this.flowPoint = value;
    }

    /**
     * Gets the value of the linkFlow property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfFlowDomainFragment }{@code >}
     *
     */
    public JAXBElement<ArrayOfFlowDomainFragment> getLinkFlow() {
        return linkFlow;
    }

    /**
     * Sets the value of the linkFlow property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfFlowDomainFragment }{@code >}
     *
     */
    public void setLinkFlow(JAXBElement<ArrayOfFlowDomainFragment> value) {
        this.linkFlow = value;
    }

}
