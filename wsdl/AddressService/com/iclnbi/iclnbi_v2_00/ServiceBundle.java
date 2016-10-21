
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBundle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ResourceFacingServiceComposite">
 *       &lt;sequence>
 *         &lt;element name="hasMultipleQoSTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBundle", propOrder = {
    "hasMultipleQoSTypes"
})
@XmlSeeAlso({
    CoSBundle.class,
    TransmissionType.class,
    TransportType.class
})
public class ServiceBundle
    extends ResourceFacingServiceComposite
{

    protected Boolean hasMultipleQoSTypes;

    /**
     * Gets the value of the hasMultipleQoSTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMultipleQoSTypes() {
        return hasMultipleQoSTypes;
    }

    /**
     * Sets the value of the hasMultipleQoSTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMultipleQoSTypes(Boolean value) {
        this.hasMultipleQoSTypes = value;
    }

}
