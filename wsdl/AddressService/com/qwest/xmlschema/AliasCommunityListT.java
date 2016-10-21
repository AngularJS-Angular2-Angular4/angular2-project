
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasCommunityListT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AliasCommunityListT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AliasCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AliasCommunityInd" type="{http://www.qwest.com/XMLSchema}AliasCommunityListTAliasCommunityInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasCommunityListT", propOrder = {
    "aliasCommunity",
    "aliasCommunityInd"
})
public class AliasCommunityListT {

    @XmlElementRef(name = "AliasCommunity", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasCommunity;
    @XmlElement(name = "AliasCommunityInd")
    @XmlSchemaType(name = "string")
    protected AliasCommunityListTAliasCommunityInd aliasCommunityInd;

    /**
     * Gets the value of the aliasCommunity property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAliasCommunity() {
        return aliasCommunity;
    }

    /**
     * Sets the value of the aliasCommunity property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAliasCommunity(JAXBElement<String> value) {
        this.aliasCommunity = value;
    }

    /**
     * Gets the value of the aliasCommunityInd property.
     *
     * @return
     *     possible object is
     *     {@link AliasCommunityListTAliasCommunityInd }
     *
     */
    public AliasCommunityListTAliasCommunityInd getAliasCommunityInd() {
        return aliasCommunityInd;
    }

    /**
     * Sets the value of the aliasCommunityInd property.
     *
     * @param value
     *     allowed object is
     *     {@link AliasCommunityListTAliasCommunityInd }
     *
     */
    public void setAliasCommunityInd(AliasCommunityListTAliasCommunityInd value) {
        this.aliasCommunityInd = value;
    }

}
