
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResponseDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SearchResponseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Party" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfParty" minOccurs="0"/>
 *         &lt;element name="AddressDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfAmericanPropertyAddress" minOccurs="0"/>
 *         &lt;element name="Circuit" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfSubNetworkConnection" minOccurs="0"/>
 *         &lt;element name="P2PCircuit" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTopologicalLink" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPhysicalDevice" minOccurs="0"/>
 *         &lt;element name="BusinessInteraction" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfBusinessInteraction" minOccurs="0"/>
 *         &lt;element name="TerminationPoint" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TerminationPoint" minOccurs="0"/>
 *         &lt;element name="NumberObject" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfService" minOccurs="0"/>
 *         &lt;element name="Flow" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Flow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResponseDetails", propOrder = {
    "party",
    "addressDetails",
    "circuit",
    "p2PCircuit",
    "device",
    "businessInteraction",
    "terminationPoint",
    "numberObject",
    "service",
    "flow"
})
public class SearchResponseDetails {

    @XmlElementRef(name = "Party", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParty> party;
    @XmlElementRef(name = "AddressDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAmericanPropertyAddress> addressDetails;
    @XmlElementRef(name = "Circuit", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubNetworkConnection> circuit;
    @XmlElementRef(name = "P2PCircuit", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTopologicalLink> p2PCircuit;
    @XmlElementRef(name = "Device", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhysicalDevice> device;
    @XmlElementRef(name = "BusinessInteraction", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBusinessInteraction> businessInteraction;
    @XmlElementRef(name = "TerminationPoint", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminationPoint> terminationPoint;
    @XmlElementRef(name = "NumberObject", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LogicalResource> numberObject;
    @XmlElementRef(name = "Service", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfService> service;
    @XmlElementRef(name = "Flow", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Flow> flow;

    /**
     * Gets the value of the party property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfParty }{@code >}
     *
     */
    public JAXBElement<ArrayOfParty> getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfParty }{@code >}
     *
     */
    public void setParty(JAXBElement<ArrayOfParty> value) {
        this.party = value;
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
     * Gets the value of the circuit property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubNetworkConnection }{@code >}
     *
     */
    public JAXBElement<ArrayOfSubNetworkConnection> getCircuit() {
        return circuit;
    }

    /**
     * Sets the value of the circuit property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubNetworkConnection }{@code >}
     *
     */
    public void setCircuit(JAXBElement<ArrayOfSubNetworkConnection> value) {
        this.circuit = value;
    }

    /**
     * Gets the value of the p2PCircuit property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTopologicalLink }{@code >}
     *
     */
    public JAXBElement<ArrayOfTopologicalLink> getP2PCircuit() {
        return p2PCircuit;
    }

    /**
     * Sets the value of the p2PCircuit property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTopologicalLink }{@code >}
     *
     */
    public void setP2PCircuit(JAXBElement<ArrayOfTopologicalLink> value) {
        this.p2PCircuit = value;
    }

    /**
     * Gets the value of the device property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalDevice }{@code >}
     *
     */
    public JAXBElement<ArrayOfPhysicalDevice> getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPhysicalDevice }{@code >}
     *
     */
    public void setDevice(JAXBElement<ArrayOfPhysicalDevice> value) {
        this.device = value;
    }

    /**
     * Gets the value of the businessInteraction property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfBusinessInteraction }{@code >}
     *
     */
    public JAXBElement<ArrayOfBusinessInteraction> getBusinessInteraction() {
        return businessInteraction;
    }

    /**
     * Sets the value of the businessInteraction property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfBusinessInteraction }{@code >}
          *
     */
    public void setBusinessInteraction(JAXBElement<ArrayOfBusinessInteraction> value) {
        this.businessInteraction = value;
    }

    /**
     * Gets the value of the terminationPoint property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TerminationPoint }{@code >}
     *
          */
         public JAXBElement<TerminationPoint> getTerminationPoint() {
        return terminationPoint;
    }

    /**
     * Sets the value of the terminationPoint property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TerminationPoint }{@code >}
     *
     */
         public void setTerminationPoint(JAXBElement<TerminationPoint> value) {
        this.terminationPoint = value;
    }

    /**
     * Gets the value of the numberObject property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LogicalResource }{@code >}
     *
     */
    public JAXBElement<LogicalResource> getNumberObject() {
        return numberObject;
    }

    /**
     * Sets the value of the numberObject property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LogicalResource }{@code >}
     *
     */
    public void setNumberObject(JAXBElement<LogicalResource> value) {
        this.numberObject = value;
    }

    /**
     * Gets the value of the service property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfService }{@code >}
     *
     */
    public JAXBElement<ArrayOfService> getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfService }{@code >}
     *
     */
    public void setService(JAXBElement<ArrayOfService> value) {
        this.service = value;
    }

    /**
     * Gets the value of the flow property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Flow }{@code >}
     *
     */
    public JAXBElement<Flow> getFlow() {
            return flow;
    }

    /**
     * Sets the value of the flow property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Flow }{@code >}
     *
     */
    public void setFlow(JAXBElement<Flow> value) {
            this.flow = value;
    }

}
