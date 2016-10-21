
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceFacingServiceComposite complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResourceFacingServiceComposite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ResourceFacingService">
 *       &lt;sequence>
 *         &lt;element name="RFSCompositeHasRFServices" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResourceFacingService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceFacingServiceComposite", propOrder = {
    "rfsCompositeHasRFServices"
})
@XmlSeeAlso({
    ServiceBundle.class
})
public class ResourceFacingServiceComposite
    extends ResourceFacingService
{

    @XmlElementRef(name = "RFSCompositeHasRFServices", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceFacingService> rfsCompositeHasRFServices;

    /**
     * Gets the value of the rfsCompositeHasRFServices property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceFacingService }{@code >}
     *
     */
    public JAXBElement<ArrayOfResourceFacingService> getRFSCompositeHasRFServices() {
        return rfsCompositeHasRFServices;
    }

    /**
     * Sets the value of the rfsCompositeHasRFServices property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResourceFacingService }{@code >}
     *
     */
    public void setRFSCompositeHasRFServices(JAXBElement<ArrayOfResourceFacingService> value) {
        this.rfsCompositeHasRFServices = value;
    }

}
