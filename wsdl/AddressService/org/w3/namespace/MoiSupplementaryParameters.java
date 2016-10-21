
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moiSupplementaryParameters complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="moiSupplementaryParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationEchoback" type="{http://www.w3.org/namespace/}ApplicationEchoback" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moiSupplementaryParameters", propOrder = {
    "applicationEchoback"
})
public class MoiSupplementaryParameters {

    @XmlElementRef(name = "ApplicationEchoback", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ApplicationEchoback> applicationEchoback;

    /**
     * Gets the value of the applicationEchoback property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ApplicationEchoback }{@code >}
     *
     */
    public JAXBElement<ApplicationEchoback> getApplicationEchoback() {
        return applicationEchoback;
    }

    /**
     * Sets the value of the applicationEchoback property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ApplicationEchoback }{@code >}
     *
     */
    public void setApplicationEchoback(JAXBElement<ApplicationEchoback> value) {
        this.applicationEchoback = value;
    }

}
