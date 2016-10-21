
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatrixFlowDomainFragment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MatrixFlowDomainFragment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ConnectionDirection" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isFlexible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mfdfrType" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomainFragmentType" minOccurs="0"/>
 *         &lt;element name="FdfrContainsMfdfrs" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomainFragment" minOccurs="0"/>
 *         &lt;element name="FdfrRouteContainsMfdfrs" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}FlowDomainFragmentRoute" minOccurs="0"/>
 *         &lt;element name="MfdContainsMfdfrs" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}MatrixFlowDomain" minOccurs="0"/>
 *         &lt;element name="transmissionParameterList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixFlowDomainFragment", propOrder = {
    "direction",
    "isActive",
    "isFlexible",
    "mfdfrType",
    "fdfrContainsMfdfrs",
    "fdfrRouteContainsMfdfrs",
    "mfdContainsMfdfrs",
    "transmissionParameterList"
})
public class MatrixFlowDomainFragment {

    @XmlSchemaType(name = "string")
    protected ConnectionDirection direction;
    protected Boolean isActive;
    protected Boolean isFlexible;
    @XmlSchemaType(name = "string")
    protected FlowDomainFragmentType mfdfrType;
    @XmlElementRef(name = "FdfrContainsMfdfrs", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<FlowDomainFragment> fdfrContainsMfdfrs;
    @XmlElementRef(name = "FdfrRouteContainsMfdfrs", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<FlowDomainFragmentRoute> fdfrRouteContainsMfdfrs;
    @XmlElementRef(name = "MfdContainsMfdfrs", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MatrixFlowDomain> mfdContainsMfdfrs;
    @XmlElementRef(name = "transmissionParameterList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionParameterList;

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
     * Gets the value of the isActive property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
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
     * Gets the value of the mfdfrType property.
     *
     * @return
     *     possible object is
     *     {@link FlowDomainFragmentType }
     *
     */
    public FlowDomainFragmentType getMfdfrType() {
        return mfdfrType;
    }

    /**
     * Sets the value of the mfdfrType property.
     *
     * @param value
     *     allowed object is
     *     {@link FlowDomainFragmentType }
     *
     */
    public void setMfdfrType(FlowDomainFragmentType value) {
        this.mfdfrType = value;
    }

    /**
     * Gets the value of the fdfrContainsMfdfrs property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragment }{@code >}
     *
     */
    public JAXBElement<FlowDomainFragment> getFdfrContainsMfdfrs() {
        return fdfrContainsMfdfrs;
    }

    /**
     * Sets the value of the fdfrContainsMfdfrs property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragment }{@code >}
     *
     */
    public void setFdfrContainsMfdfrs(JAXBElement<FlowDomainFragment> value) {
        this.fdfrContainsMfdfrs = value;
    }

    /**
     * Gets the value of the fdfrRouteContainsMfdfrs property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragmentRoute }{@code >}
     *
     */
    public JAXBElement<FlowDomainFragmentRoute> getFdfrRouteContainsMfdfrs() {
        return fdfrRouteContainsMfdfrs;
    }

    /**
     * Sets the value of the fdfrRouteContainsMfdfrs property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FlowDomainFragmentRoute }{@code >}
     *
     */
    public void setFdfrRouteContainsMfdfrs(JAXBElement<FlowDomainFragmentRoute> value) {
        this.fdfrRouteContainsMfdfrs = value;
    }

    /**
     * Gets the value of the mfdContainsMfdfrs property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MatrixFlowDomain }{@code >}
     *
     */
    public JAXBElement<MatrixFlowDomain> getMfdContainsMfdfrs() {
        return mfdContainsMfdfrs;
    }

    /**
     * Sets the value of the mfdContainsMfdfrs property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MatrixFlowDomain }{@code >}
     *
     */
    public void setMfdContainsMfdfrs(JAXBElement<MatrixFlowDomain> value) {
        this.mfdContainsMfdfrs = value;
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

}
