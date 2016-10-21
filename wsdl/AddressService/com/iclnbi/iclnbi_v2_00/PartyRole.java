
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRole complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PartyRole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}EntityRole">
 *       &lt;sequence>
 *         &lt;element name="partyRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyRoleAssociation" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPartyRoleAssociation" minOccurs="0"/>
 *         &lt;element name="PartyRoleCategorizedUsing" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfPartyRoleCategory" minOccurs="0"/>
 *         &lt;element name="PartyRolePlays" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfInvolvementRole" minOccurs="0"/>
 *         &lt;element name="PartyRoleCharValueDefinesTheConfigurationOf" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCharacteristicValue" minOccurs="0"/>
 *         &lt;element name="CalendarPartyRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCalendarPartyRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRole", propOrder = {
    "partyRoleId",
    "status",
    "name",
    "partyType",
    "partyRoleAssociation",
    "partyRoleCategorizedUsing",
    "partyRolePlays",
    "partyRoleCharValueDefinesTheConfigurationOf",
    "calendarPartyRole"
})
@XmlSeeAlso({
    Customer.class,
    CustomerAgent.class
})
public class PartyRole
    extends EntityRole
{

    @XmlElementRef(name = "partyRoleId", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyRoleId;
    @XmlElementRef(name = "status", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "name", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "partyType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyType;
    @XmlElementRef(name = "PartyRoleAssociation", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPartyRoleAssociation> partyRoleAssociation;
    @XmlElementRef(name = "PartyRoleCategorizedUsing", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPartyRoleCategory> partyRoleCategorizedUsing;
    @XmlElementRef(name = "PartyRolePlays", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInvolvementRole> partyRolePlays;
    @XmlElementRef(name = "PartyRoleCharValueDefinesTheConfigurationOf", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCharacteristicValue> partyRoleCharValueDefinesTheConfigurationOf;
    @XmlElementRef(name = "CalendarPartyRole", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCalendarPartyRole> calendarPartyRole;

    /**
     * Gets the value of the partyRoleId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPartyRoleId() {
        return partyRoleId;
    }

    /**
     * Sets the value of the partyRoleId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPartyRoleId(JAXBElement<String> value) {
        this.partyRoleId = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
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
     * Gets the value of the partyRoleAssociation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPartyRoleAssociation }{@code >}
     *
     */
    public JAXBElement<ArrayOfPartyRoleAssociation> getPartyRoleAssociation() {
        return partyRoleAssociation;
    }

    /**
     * Sets the value of the partyRoleAssociation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPartyRoleAssociation }{@code >}
     *
     */
    public void setPartyRoleAssociation(JAXBElement<ArrayOfPartyRoleAssociation> value) {
        this.partyRoleAssociation = value;
    }

    /**
     * Gets the value of the partyRoleCategorizedUsing property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPartyRoleCategory }{@code >}
     *
     */
    public JAXBElement<ArrayOfPartyRoleCategory> getPartyRoleCategorizedUsing() {
        return partyRoleCategorizedUsing;
    }

    /**
     * Sets the value of the partyRoleCategorizedUsing property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPartyRoleCategory }{@code >}
          *
     */
    public void setPartyRoleCategorizedUsing(JAXBElement<ArrayOfPartyRoleCategory> value) {
        this.partyRoleCategorizedUsing = value;
    }

    /**
     * Gets the value of the partyRolePlays property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfInvolvementRole }{@code >}
     *
          */
    public JAXBElement<ArrayOfInvolvementRole> getPartyRolePlays() {
        return partyRolePlays;
    }

    /**
     * Sets the value of the partyRolePlays property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfInvolvementRole }{@code >}
     *
          */
         public void setPartyRolePlays(JAXBElement<ArrayOfInvolvementRole> value) {
        this.partyRolePlays = value;
    }

    /**
     * Gets the value of the partyRoleCharValueDefinesTheConfigurationOf property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCharacteristicValue }{@code >}
     *
     */
         public JAXBElement<ArrayOfCharacteristicValue> getPartyRoleCharValueDefinesTheConfigurationOf() {
        return partyRoleCharValueDefinesTheConfigurationOf;
    }

    /**
     * Sets the value of the partyRoleCharValueDefinesTheConfigurationOf property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCharacteristicValue }{@code >}
     *
     */
         public void setPartyRoleCharValueDefinesTheConfigurationOf(JAXBElement<ArrayOfCharacteristicValue> value) {
        this.partyRoleCharValueDefinesTheConfigurationOf = value;
    }

    /**
     * Gets the value of the calendarPartyRole property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCalendarPartyRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfCalendarPartyRole> getCalendarPartyRole() {
        return calendarPartyRole;
    }

    /**
     * Sets the value of the calendarPartyRole property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCalendarPartyRole }{@code >}
     *
     */
    public void setCalendarPartyRole(JAXBElement<ArrayOfCalendarPartyRole> value) {
        this.calendarPartyRole = value;
    }

}
