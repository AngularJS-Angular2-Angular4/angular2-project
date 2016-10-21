
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lastTelephone complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="lastTelephone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastNpa" type="{http://www.w3.org/namespace/}lastNpa" minOccurs="0"/>
 *         &lt;element name="lastNxx" type="{http://www.w3.org/namespace/}lastNxx" minOccurs="0"/>
 *         &lt;element name="lastDirectoryNumber" type="{http://www.w3.org/namespace/}lastDirectoryNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lastTelephone", propOrder = {
    "lastNpa",
    "lastNxx",
    "lastDirectoryNumber"
})
public class LastTelephone {

    @XmlElementRef(name = "lastNpa", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<LastNpa> lastNpa;
    @XmlElementRef(name = "lastNxx", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<LastNxx> lastNxx;
    @XmlElementRef(name = "lastDirectoryNumber", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<LastDirectoryNumber> lastDirectoryNumber;

    /**
     * Gets the value of the lastNpa property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LastNpa }{@code >}
     *
     */
    public JAXBElement<LastNpa> getLastNpa() {
        return lastNpa;
    }

    /**
     * Sets the value of the lastNpa property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LastNpa }{@code >}
     *
     */
    public void setLastNpa(JAXBElement<LastNpa> value) {
        this.lastNpa = value;
    }

    /**
     * Gets the value of the lastNxx property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LastNxx }{@code >}
     *
     */
    public JAXBElement<LastNxx> getLastNxx() {
        return lastNxx;
    }

    /**
     * Sets the value of the lastNxx property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LastNxx }{@code >}
     *
     */
    public void setLastNxx(JAXBElement<LastNxx> value) {
        this.lastNxx = value;
    }

    /**
     * Gets the value of the lastDirectoryNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LastDirectoryNumber }{@code >}
     *
     */
    public JAXBElement<LastDirectoryNumber> getLastDirectoryNumber() {
        return lastDirectoryNumber;
    }

    /**
     * Sets the value of the lastDirectoryNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LastDirectoryNumber }{@code >}
     *
     */
    public void setLastDirectoryNumber(JAXBElement<LastDirectoryNumber> value) {
        this.lastDirectoryNumber = value;
    }

}
