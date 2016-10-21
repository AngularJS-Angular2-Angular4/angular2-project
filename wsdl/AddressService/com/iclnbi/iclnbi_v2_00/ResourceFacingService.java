
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceFacingService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceFacingService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Service">
 *       &lt;sequence>
 *         &lt;element name="rfsStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceFacingService", propOrder = {
    "rfsStatus"
})
@XmlSeeAlso({
    ResourceFacingServiceComposite.class
})
public class ResourceFacingService
    extends Service
{

    protected Integer rfsStatus;

    /**
     * Gets the value of the rfsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRfsStatus() {
        return rfsStatus;
    }

    /**
     * Sets the value of the rfsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRfsStatus(Integer value) {
        this.rfsStatus = value;
    }

}
