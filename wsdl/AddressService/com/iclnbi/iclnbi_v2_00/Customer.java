
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PartyRole">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masterCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICSCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactableViaTelephoneNumber" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfTelephoneNumber" minOccurs="0"/>
 *         &lt;element name="ContactableViaEmail" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEmailContact" minOccurs="0"/>
 *         &lt;element name="ContactableViaFaxNumber" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfFaxNumber" minOccurs="0"/>
 *         &lt;element name="PostalContact" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfAmericanPropertyAddress" minOccurs="0"/>
 *         &lt;element name="CustomerPosseses" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCustomerAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "id",
    "customerStatus",
    "acna",
    "customerRank",
    "masterCustomerNumber",
    "icscCode",
    "contactableViaTelephoneNumber",
    "contactableViaEmail",
    "contactableViaFaxNumber",
    "postalContact",
    "customerPosseses"
})
public class Customer
    extends PartyRole
{

    @XmlElementRef(name = "ID", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "customerStatus", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerStatus;
    @XmlElementRef(name = "ACNA", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acna;
    @XmlElementRef(name = "customerRank", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerRank;
    @XmlElementRef(name = "masterCustomerNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterCustomerNumber;
    @XmlElementRef(name = "ICSCCode", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icscCode;
    @XmlElementRef(name = "ContactableViaTelephoneNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTelephoneNumber> contactableViaTelephoneNumber;
    @XmlElementRef(name = "ContactableViaEmail", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmailContact> contactableViaEmail;
    @XmlElementRef(name = "ContactableViaFaxNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFaxNumber> contactableViaFaxNumber;
    @XmlElementRef(name = "PostalContact", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAmericanPropertyAddress> postalContact;
    @XmlElementRef(name = "CustomerPosseses", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomerAccount> customerPosseses;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setID(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the customerStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCustomerStatus() {
        return customerStatus;
    }

    /**
     * Sets the value of the customerStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCustomerStatus(JAXBElement<String> value) {
        this.customerStatus = value;
    }

    /**
     * Gets the value of the acna property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getACNA() {
        return acna;
    }

    /**
     * Sets the value of the acna property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setACNA(JAXBElement<String> value) {
        this.acna = value;
    }

    /**
     * Gets the value of the customerRank property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCustomerRank() {
        return customerRank;
    }

    /**
     * Sets the value of the customerRank property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCustomerRank(JAXBElement<String> value) {
        this.customerRank = value;
    }

    /**
     * Gets the value of the masterCustomerNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
     */
    public JAXBElement<String> getMasterCustomerNumber() {
        return masterCustomerNumber;
    }

    /**
     * Sets the value of the masterCustomerNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
          *
          */
    public void setMasterCustomerNumber(JAXBElement<String> value) {
        this.masterCustomerNumber = value;
    }

    /**
     * Gets the value of the icscCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
          */
         public JAXBElement<String> getICSCCode() {
        return icscCode;
    }

    /**
     * Sets the value of the icscCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
         public void setICSCCode(JAXBElement<String> value) {
        this.icscCode = value;
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

    /**
     * Gets the value of the customerPosseses property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomerAccount }{@code >}
     *
     */
    public JAXBElement<ArrayOfCustomerAccount> getCustomerPosseses() {
        return customerPosseses;
    }

    /**
     * Sets the value of the customerPosseses property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomerAccount }{@code >}
     *
     */
    public void setCustomerPosseses(JAXBElement<ArrayOfCustomerAccount> value) {
        this.customerPosseses = value;
    }

}
