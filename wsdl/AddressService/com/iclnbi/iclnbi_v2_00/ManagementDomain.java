
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagementDomain complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ManagementDomain">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="ScopedManagedEntities" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfManagedEntity" minOccurs="0"/>
 *         &lt;element name="HasManagementDomains" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfManagementDomain" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementDomain", propOrder = {
    "scopedManagedEntities",
    "hasManagementDomains"
})
public class ManagementDomain
    extends RootEntity
{

    @XmlElementRef(name = "ScopedManagedEntities", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfManagedEntity> scopedManagedEntities;
    @XmlElementRef(name = "HasManagementDomains", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfManagementDomain> hasManagementDomains;

    /**
     * Gets the value of the scopedManagedEntities property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfManagedEntity }{@code >}
     *
     */
    public JAXBElement<ArrayOfManagedEntity> getScopedManagedEntities() {
        return scopedManagedEntities;
    }

    /**
     * Sets the value of the scopedManagedEntities property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfManagedEntity }{@code >}
     *
     */
    public void setScopedManagedEntities(JAXBElement<ArrayOfManagedEntity> value) {
        this.scopedManagedEntities = value;
    }

    /**
     * Gets the value of the hasManagementDomains property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfManagementDomain }{@code >}
     *
     */
    public JAXBElement<ArrayOfManagementDomain> getHasManagementDomains() {
        return hasManagementDomains;
    }

    /**
     * Sets the value of the hasManagementDomains property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfManagementDomain }{@code >}
     *
     */
    public void setHasManagementDomains(JAXBElement<ArrayOfManagementDomain> value) {
        this.hasManagementDomains = value;
    }

}
