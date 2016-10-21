
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolDeviceInterfaceDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProtocolDeviceInterfaceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ManagedEntity">
 *       &lt;sequence>
 *         &lt;element name="InterfaceDetails" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfConnectionTerminationPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolDeviceInterfaceDetails", propOrder = {
    "interfaceDetails"
})
public class ProtocolDeviceInterfaceDetails
    extends ManagedEntity
{

    @XmlElementRef(name = "InterfaceDetails", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConnectionTerminationPoint> interfaceDetails;

    /**
     * Gets the value of the interfaceDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public JAXBElement<ArrayOfConnectionTerminationPoint> getInterfaceDetails() {
        return interfaceDetails;
    }

    /**
     * Sets the value of the interfaceDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfConnectionTerminationPoint }{@code >}
     *
     */
    public void setInterfaceDetails(JAXBElement<ArrayOfConnectionTerminationPoint> value) {
        this.interfaceDetails = value;
    }

}
