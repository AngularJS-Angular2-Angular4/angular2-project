
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdministerResourceDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AdministerResourceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="GrantsResourceAdminRights" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}OwnsResourceDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministerResourceDetails", propOrder = {
    "grantsResourceAdminRights"
})
public class AdministerResourceDetails
    extends Entity
{

    @XmlElementRef(name = "GrantsResourceAdminRights", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<OwnsResourceDetails> grantsResourceAdminRights;

    /**
     * Gets the value of the grantsResourceAdminRights property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OwnsResourceDetails }{@code >}
     *
     */
    public JAXBElement<OwnsResourceDetails> getGrantsResourceAdminRights() {
        return grantsResourceAdminRights;
    }

    /**
     * Sets the value of the grantsResourceAdminRights property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OwnsResourceDetails }{@code >}
     *
     */
    public void setGrantsResourceAdminRights(JAXBElement<OwnsResourceDetails> value) {
        this.grantsResourceAdminRights = value;
    }

}
