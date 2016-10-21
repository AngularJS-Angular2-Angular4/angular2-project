
package com.ctl.as.domain.geo.types.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.InputAddress;


/**
 * <p>Java class for ClcSearchResourceProxyRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ClcSearchResourceProxyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/Types/Request}AddressManagementRequest">
 *       &lt;sequence>
 *         &lt;element name="InputAddress" type="{http://geo.domain.as.ctl.com/Types}InputAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClcSearchResourceProxyRequest", propOrder = {
    "inputAddress"
})
public class ClcSearchResourceProxyRequest
    extends AddressManagementRequest
{

    @XmlElementRef(name = "InputAddress", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<InputAddress> inputAddress;

    /**
     * Gets the value of the inputAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InputAddress }{@code >}
     *
     */
    public JAXBElement<InputAddress> getInputAddress() {
        return inputAddress;
    }

    /**
     * Sets the value of the inputAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InputAddress }{@code >}
     *
     */
    public void setInputAddress(JAXBElement<InputAddress> value) {
        this.inputAddress = value;
    }

}
