
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationEchoback complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ApplicationEchoback">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FNIdentity" type="{http://www.w3.org/namespace/}FNIdentity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationEchoback", propOrder = {
    "fnIdentity"
})
public class ApplicationEchoback {

    @XmlElementRef(name = "FNIdentity", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<FNIdentity> fnIdentity;

    /**
     * Gets the value of the fnIdentity property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FNIdentity }{@code >}
     *
     */
    public JAXBElement<FNIdentity> getFNIdentity() {
        return fnIdentity;
    }

    /**
     * Sets the value of the fnIdentity property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FNIdentity }{@code >}
     *
     */
    public void setFNIdentity(JAXBElement<FNIdentity> value) {
        this.fnIdentity = value;
    }

}
