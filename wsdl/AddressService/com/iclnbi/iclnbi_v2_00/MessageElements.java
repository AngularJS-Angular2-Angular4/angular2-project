
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageElements complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MessageElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorList" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="MessageAddressing" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}MessageAddressing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageElements", propOrder = {
    "messageStatus",
    "messageType",
    "errorList",
    "messageAddressing"
})
public class MessageElements {

    @XmlElementRef(name = "messageStatus", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageStatus;
    @XmlElementRef(name = "messageType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageType;
    @XmlElementRef(name = "ErrorList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfError> errorList;
    @XmlElementRef(name = "MessageAddressing", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MessageAddressing> messageAddressing;

    /**
     * Gets the value of the messageStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMessageStatus(JAXBElement<String> value) {
        this.messageStatus = value;
    }

    /**
     * Gets the value of the messageType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMessageType(JAXBElement<String> value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the errorList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}
     *
     */
    public JAXBElement<ArrayOfError> getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}
     *
     */
    public void setErrorList(JAXBElement<ArrayOfError> value) {
        this.errorList = value;
    }

    /**
     * Gets the value of the messageAddressing property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MessageAddressing }{@code >}
     *
     */
    public JAXBElement<MessageAddressing> getMessageAddressing() {
        return messageAddressing;
    }

    /**
     * Sets the value of the messageAddressing property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MessageAddressing }{@code >}
     *
     */
    public void setMessageAddressing(JAXBElement<MessageAddressing> value) {
        this.messageAddressing = value;
    }

}
