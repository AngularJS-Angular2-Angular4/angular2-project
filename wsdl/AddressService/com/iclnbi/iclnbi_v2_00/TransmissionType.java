
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransmissionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TransmissionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ServiceBundle">
 *       &lt;sequence>
 *         &lt;element name="interfaceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCurrentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isSONETFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmissionType", propOrder = {
    "interfaceCategory",
    "isCurrentFlag",
    "isSONETFlag"
})
public class TransmissionType
    extends ServiceBundle
{

    @XmlElementRef(name = "interfaceCategory", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceCategory;
    @XmlElementRef(name = "isCurrentFlag", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isCurrentFlag;
    @XmlElementRef(name = "isSONETFlag", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isSONETFlag;

    /**
     * Gets the value of the interfaceCategory property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getInterfaceCategory() {
        return interfaceCategory;
    }

    /**
     * Sets the value of the interfaceCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setInterfaceCategory(JAXBElement<String> value) {
        this.interfaceCategory = value;
    }

    /**
     * Gets the value of the isCurrentFlag property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getIsCurrentFlag() {
        return isCurrentFlag;
    }

    /**
     * Sets the value of the isCurrentFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setIsCurrentFlag(JAXBElement<String> value) {
        this.isCurrentFlag = value;
    }

    /**
     * Gets the value of the isSONETFlag property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getIsSONETFlag() {
        return isSONETFlag;
    }

    /**
     * Sets the value of the isSONETFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setIsSONETFlag(JAXBElement<String> value) {
        this.isSONETFlag = value;
    }

}
