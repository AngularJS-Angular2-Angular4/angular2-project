
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedEntity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ManagedEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="managementMethodCurrent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="managementMethodSupported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EntityHasRoles" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEntityRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedEntity", propOrder = {
    "managementMethodCurrent",
    "managementMethodSupported",
    "entityHasRoles"
})
@XmlSeeAlso({
    ProtocolDeviceInterfaceDetails.class,
    ProtocolServiceDetails.class,
    Resource.class
})
public class ManagedEntity
    extends Entity
{

    protected Integer managementMethodCurrent;
    protected Integer managementMethodSupported;
    @XmlElementRef(name = "EntityHasRoles", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEntityRole> entityHasRoles;

    /**
     * Gets the value of the managementMethodCurrent property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getManagementMethodCurrent() {
        return managementMethodCurrent;
    }

    /**
     * Sets the value of the managementMethodCurrent property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setManagementMethodCurrent(Integer value) {
        this.managementMethodCurrent = value;
    }

    /**
     * Gets the value of the managementMethodSupported property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getManagementMethodSupported() {
        return managementMethodSupported;
    }

    /**
     * Sets the value of the managementMethodSupported property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setManagementMethodSupported(Integer value) {
        this.managementMethodSupported = value;
    }

    /**
     * Gets the value of the entityHasRoles property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEntityRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfEntityRole> getEntityHasRoles() {
        return entityHasRoles;
    }

    /**
     * Sets the value of the entityHasRoles property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEntityRole }{@code >}
     *
     */
    public void setEntityHasRoles(JAXBElement<ArrayOfEntityRole> value) {
        this.entityHasRoles = value;
    }

}
