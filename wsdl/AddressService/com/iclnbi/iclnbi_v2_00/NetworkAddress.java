
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NetworkAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="NetworkAddressReferences" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfNetworkAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkAddress", propOrder = {
    "networkAddressReferences"
})
@XmlSeeAlso({
    IPAddress.class
})
public class NetworkAddress
    extends LogicalResource
{

    @XmlElementRef(name = "NetworkAddressReferences", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkAddress> networkAddressReferences;

    /**
     * Gets the value of the networkAddressReferences property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfNetworkAddress }{@code >}
     *
     */
    public JAXBElement<ArrayOfNetworkAddress> getNetworkAddressReferences() {
        return networkAddressReferences;
    }

    /**
     * Sets the value of the networkAddressReferences property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfNetworkAddress }{@code >}
     *
     */
    public void setNetworkAddressReferences(JAXBElement<ArrayOfNetworkAddress> value) {
        this.networkAddressReferences = value;
    }

}
