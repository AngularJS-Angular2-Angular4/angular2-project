
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressConnectionT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddressConnectionT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InEffectPdgInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MainLineInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PendingServiceRequest" type="{http://www.qwest.com/XMLSchema}PendingServiceRequestT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressConnectionT", propOrder = {
    "inEffectPdgInd",
    "mainLineInd",
    "pendingServiceRequest"
})
public class AddressConnectionT {

    @XmlElement(name = "InEffectPdgInd")
    protected Boolean inEffectPdgInd;
    @XmlElement(name = "MainLineInd")
    protected Boolean mainLineInd;
    @XmlElementRef(name = "PendingServiceRequest", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<PendingServiceRequestT> pendingServiceRequest;

    /**
     * Gets the value of the inEffectPdgInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isInEffectPdgInd() {
        return inEffectPdgInd;
    }

    /**
     * Sets the value of the inEffectPdgInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setInEffectPdgInd(Boolean value) {
        this.inEffectPdgInd = value;
    }

    /**
     * Gets the value of the mainLineInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMainLineInd() {
        return mainLineInd;
    }

    /**
     * Sets the value of the mainLineInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMainLineInd(Boolean value) {
        this.mainLineInd = value;
    }

    /**
     * Gets the value of the pendingServiceRequest property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PendingServiceRequestT }{@code >}
     *
     */
    public JAXBElement<PendingServiceRequestT> getPendingServiceRequest() {
        return pendingServiceRequest;
    }

    /**
     * Sets the value of the pendingServiceRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link PendingServiceRequestT }{@code >}
     *
     */
    public void setPendingServiceRequest(JAXBElement<PendingServiceRequestT> value) {
        this.pendingServiceRequest = value;
    }

}
