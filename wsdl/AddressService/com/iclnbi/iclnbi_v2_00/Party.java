
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Party complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Party">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partySubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyRoleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasCustomerRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCustomer" minOccurs="0"/>
 *         &lt;element name="HasCustomerAgentRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCustomerAgent" minOccurs="0"/>
 *         &lt;element name="HasPartyRoles" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPartyRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", propOrder = {
    "partyId",
    "partyFirstName",
    "partyLastName",
    "partyType",
    "partySubType",
    "partyRoleType",
    "hasCustomerRole",
    "hasCustomerAgentRole",
    "hasPartyRoles"
})
public class Party
    extends Entity
{

    @XmlElementRef(name = "partyId", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyId;
    @XmlElementRef(name = "partyFirstName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyFirstName;
    @XmlElementRef(name = "partyLastName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyLastName;
    @XmlElementRef(name = "partyType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyType;
    @XmlElementRef(name = "partySubType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partySubType;
    @XmlElementRef(name = "partyRoleType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyRoleType;
    @XmlElementRef(name = "HasCustomerRole", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomer> hasCustomerRole;
    @XmlElementRef(name = "HasCustomerAgentRole", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomerAgent> hasCustomerAgentRole;
    @XmlElementRef(name = "HasPartyRoles", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPartyRole> hasPartyRoles;

    /**
     * Gets the value of the partyId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPartyId(JAXBElement<String> value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the partyFirstName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPartyFirstName() {
        return partyFirstName;
    }

    /**
     * Sets the value of the partyFirstName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPartyFirstName(JAXBElement<String> value) {
        this.partyFirstName = value;
    }

    /**
     * Gets the value of the partyLastName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPartyLastName() {
        return partyLastName;
    }

    /**
     * Sets the value of the partyLastName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPartyLastName(JAXBElement<String> value) {
        this.partyLastName = value;
    }

    /**
     * Gets the value of the partyType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPartyType(JAXBElement<String> value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the partySubType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getPartySubType() {
        return partySubType;
    }

    /**
     * Sets the value of the partySubType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setPartySubType(JAXBElement<String> value) {
        this.partySubType = value;
    }

    /**
     * Gets the value of the partyRoleType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getPartyRoleType() {
        return partyRoleType;
    }

    /**
     * Sets the value of the partyRoleType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setPartyRoleType(JAXBElement<String> value) {
        this.partyRoleType = value;
    }

    /**
     * Gets the value of the hasCustomerRole property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}
     *
     */
         public JAXBElement<ArrayOfCustomer> getHasCustomerRole() {
        return hasCustomerRole;
    }

    /**
     * Sets the value of the hasCustomerRole property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}
     *
     */
         public void setHasCustomerRole(JAXBElement<ArrayOfCustomer> value) {
        this.hasCustomerRole = value;
    }

    /**
     * Gets the value of the hasCustomerAgentRole property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomerAgent }{@code >}
     *
     */
         public JAXBElement<ArrayOfCustomerAgent> getHasCustomerAgentRole() {
        return hasCustomerAgentRole;
    }

    /**
     * Sets the value of the hasCustomerAgentRole property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomerAgent }{@code >}
     *
     */
    public void setHasCustomerAgentRole(JAXBElement<ArrayOfCustomerAgent> value) {
        this.hasCustomerAgentRole = value;
    }

    /**
     * Gets the value of the hasPartyRoles property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPartyRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfPartyRole> getHasPartyRoles() {
        return hasPartyRoles;
    }

    /**
     * Sets the value of the hasPartyRoles property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPartyRole }{@code >}
     *
     */
    public void setHasPartyRoles(JAXBElement<ArrayOfPartyRole> value) {
        this.hasPartyRoles = value;
    }

}
