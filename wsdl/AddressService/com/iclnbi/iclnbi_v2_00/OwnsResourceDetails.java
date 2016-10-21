
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnsResourceDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OwnsResourceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCustomer" minOccurs="0"/>
 *         &lt;element name="PartyRole" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}PartyRole" minOccurs="0"/>
 *         &lt;element name="CustomerAgent" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCustomerAgent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnsResourceDetails", propOrder = {
    "customer",
    "partyRole",
    "customerAgent"
})
public class OwnsResourceDetails
    extends Entity
{

    @XmlElementRef(name = "Customer", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomer> customer;
    @XmlElementRef(name = "PartyRole", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PartyRole> partyRole;
    @XmlElementRef(name = "CustomerAgent", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomerAgent> customerAgent;

    /**
     * Gets the value of the customer property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}
     *
     */
    public JAXBElement<ArrayOfCustomer> getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}
     *
     */
    public void setCustomer(JAXBElement<ArrayOfCustomer> value) {
        this.customer = value;
    }

    /**
     * Gets the value of the partyRole property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PartyRole }{@code >}
     *
     */
    public JAXBElement<PartyRole> getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PartyRole }{@code >}
     *
     */
    public void setPartyRole(JAXBElement<PartyRole> value) {
        this.partyRole = value;
    }

    /**
     * Gets the value of the customerAgent property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomerAgent }{@code >}
     *
     */
    public JAXBElement<ArrayOfCustomerAgent> getCustomerAgent() {
        return customerAgent;
    }

    /**
     * Sets the value of the customerAgent property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCustomerAgent }{@code >}
     *
     */
    public void setCustomerAgent(JAXBElement<ArrayOfCustomerAgent> value) {
        this.customerAgent = value;
    }

}
