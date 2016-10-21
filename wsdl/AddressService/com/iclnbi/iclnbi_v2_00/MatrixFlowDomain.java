
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for MatrixFlowDomain complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MatrixFlowDomain">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="isFlexible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tmdState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TransmissionDescriptorState" minOccurs="0"/>
 *         &lt;element name="FdHasAssociatedMfds" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomain" minOccurs="0"/>
 *         &lt;element name="ituArcStateAndStatusList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatrixFlowDomainContainedIn" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ManagedEntity" minOccurs="0"/>
 *         &lt;element name="transmissionParameterList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="FlowPoint" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTerminationPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixFlowDomain", propOrder = {
    "isFlexible",
    "tmdState",
    "fdHasAssociatedMfds",
    "ituArcStateAndStatusList",
    "matrixFlowDomainContainedIn",
    "transmissionParameterList",
    "flowPoint"
})
public class MatrixFlowDomain
    extends LogicalResource
{

    protected Boolean isFlexible;
    @XmlSchemaType(name = "string")
    protected TransmissionDescriptorState tmdState;
    @XmlElementRef(name = "FdHasAssociatedMfds", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<FlowDomain> fdHasAssociatedMfds;
    @XmlElementRef(name = "ituArcStateAndStatusList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ituArcStateAndStatusList;
    @XmlElementRef(name = "MatrixFlowDomainContainedIn", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ManagedEntity> matrixFlowDomainContainedIn;
    @XmlElementRef(name = "transmissionParameterList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> transmissionParameterList;
    @XmlElementRef(name = "FlowPoint", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerminationPoint> flowPoint;

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
     * Gets the value of the tmdState property.
     *
     * @return
     *     possible object is
     *     {@link TransmissionDescriptorState }
     *
     */
    public TransmissionDescriptorState getTmdState() {
        return tmdState;
    }

    /**
     * Sets the value of the tmdState property.
     *
     * @param value
     *     allowed object is
     *     {@link TransmissionDescriptorState }
     *
     */
    public void setTmdState(TransmissionDescriptorState value) {
        this.tmdState = value;
    }

    /**
     * Gets the value of the fdHasAssociatedMfds property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomain }{@code >}
     *
     */
    public JAXBElement<FlowDomain> getFdHasAssociatedMfds() {
        return fdHasAssociatedMfds;
    }

    /**
     * Sets the value of the fdHasAssociatedMfds property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomain }{@code >}
     *
     */
    public void setFdHasAssociatedMfds(JAXBElement<FlowDomain> value) {
        this.fdHasAssociatedMfds = value;
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
     * Gets the value of the matrixFlowDomainContainedIn property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ManagedEntity }{@code >}
     *
     */
    public JAXBElement<ManagedEntity> getMatrixFlowDomainContainedIn() {
        return matrixFlowDomainContainedIn;
    }

    /**
     * Sets the value of the matrixFlowDomainContainedIn property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ManagedEntity }{@code >}
          *
     */
    public void setMatrixFlowDomainContainedIn(JAXBElement<ManagedEntity> value) {
        this.matrixFlowDomainContainedIn = value;
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

}
