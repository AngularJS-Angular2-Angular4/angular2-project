
package com.ctl.as.domain.geo.types.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.InputAddress;
import com.ctl.as.domain.geo.types.SourceSystem;


/**
 * <p>Java class for GetServiceAddressLiveRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetServiceAddressLiveRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/Types/Request}AddressManagementRequest">
 *       &lt;sequence>
 *         &lt;element name="SourceSystem" type="{http://geo.domain.as.ctl.com/Types}SourceSystem" minOccurs="0"/>
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
@XmlType(name = "GetServiceAddressLiveRequest", propOrder = {
    "sourceSystem",
    "inputAddress"
})
public class GetServiceAddressLiveRequest
    extends AddressManagementRequest
{

    @XmlElement(name = "SourceSystem")
    @XmlSchemaType(name = "string")
    protected SourceSystem sourceSystem;
    @XmlElementRef(name = "InputAddress", namespace = "http://geo.domain.as.ctl.com/Types/Request", type = JAXBElement.class, required = false)
    protected JAXBElement<InputAddress> inputAddress;

    /**
     * Gets the value of the sourceSystem property.
     *
     * @return
     *     possible object is
     *     {@link SourceSystem }
     *
     */
    public SourceSystem getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     *
     * @param value
     *     allowed object is
     *     {@link SourceSystem }
     *
     */
    public void setSourceSystem(SourceSystem value) {
        this.sourceSystem = value;
    }

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
