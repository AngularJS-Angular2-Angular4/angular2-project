
package com.sforce.soap.schemas._class.ws_acq_leads;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConvertLeadResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConvertLeadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertLeadResponse", propOrder = {
    "messageCode",
    "messageDesc",
    "opportunityId",
    "opportunityUrl",
    "owner"
})
public class ConvertLeadResponse {

    @XmlElementRef(name = "MessageCode", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageCode;
    @XmlElementRef(name = "MessageDesc", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageDesc;
    @XmlElementRef(name = "OpportunityId", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityId;
    @XmlElementRef(name = "OpportunityUrl", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityUrl;
    @XmlElementRef(name = "Owner", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> owner;

    /**
     * Gets the value of the messageCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMessageCode(JAXBElement<String> value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the messageDesc property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMessageDesc() {
        return messageDesc;
    }

    /**
     * Sets the value of the messageDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMessageDesc(JAXBElement<String> value) {
        this.messageDesc = value;
    }

    /**
     * Gets the value of the opportunityId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOpportunityId(JAXBElement<String> value) {
        this.opportunityId = value;
    }

    /**
     * Gets the value of the opportunityUrl property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOpportunityUrl() {
        return opportunityUrl;
    }

    /**
     * Sets the value of the opportunityUrl property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOpportunityUrl(JAXBElement<String> value) {
        this.opportunityUrl = value;
    }

    /**
     * Gets the value of the owner property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOwner(JAXBElement<String> value) {
        this.owner = value;
    }

}
