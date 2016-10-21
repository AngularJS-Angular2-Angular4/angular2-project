
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OperationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageElements" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}MessageElements" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationResponse", propOrder = {
    "messageElements"
})
@XmlSeeAlso({
    SearchResourceResponse.class
})
public class OperationResponse {

    @XmlElementRef(name = "MessageElements", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MessageElements> messageElements;

    /**
     * Gets the value of the messageElements property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MessageElements }{@code >}
     *
     */
    public JAXBElement<MessageElements> getMessageElements() {
        return messageElements;
    }

    /**
     * Sets the value of the messageElements property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MessageElements }{@code >}
     *
     */
    public void setMessageElements(JAXBElement<MessageElements> value) {
        this.messageElements = value;
    }

}
