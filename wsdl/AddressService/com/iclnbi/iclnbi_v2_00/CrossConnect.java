
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for CrossConnect complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CrossConnect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="aEndTpRefList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ConnectionDirection" minOccurs="0"/>
 *         &lt;element name="crossConnectType" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}SubnetworkConnectionType" minOccurs="0"/>
 *         &lt;element name="isFixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="connectionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zEndTpRefList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="CcHasAEndCtps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfConnectionTerminationPoint" minOccurs="0"/>
 *         &lt;element name="CcHasZEndCtps" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfConnectionTerminationPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossConnect", propOrder = {
    "isActive",
    "aEndTpRefList",
    "direction",
    "crossConnectType",
    "isFixed",
    "connectionId",
    "zEndTpRefList",
    "ccHasAEndCtps",
    "ccHasZEndCtps"
})
public class CrossConnect {

    protected Boolean isActive;
    @XmlElementRef(name = "aEndTpRefList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> aEndTpRefList;
    @XmlSchemaType(name = "string")
    protected ConnectionDirection direction;
    @XmlSchemaType(name = "string")
    protected SubnetworkConnectionType crossConnectType;
    protected Boolean isFixed;
    @XmlElementRef(name = "connectionId", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> connectionId;
    @XmlElementRef(name = "zEndTpRefList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> zEndTpRefList;
    @XmlElementRef(name = "CcHasAEndCtps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConnectionTerminationPoint> ccHasAEndCtps;
    @XmlElementRef(name = "CcHasZEndCtps", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConnectionTerminationPoint> ccHasZEndCtps;

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
     * Gets the value of the aEndTpRefList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getAEndTpRefList() {
        return aEndTpRefList;
    }

    /**
     * Sets the value of the aEndTpRefList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setAEndTpRefList(JAXBElement<ArrayOfstring> value) {
        this.aEndTpRefList = value;
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
     * Gets the value of the crossConnectType property.
     *
     * @return
     *     possible object is
     *     {@link SubnetworkConnectionType }
     *
     */
    public SubnetworkConnectionType getCrossConnectType() {
        return crossConnectType;
    }

    /**
     * Sets the value of the crossConnectType property.
     *
     * @param value
     *     allowed object is
     *     {@link SubnetworkConnectionType }
     *
     */
    public void setCrossConnectType(SubnetworkConnectionType value) {
        this.crossConnectType = value;
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
     * Gets the value of the connectionId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getConnectionId() {
        return connectionId;
    }

    /**
     * Sets the value of the connectionId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setConnectionId(JAXBElement<String> value) {
        this.connectionId = value;
    }

    /**
     * Gets the value of the zEndTpRefList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
         public JAXBElement<ArrayOfstring> getZEndTpRefList() {
        return zEndTpRefList;
    }

    /**
     * Sets the value of the zEndTpRefList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setZEndTpRefList(JAXBElement<ArrayOfstring> value) {
        this.zEndTpRefList = value;
    }

    /**
     * Gets the value of the ccHasAEndCtps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
          */
    public JAXBElement<ArrayOfConnectionTerminationPoint> getCcHasAEndCtps() {
        return ccHasAEndCtps;
    }

    /**
     * Sets the value of the ccHasAEndCtps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
         public void setCcHasAEndCtps(JAXBElement<ArrayOfConnectionTerminationPoint> value) {
        this.ccHasAEndCtps = value;
    }

    /**
     * Gets the value of the ccHasZEndCtps property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
         public JAXBElement<ArrayOfConnectionTerminationPoint> getCcHasZEndCtps() {
        return ccHasZEndCtps;
    }

    /**
     * Sets the value of the ccHasZEndCtps property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public void setCcHasZEndCtps(JAXBElement<ArrayOfConnectionTerminationPoint> value) {
        this.ccHasZEndCtps = value;
    }

}
