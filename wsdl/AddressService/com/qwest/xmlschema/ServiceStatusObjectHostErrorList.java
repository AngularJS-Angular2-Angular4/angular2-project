
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStatusObjectHostErrorList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceStatusObjectHostErrorList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorList" type="{http://www.qwest.com/XMLSchema}ArrayOfErrorList" minOccurs="0"/>
 *         &lt;element name="HostId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceStatusObjectHostErrorList", propOrder = {
    "errorList",
    "hostId"
})
public class ServiceStatusObjectHostErrorList {

    @XmlElementRef(name = "ErrorList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfErrorList> errorList;
    @XmlElementRef(name = "HostId", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostId;

    /**
     * Gets the value of the errorList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfErrorList }{@code >}
     *
     */
    public JAXBElement<ArrayOfErrorList> getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfErrorList }{@code >}
     *
     */
    public void setErrorList(JAXBElement<ArrayOfErrorList> value) {
        this.errorList = value;
    }

    /**
     * Gets the value of the hostId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getHostId() {
        return hostId;
    }

    /**
     * Sets the value of the hostId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setHostId(JAXBElement<String> value) {
        this.hostId = value;
    }

}
