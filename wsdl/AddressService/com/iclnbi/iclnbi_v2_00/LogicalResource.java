
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicalResource complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LogicalResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Resource">
 *       &lt;sequence>
 *         &lt;element name="lrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isOperational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LogicalPhysicalResource" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfLogicalPhysicalResource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalResource", propOrder = {
    "lrStatus",
    "serviceState",
    "isOperational",
    "logicalPhysicalResource"
})
@XmlSeeAlso({
    Protocol.class,
    NetworkAddress.class,
    FlowDomainFragment.class,
    FlowDomain.class,
    Flow.class,
    SubNetworkConnection.class,
    ManagedTransmissionEntity.class,
    MatrixFlowDomain.class,
    TopologicalLink.class
})
public class LogicalResource
    extends Resource
{

    @XmlElementRef(name = "lrStatus", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lrStatus;
    @XmlElementRef(name = "serviceState", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceState;
    protected Boolean isOperational;
    @XmlElementRef(name = "LogicalPhysicalResource", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLogicalPhysicalResource> logicalPhysicalResource;

    /**
     * Gets the value of the lrStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLrStatus() {
        return lrStatus;
    }

    /**
     * Sets the value of the lrStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLrStatus(JAXBElement<String> value) {
        this.lrStatus = value;
    }

    /**
     * Gets the value of the serviceState property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceState() {
        return serviceState;
    }

    /**
     * Sets the value of the serviceState property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceState(JAXBElement<String> value) {
        this.serviceState = value;
    }

    /**
     * Gets the value of the isOperational property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsOperational() {
        return isOperational;
    }

    /**
     * Sets the value of the isOperational property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsOperational(Boolean value) {
        this.isOperational = value;
    }

    /**
     * Gets the value of the logicalPhysicalResource property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLogicalPhysicalResource }{@code >}
     *
     */
    public JAXBElement<ArrayOfLogicalPhysicalResource> getLogicalPhysicalResource() {
        return logicalPhysicalResource;
    }

    /**
     * Sets the value of the logicalPhysicalResource property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfLogicalPhysicalResource }{@code >}
     *
     */
    public void setLogicalPhysicalResource(JAXBElement<ArrayOfLogicalPhysicalResource> value) {
        this.logicalPhysicalResource = value;
    }

}
