
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolServiceDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProtocolServiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ManagedEntity">
 *       &lt;sequence>
 *         &lt;element name="ResourceFacingService" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResourceFacingService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolServiceDetails", propOrder = {
    "resourceFacingService"
})
public class ProtocolServiceDetails
    extends ManagedEntity
{

    @XmlElementRef(name = "ResourceFacingService", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceFacingService> resourceFacingService;

    /**
     * Gets the value of the resourceFacingService property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceFacingService }{@code >}
     *
     */
    public JAXBElement<ArrayOfResourceFacingService> getResourceFacingService() {
        return resourceFacingService;
    }

    /**
     * Sets the value of the resourceFacingService property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceFacingService }{@code >}
     *
     */
    public void setResourceFacingService(JAXBElement<ArrayOfResourceFacingService> value) {
        this.resourceFacingService = value;
    }

}
