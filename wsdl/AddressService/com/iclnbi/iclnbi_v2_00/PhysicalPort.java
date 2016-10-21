
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalPort complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PhysicalPort">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ManagedHardware">
 *       &lt;sequence>
 *         &lt;element name="duplexMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ifType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="portNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="typeOfPPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vendorPortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pluggableType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wavelength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DPEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markedForDeletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionTerminationPoint" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfConnectionTerminationPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalPort", propOrder = {
    "duplexMode",
    "ifType",
    "portNumber",
    "typeOfPPort",
    "vendorPortName",
    "pluggableType",
    "wavelength",
    "bandwidth",
    "portFunction",
    "dpea",
    "markedForDeletion",
    "connectionTerminationPoint"
})
public class PhysicalPort
    extends ManagedHardware
{

    protected Integer duplexMode;
    protected Integer ifType;
    protected Integer portNumber;
    protected Integer typeOfPPort;
    @XmlElementRef(name = "vendorPortName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorPortName;
    @XmlElementRef(name = "pluggableType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pluggableType;
    @XmlElementRef(name = "wavelength", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wavelength;
    @XmlElementRef(name = "bandwidth", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bandwidth;
    @XmlElementRef(name = "portFunction", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portFunction;
    @XmlElementRef(name = "DPEA", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dpea;
    @XmlElementRef(name = "markedForDeletion", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markedForDeletion;
    @XmlElementRef(name = "ConnectionTerminationPoint", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConnectionTerminationPoint> connectionTerminationPoint;

    /**
     * Gets the value of the duplexMode property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDuplexMode() {
        return duplexMode;
    }

    /**
     * Sets the value of the duplexMode property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDuplexMode(Integer value) {
        this.duplexMode = value;
    }

    /**
     * Gets the value of the ifType property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIfType() {
        return ifType;
    }

    /**
     * Sets the value of the ifType property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIfType(Integer value) {
        this.ifType = value;
    }

    /**
     * Gets the value of the portNumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPortNumber(Integer value) {
        this.portNumber = value;
    }

    /**
     * Gets the value of the typeOfPPort property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeOfPPort() {
        return typeOfPPort;
    }

    /**
     * Sets the value of the typeOfPPort property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeOfPPort(Integer value) {
        this.typeOfPPort = value;
    }

    /**
     * Gets the value of the vendorPortName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getVendorPortName() {
        return vendorPortName;
    }

    /**
     * Sets the value of the vendorPortName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setVendorPortName(JAXBElement<String> value) {
        this.vendorPortName = value;
    }

    /**
     * Gets the value of the pluggableType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getPluggableType() {
        return pluggableType;
    }

    /**
     * Sets the value of the pluggableType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setPluggableType(JAXBElement<String> value) {
        this.pluggableType = value;
    }

    /**
     * Gets the value of the wavelength property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getWavelength() {
        return wavelength;
    }

    /**
     * Sets the value of the wavelength property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setWavelength(JAXBElement<String> value) {
        this.wavelength = value;
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
     * Gets the value of the portFunction property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPortFunction() {
        return portFunction;
    }

    /**
     * Sets the value of the portFunction property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPortFunction(JAXBElement<String> value) {
        this.portFunction = value;
    }

    /**
     * Gets the value of the dpea property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDPEA() {
            return dpea;
    }

    /**
     * Sets the value of the dpea property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDPEA(JAXBElement<String> value) {
            this.dpea = value;
    }

    /**
     * Gets the value of the markedForDeletion property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMarkedForDeletion() {
            return markedForDeletion;
    }

    /**
     * Sets the value of the markedForDeletion property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMarkedForDeletion(JAXBElement<String> value) {
            this.markedForDeletion = value;
    }

    /**
     * Gets the value of the connectionTerminationPoint property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfConnectionTerminationPoint> getConnectionTerminationPoint() {
        return connectionTerminationPoint;
    }

    /**
     * Sets the value of the connectionTerminationPoint property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public void setConnectionTerminationPoint(JAXBElement<ArrayOfConnectionTerminationPoint> value) {
        this.connectionTerminationPoint = value;
    }

}
