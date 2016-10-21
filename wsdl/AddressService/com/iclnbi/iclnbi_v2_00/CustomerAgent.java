
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAgent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CustomerAgent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PartyRole">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactableViaTelephoneNumber" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTelephoneNumber" minOccurs="0"/>
 *         &lt;element name="ContactableViaEmail" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEmailContact" minOccurs="0"/>
 *         &lt;element name="ContactableViaFaxNumber" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfFaxNumber" minOccurs="0"/>
 *         &lt;element name="PostalContact" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfAmericanPropertyAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAgent", propOrder = {
    "type",
    "drc",
    "contactableViaTelephoneNumber",
    "contactableViaEmail",
    "contactableViaFaxNumber",
    "postalContact"
})
public class CustomerAgent
    extends PartyRole
{

    @XmlElementRef(name = "type", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "DRC", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drc;
    @XmlElementRef(name = "ContactableViaTelephoneNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTelephoneNumber> contactableViaTelephoneNumber;
    @XmlElementRef(name = "ContactableViaEmail", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmailContact> contactableViaEmail;
    @XmlElementRef(name = "ContactableViaFaxNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFaxNumber> contactableViaFaxNumber;
    @XmlElementRef(name = "PostalContact", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAmericanPropertyAddress> postalContact;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the drc property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDRC() {
        return drc;
    }

    /**
     * Sets the value of the drc property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDRC(JAXBElement<String> value) {
        this.drc = value;
    }

    /**
     * Gets the value of the contactableViaTelephoneNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTelephoneNumber }{@code >}
     *
     */
    public JAXBElement<ArrayOfTelephoneNumber> getContactableViaTelephoneNumber() {
        return contactableViaTelephoneNumber;
    }

    /**
     * Sets the value of the contactableViaTelephoneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfTelephoneNumber }{@code >}
     *
     */
    public void setContactableViaTelephoneNumber(JAXBElement<ArrayOfTelephoneNumber> value) {
        this.contactableViaTelephoneNumber = value;
    }

    /**
     * Gets the value of the contactableViaEmail property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEmailContact }{@code >}
     *
     */
    public JAXBElement<ArrayOfEmailContact> getContactableViaEmail() {
        return contactableViaEmail;
    }

    /**
     * Sets the value of the contactableViaEmail property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEmailContact }{@code >}
     *
     */
    public void setContactableViaEmail(JAXBElement<ArrayOfEmailContact> value) {
        this.contactableViaEmail = value;
    }

    /**
     * Gets the value of the contactableViaFaxNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfFaxNumber }{@code >}
     *
     */
    public JAXBElement<ArrayOfFaxNumber> getContactableViaFaxNumber() {
        return contactableViaFaxNumber;
    }

    /**
     * Sets the value of the contactableViaFaxNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfFaxNumber }{@code >}
          *
     */
    public void setContactableViaFaxNumber(JAXBElement<ArrayOfFaxNumber> value) {
        this.contactableViaFaxNumber = value;
    }

    /**
     * Gets the value of the postalContact property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAmericanPropertyAddress }{@code >}
     *
     */
    public JAXBElement<ArrayOfAmericanPropertyAddress> getPostalContact() {
        return postalContact;
    }

    /**
     * Sets the value of the postalContact property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAmericanPropertyAddress }{@code >}
     *
     */
    public void setPostalContact(JAXBElement<ArrayOfAmericanPropertyAddress> value) {
        this.postalContact = value;
    }

}
