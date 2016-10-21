
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Route complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Route">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isIntendedRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="actualState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ActualState" minOccurs="0"/>
 *         &lt;element name="administrativeState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ControlState" minOccurs="0"/>
 *         &lt;element name="isInUseBy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isExclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="topologicalLinkList" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTopologicalLink" minOccurs="0"/>
 *         &lt;element name="crossConnectList" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCrossConnect" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", propOrder = {
    "routeIdentifier",
    "isIntendedRoute",
    "actualState",
    "administrativeState",
    "isInUseBy",
    "isExclusive",
    "topologicalLinkList",
    "crossConnectList"
})
public class Route {

    @XmlElementRef(name = "routeIdentifier", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifier;
    protected Boolean isIntendedRoute;
    @XmlSchemaType(name = "string")
    protected ActualState actualState;
    @XmlSchemaType(name = "string")
    protected ControlState administrativeState;
    protected Boolean isInUseBy;
    protected Boolean isExclusive;
    @XmlElementRef(name = "topologicalLinkList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTopologicalLink> topologicalLinkList;
    @XmlElementRef(name = "crossConnectList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCrossConnect> crossConnectList;

    /**
     * Gets the value of the routeIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRouteIdentifier() {
        return routeIdentifier;
    }

    /**
     * Sets the value of the routeIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRouteIdentifier(JAXBElement<String> value) {
        this.routeIdentifier = value;
    }

    /**
     * Gets the value of the isIntendedRoute property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsIntendedRoute() {
        return isIntendedRoute;
    }

    /**
     * Sets the value of the isIntendedRoute property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsIntendedRoute(Boolean value) {
        this.isIntendedRoute = value;
    }

    /**
     * Gets the value of the actualState property.
     *
     * @return
     *     possible object is
     *     {@link ActualState }
     *
     */
    public ActualState getActualState() {
        return actualState;
    }

    /**
     * Sets the value of the actualState property.
     *
     * @param value
     *     allowed object is
     *     {@link ActualState }
     *
     */
    public void setActualState(ActualState value) {
        this.actualState = value;
    }

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
     * Gets the value of the isInUseBy property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsInUseBy() {
        return isInUseBy;
    }

    /**
     * Sets the value of the isInUseBy property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsInUseBy(Boolean value) {
        this.isInUseBy = value;
    }

    /**
     * Gets the value of the isExclusive property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsExclusive() {
        return isExclusive;
    }

    /**
     * Sets the value of the isExclusive property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsExclusive(Boolean value) {
        this.isExclusive = value;
    }

    /**
     * Gets the value of the topologicalLinkList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTopologicalLink }{@code >}
     *
          */
    public JAXBElement<ArrayOfTopologicalLink> getTopologicalLinkList() {
        return topologicalLinkList;
    }

    /**
     * Sets the value of the topologicalLinkList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTopologicalLink }{@code >}
     *
          */
         public void setTopologicalLinkList(JAXBElement<ArrayOfTopologicalLink> value) {
        this.topologicalLinkList = value;
    }

    /**
     * Gets the value of the crossConnectList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCrossConnect }{@code >}
     *
     */
    public JAXBElement<ArrayOfCrossConnect> getCrossConnectList() {
        return crossConnectList;
    }

    /**
     * Sets the value of the crossConnectList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCrossConnect }{@code >}
     *
     */
    public void setCrossConnectList(JAXBElement<ArrayOfCrossConnect> value) {
        this.crossConnectList = value;
    }

}
