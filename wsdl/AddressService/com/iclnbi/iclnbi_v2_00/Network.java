
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Network complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Network">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Resource">
 *       &lt;sequence>
 *         &lt;element name="isNetworkOperational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="layerRates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkAdministrativeState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="networkAlarmStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Network", propOrder = {
    "isNetworkOperational",
    "layerRates",
    "networkAdministrativeState",
    "networkAlarmStatus"
})
public class Network
    extends Resource
{

    protected Boolean isNetworkOperational;
    @XmlElementRef(name = "layerRates", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layerRates;
    protected Integer networkAdministrativeState;
    protected Integer networkAlarmStatus;

    /**
     * Gets the value of the isNetworkOperational property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsNetworkOperational() {
        return isNetworkOperational;
    }

    /**
     * Sets the value of the isNetworkOperational property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsNetworkOperational(Boolean value) {
        this.isNetworkOperational = value;
    }

    /**
     * Gets the value of the layerRates property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLayerRates() {
        return layerRates;
    }

    /**
     * Sets the value of the layerRates property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLayerRates(JAXBElement<String> value) {
        this.layerRates = value;
    }

    /**
     * Gets the value of the networkAdministrativeState property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getNetworkAdministrativeState() {
        return networkAdministrativeState;
    }

    /**
     * Sets the value of the networkAdministrativeState property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setNetworkAdministrativeState(Integer value) {
        this.networkAdministrativeState = value;
    }

    /**
     * Gets the value of the networkAlarmStatus property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getNetworkAlarmStatus() {
        return networkAlarmStatus;
    }

    /**
     * Sets the value of the networkAlarmStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setNetworkAlarmStatus(Integer value) {
        this.networkAlarmStatus = value;
    }

}
